package com.hellojava.dao;

import com.hellojava.entity.User;

import java.util.List;

/**
 * @author 刘旭
 * @Data 2019/9/21 16:06
 */
public interface IUserDao {
    public List<User> loadAll();
    public void delete(int id);
    public User loadById(int id);
    public void update(User user);
    public void add(User user);

}
