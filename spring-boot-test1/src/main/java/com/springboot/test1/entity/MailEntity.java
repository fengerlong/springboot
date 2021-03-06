package com.springboot.test1.entity;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

public class MailEntity {

    //smtp服务器
    private String smtpService;
    // 端口号
    private String smtpPort;
    //设置发送邮箱
    private String fromMailAddress;
    //发送邮箱的stmp口令
    private String fromMailStmpPwd;
    //设置邮件标题
    private String title;
    //设置邮件内容
    private String content;
    //内容格式
    private String contentType;
    //接收邮件地址集合
    private List<String> list = new ArrayList<>();

    public MailEntity() {

    }

    public MailEntity(String smtpService, String smtpPort, String fromMailAddress, String fromMailStmpPwd, String title, String content, String contentType, List<String> list) {
        this.smtpService = smtpService;
        this.smtpPort = smtpPort;
        this.fromMailAddress = fromMailAddress;
        this.fromMailStmpPwd = fromMailStmpPwd;
        this.title = title;
        this.content = content;
        this.contentType = contentType;
        this.list = list;
    }

    public String getSmtpService() {
        return smtpService;
    }

    public void setSmtpService(String smtpService) {
        this.smtpService = smtpService;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getFromMailAddress() {
        return fromMailAddress;
    }

    public void setFromMailAddress(String fromMailAddress) {
        this.fromMailAddress = fromMailAddress;
    }

    public String getFromMailStmpPwd() {
        return fromMailStmpPwd;
    }

    public void setFromMailStmpPwd(String fromMailStmpPwd) {
        this.fromMailStmpPwd = fromMailStmpPwd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
