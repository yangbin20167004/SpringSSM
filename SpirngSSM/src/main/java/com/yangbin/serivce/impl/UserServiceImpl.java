package com.yangbin.serivce.impl;

import com.yangbin.dao.UserDao;
import com.yangbin.pojo.User;
import com.yangbin.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by
 *
 * @author 風起雲落乀
 * @Date 2020/5/21/021
 * @Time 9:08
 */
@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();

    }

    @Override
    public void addUser(User user) {
userDao.addUser(user);
    }

    @Override
    public void updateUser(User user, User user1) {
userDao.updateUser(user,user1);
    }

    @Override
    public void deleteUser(User user) {
userDao.deleteUser(user);
    }

    @Override
    public User findUser(User user) {
        return userDao.findUser(user);
    }
}
