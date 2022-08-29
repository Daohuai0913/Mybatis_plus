package com.gok.mybatis_plus.service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        图书管理系统
        while (true) {
            System.out.println("欢迎来到图书管理系统");
            System.out.println("选择您的用户类型");
            System.out.println("1.管理员");
            System.out.println("2.普通用户");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("管理员登录");
                    AdminService adminService = new AdminService();
                    adminService.mainMenu();
                    break;
                case 2:
                    System.out.println("普通用户登录");
                    break;
                case 3:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        }
    }
}
