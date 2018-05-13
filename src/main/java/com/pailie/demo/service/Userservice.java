package com.pailie.demo.service;

import com.pailie.demo.dao.UserDao;
import com.pailie.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Userservice {

    @Autowired
    private UserDao userDao;


    public User getUserbyid(int userid ){
       return userDao.getUserbyid(userid);
    }
    @Transactional
    public void insertUser(User user ){
       userDao.insertUser(user);
    }
}
