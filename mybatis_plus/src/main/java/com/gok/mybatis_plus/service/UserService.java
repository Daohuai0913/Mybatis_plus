package com.gok.mybatis_plus.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gok.mybatis_plus.dao.BookDao;
import com.gok.mybatis_plus.dao.TagDao;
import com.gok.mybatis_plus.dao.UserDao;
import com.gok.mybatis_plus.domain.Book;
import com.gok.mybatis_plus.domain.User;

import java.util.Scanner;

public class UserService {

    Scanner scanner = new Scanner(System.in);

    User user;

    TagDao tagDao;

    BookDao bookDao;

    UserDao userDao;

/**
 * 主菜单
 */
    public void mainMenu() {
        while(true){
            System.out.println("欢迎来到图书管理系统");
            System.out.println("1.用户登陆");
            System.out.println("2.用户注册");
            System.out.println("3.书籍搜索");
            System.out.println("4.书籍借阅");
            System.out.println("5.书籍归还");
            System.out.println("6.退出");
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println("用户登陆");
                    System.out.println("输入用户名");
                    String username = scanner.next();
                    System.out.println("输入密码");
                    String password = scanner.next();
                    user.setUsername(username);
                    user.setPassword(password);
                    login(user);

                    break;
                case 2:
                    System.out.println("用户注册");
                    System.out.println("输入用户名");
                    String username1 = scanner.next();
                    System.out.println("输入密码");
                    String password1 = scanner.next();
                    user.setUsername(username1);
                    user.setPassword(password1);
                    register(user);
                    break;
                case 3:
                    System.out.println("书籍搜索");
                    System.out.println(tagDao.selectList(null));
                    System.out.println("输入书籍名");
                    String bookName = scanner.next();
                    System.out.println("输入作者名");
                    String authorName = scanner.next();
                    System.out.println("输入标签名");
                    String tagName = scanner.next();
                    search(bookName,authorName,tagName);
                    break;
                case 4:
                    System.out.println("书籍借阅");
                    System.out.println("输入书籍号");
                    long bookId = scanner.nextInt();
                    System.out.println("输入数量");
                    int num = scanner.nextInt();
                    System.out.println("输入借阅天数");
                    int days = scanner.nextInt();
                    System.out.println("请确定是否借阅");
                    System.out.println("Y.是");
                    System.out.println("N.否");
                    String isBorrow = scanner.next();
                    if (isBorrow.equals("Y")){
                        borrow(bookId,num,days);
                    }else {
                        System.out.println("取消借阅");
                    }




                    break;
                case 5:
                    System.out.println("书籍归还");
                    break;
                case 6:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    private void borrow(long bookId, int num,int days) {

    }

    private void search(String bookName, String authorName, String tagName) {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Book::getBookName,bookName).or().like(Book::getBookAuthor,authorName).or().like(Book::getBookTag,tagName);
        System.out.println(bookDao.selectList(wrapper));

    }

    private void register(User user) {
        userDao.insert(user);
    }

    private void login(User user) {
        userDao.selectOne(new LambdaQueryWrapper<User>().eq(User::getUsername,user.getUsername()).eq(User::getPassword,user.getPassword()));
    }

//    借阅系统

}
