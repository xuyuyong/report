package com.finance.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author xuyuyong
 * @create 2018-11-08 20:00
 * @content
 */
@Controller
public class IndexAction {

    @GetMapping("/index")
    public String index(){
        return "main";
    }
}
