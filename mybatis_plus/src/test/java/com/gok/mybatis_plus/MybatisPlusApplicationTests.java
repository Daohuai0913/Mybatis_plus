package com.gok.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gok.mybatis_plus.dao.UserDao;
import com.gok.mybatis_plus.domain.User;
import com.gok.mybatis_plus.domain.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
////        按条件查询
//        QueryWrapper wrapper = new QueryWrapper();
////        大于20岁
//        wrapper.gt("age", 20);
//        userDao.selectList(wrapper).forEach(System.out::println);

//        方式2lamda查询
//        QueryWrapper<User> wrapper2 = new QueryWrapper<>();
//        wrapper2.lambda().gt(User::getAge, 20);
//        userDao.selectList(wrapper2).forEach(System.out::println);


//        方式3 lambda进阶
//        LambdaQueryWrapper<User> wrapper3 = new LambdaQueryWrapper<>();
//        wrapper3.ge(User::getAge, 20);
//        userDao.selectList(wrapper3).forEach(System.out::println);

////        模拟页面传递的参数
//        UserQuery userQuery = new UserQuery();
////        userQuery.setAge(20);
//        userQuery.setAge2(30);
//
////        null值不参与查询
//        LambdaQueryWrapper<User> wrapper4 = new LambdaQueryWrapper<>();
////        先判断第一个条件是否为空，不为空则拼接
//        wrapper4.lt(null != userQuery.getAge2(), User::getAge, userQuery.getAge2())
//                .gt(null != userQuery.getAge(), User::getAge, userQuery.getAge());
//        List<User> users = userDao.selectList(wrapper4);
//        System.out.println(users);


//        查询投影
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.select(User::getName, User::getAge);
//        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.select("name", "age");
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
////        等同于 =
//        lqw.eq(User::getAge, 21).select(User::getName, User::getAge);
//        List<Map<String,Object>> users = userDao.selectMaps(lqw);
//        System.out.println(users);

    }

    @Test
    void testInsert() {
//        User user = new User();
//        user.setAge(21);
//        user.setName("huai");
//        user.setPassword("123");
//        user.setTel("123456789");
//        userDao.insert(user);
    }

    @Test
    void demo5(){
        File file = new File("E");
//        String[] list = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".txt");
//            }
//        });

//        lambda表达式修改
        System.out.println(file.list((dir, name) -> name.endsWith(".txt")));
        System.out.println();


    }

    @Test
    public void deleteUser() {
        userDao.deleteById(1561552493984645121L);
    }

    @Test
    public void testUpdate() {
//        User user = new User();
//        user.setName("Tom666");
//        user.setId(1L);
//
//        userDao.updateById(user);
    }

    @Test
    void testGetBypage() {

//        selcet * from user where age > ? and age < ? order by age desc limit ?,?
//        需要增加拦截器 在mybatis-plus.xml中配置
//        <plugin type="com.baomidou.mybatisplus.extension.plugins.pagination.PageInterceptor"/>
//        类似aop

//        IPage page = new Page(1, 2);
//        userDao.selectPage(page, null);
//        System.out.println(page.getCurrent() + "当前页面值");
//        System.out.println(page.getSize() + "每页显示的条数");
//        System.out.println(page.getTotal() + "总条数");
//        System.out.println(page.getPages() + "总页数");
//        System.out.println(page.getRecords() + "当前页面的数据");
    }

}
