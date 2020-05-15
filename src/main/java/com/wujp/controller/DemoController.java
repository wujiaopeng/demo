package com.wujp.controller;

import com.wujp.common.utils.JdbcUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;


@Controller
@RequestMapping("/")
public class DemoController {

    @GetMapping("/list")
    @ResponseBody
    public Object getList(){
        String sql="select * from sys_menu";
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println("============"+localDateTime.toLocalDate());
        return JdbcUtil.queryList(sql);
    }

    @GetMapping("/addUser")
    @ResponseBody
    public Object addUser(){
        return null;
    }
}
