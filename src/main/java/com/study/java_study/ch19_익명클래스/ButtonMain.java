package com.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {
        Button homeButton = new HomeButton();
        Button loginButton = new Button() {
            @Override
            public void onClick() {
                System.out.println("로그인하기");
            }
        };

        click(new Button() {
            @Override
            public void onClick() {
                System.out.println("로그아웃하기");
            }
        });

        click(loginButton);
        click(homeButton);
    }
    public static void click(Button button) {
        System.out.println(button.getClass());
        button.onClick();
    }
}

