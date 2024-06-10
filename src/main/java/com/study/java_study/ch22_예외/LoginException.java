package com.study.java_study.ch22_예외;

import lombok.Data;

@Data
public class LoginException extends RuntimeException{
    private String userName;

    public LoginException(String message, String userName) {
        super(message);
        this.userName = userName;
    }

    public String getErrorMessage() {
        return userName + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }
}
