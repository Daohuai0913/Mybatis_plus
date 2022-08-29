package com.gok.mybatis_plus.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gok.mybatis_plus.dao.AdminDao;
import com.gok.mybatis_plus.dao.BookDao;
import com.gok.mybatis_plus.dao.TagDao;
import com.gok.mybatis_plus.dao.UserDao;
import com.gok.mybatis_plus.domain.Admin;
import com.gok.mybatis_plus.domain.Book;
import com.gok.mybatis_plus.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

/**
 * @author huai
 * 图书管理员服务
 */
@Service
public class AdminService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private TagDao tagDao;


    private Admin admin;

    private Tag tag;

    private Book book;


    public void register(String username,String password) {
        admin.setAdminName(username);
        admin.setAdminPassword(password);
        adminDao.insert(admin);
    }


    public  void logout() {
        System.out.println("输入用户名");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("输入密码");
        String password = sc.next();
        admin.setAdminName(username);
        admin.setAdminPassword(password);
        LambdaQueryWrapper<Admin> wrapper3 = new LambdaQueryWrapper<>();
        wrapper3.eq(Admin::getAdminName, username).eq(Admin::getAdminPassword, password);
        adminDao.selectOne(wrapper3);
    }

//    public List<Book> searchBook(String bookName) {
//        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(Book::getBookName,bookName);
//        return bookDao.selectList(wrapper);
//    }
//
////    根据作者查找
//    public List<Book> searchBookByAuthor(String author) {
//        QueryWrapper<Book> wrapper = new QueryWrapper<>();
//        wrapper.select("author");
//        wrapper.eq(author = #{author},author);
//        List<Book> books = bookDao.selectList(wrapper);
//        return books;
//    }

//    根据类型查找
    public List<Book> searchBookByType(String type) {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        bookDao.selectList(wrapper);
        return bookDao.selectList(wrapper);
    }

//    查找全部书籍
    public List<Book> searchAllBook() {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        bookDao.selectList(wrapper);
        return bookDao.selectList(wrapper);
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
        while (true) {
            System.out.println("1.查看所有用户");
            System.out.println("2.查看用户信息");
            System.out.println("3.删除用户");
            System.out.println("4.返回上一级");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("查看所有用户");
                    List<Book> books = searchAllBook();
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    System.out.println("查看用户信息");
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();
                    break;
                case 3:
                    System.out.println("删除用户");
                    System.out.println("输入用户名");
                    String username1 = sc.next();
                    System.out.println("输入密码");
                    String password1 = sc.next();
                    break;
                case 4:
                    System.out.println("返回上一级");
                    mainMenu();
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }

    }

    private void bookMenu() {
        do {
            System.out.println("1.查看所有书籍");
            System.out.println("2.查看书籍信息");
            System.out.println("3.添加书籍标签");
            System.out.println("4.添加书籍");
            System.out.println("5.返回上一级");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("查看所有书籍");
                    List<Book> books = searchAllBook();
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    System.out.println("查看书籍信息");
                    System.out.println("输入书名");
                    String bookName = sc.next();
                    List<Book> books1 = searchBook(bookName);
                    for (Book book : books1) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.println("删除书籍");
                    System.out.println("输入书名");
                    String bookName1 = sc.next();
                    addTag(bookName1);
                    break;
                case 4:
                    System.out.println("添加书籍");
                    System.out.println("输入书名");
                    String bookName2 = sc.next();
                    System.out.println("输入作者");
                    String author = sc.next();
                    System.out.println("输入数量");
                    int number = sc.nextInt();
                    addBook(bookName2, author, number);
                    break;
                case 5:
                    System.out.println("返回上一级");
                    mainMenu();
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        } while (true);
    }

    private List<Book> searchBook(String bookName) {
        return null;
    }

    private void addBook(String bookName2, String author, int number) {
        book.setBookName(bookName2);
        book.setBookAuthor(author);
        book.setNumber(number);
        bookDao.insert(book);


    }

    private void addTag(String tagName) {
        tag.setTagName(tagName);
        tagDao.insert(tag);
    }
}
