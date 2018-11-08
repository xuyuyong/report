package com.finance.report.config;

/**
 * @author xuyuyong
 * Date: 2018/7/12
 * Time: 18:52
 * Content:
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
