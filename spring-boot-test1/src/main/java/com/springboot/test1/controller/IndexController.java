package com.springboot.test1.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot.test1.entity.User;
import com.springboot.test1.jpa.UserJpa;
import com.springboot.test1.utils.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserJpa userJpa;

    @GetMapping("/login_view")
    private String login_view(){
        return "login";
    }

    @GetMapping("/index")
    private String index(){
        return "index";
    }

    @GetMapping("/login")
    @ResponseBody
    private String login(User user, HttpServletRequest request){

        JSONObject obj = new JSONObject();
        obj.put("msg","用户："+user.getName()+"，登录成功。");
        request.setAttribute(LoggerUtils.LOGGER_RETURN,obj);
        String result  = "登录成功！";
        Optional<User> use = userJpa.findOne(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"),user.getName()));//只判断用户是否存在
                return null;
            }
        });

        if(!use.isPresent()){
            result = "用户不存在";
        }else{
            request.getSession().setAttribute("id",use.get().getId());//将用户Id放在session中
            request.getSession().setAttribute("User",use.get());//将用户整体放在session中
        }

        return result;
    }
}
