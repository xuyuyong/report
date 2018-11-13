package com.finance.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuyuyong
 * @create 2018-11-13 9:54
 * @content
 */
@Controller
public class ReportAction {

    @GetMapping("/table")
    public String index(){
        return "emp/table_data_tables";
    }
}
