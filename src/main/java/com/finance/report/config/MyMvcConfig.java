package com.finance.report.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xuyuyong
 * @create 2018-11-08 20:04
 * @content
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 跳转页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("dashboard");

    }
}
