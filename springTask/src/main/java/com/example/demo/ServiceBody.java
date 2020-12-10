package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBody implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<UserDetails> getUserDetails() {
        return userDao.findAll();
    }

    @Override
    public UserDetails addUser(UserDetails userDetails) {
        userDao.save(userDetails);
        return userDetails;
    }

    @Override
    public UserDetails updateUser(UserDetails userDetails) {
        userDao.save(userDetails);
        return userDetails;
    }

    @Override
    public void deleteUser(long userId) {
        userDao.delete(userDao.getOne(userId));
    }


}
