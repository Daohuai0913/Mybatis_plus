package com.gok.mybatis_plus.service;

import java.util.Scanner;

/**
 * @author huai
 * 图书管理员服务
 */
public class AdminService {

    public  void logout() {
        System.out.println("输入用户名");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("输入密码");
        String password = sc.next();
        if ("admin".equals(username) && "123456".equals(password)) {
            System.out.println("登录成功");
            mainMenu();
        } else {
            System.out.println("登录失败");
        }
    }


//    主菜单
    public void mainMenu() {
        while (true) {
            System.out.println("欢迎来到图书管理系统");
            System.out.println("1.图书管理");
            System.out.println("2.用户管理");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("图书管理");
                    bookMenu();
                    break;
                case 2:
                    System.out.println("用户管理");
                    userMenu();
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

    private void userMenu() {


    }

    private void bookMenu() {

    }
}
