package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("book dao constructor save ...");
    }

    public BookDaoImpl(int i) {
        System.out.println("book dao constructor save ...");
    }

    public void save() {
        System.out.println("book dao save ...");
    }
}
