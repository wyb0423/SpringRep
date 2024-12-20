package com.xs.service;

import com.xs.dao.IUserDao;
import com.xs.dao.UserDao;

public class UserService {

    IUserDao userDao = new UserDao();

    public void getUser(){
        userDao.getUser();
    }
}
