package com.yangbin.serivce;

import com.yangbin.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by
 *
 * @author 風起雲落乀
 * @Date 2020/5/21/021
 * @Time 9:07
 */

public interface UserService {
    public List<User> findAllUser();

 public void addUser(User user);


    public void updateUser(User user,User user1);


    public void deleteUser(User user);

    public User findUser(User user);
}
