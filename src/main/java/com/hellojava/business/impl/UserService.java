package com.hellojava.business.impl;

import com.hellojava.business.IUserService;
import com.hellojava.dao.IUserDao;
import com.hellojava.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘旭
 * @Data 2019/9/21 16:17
 */
@Service("userService")
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> loadAll() {
        List<User> users = userDao.loadAll();
        return users;
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public User loadById(int id) {
        User user = userDao.loadById(id);
        return user;
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void deletepl(List<Integer> ids) {
        userDao.deletepl(ids);
    }
}
