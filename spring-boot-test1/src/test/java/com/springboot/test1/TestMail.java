package com.springboot.test1;

import com.springboot.test1.entity.MailSender;
import com.springboot.test1.enums.MailContentTypeEnum;

import java.util.ArrayList;

public class TestMail {
    public static void main(String[] args) throws Exception
    {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("18215576765@163.com");
                }})
                .send();
    }
}
