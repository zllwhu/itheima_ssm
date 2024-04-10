package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class AppSystemProperties {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) ctx.getBean("dataSourceDruid");
//        System.out.println(dataSource);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}