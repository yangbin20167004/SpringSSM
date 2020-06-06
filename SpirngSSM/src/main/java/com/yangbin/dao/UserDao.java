package com.yangbin.dao;

import com.yangbin.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by
 *
 * @author 風起雲落乀
 * @Date 2020/5/21/021
 * @Time 8:55
 */
public interface UserDao {
    @Select(value = "select * from tab_user")
    public List<User> findAllUser();

    @Insert(value = "insert into tab_user values(null,#{username},#{password})")
    public void addUser(User user);

    @Update(value = "update tab_user set username = #{param2.username},password=#{param2.username} where uid = #{param1.uid}")
    public void updateUser(User user,User user1);

    @Delete(value = "delete from tab_user where uid = #{uid}")
    public void deleteUser(User user);

    @Select(value = "select * from tab_user where username = #{username} and password = #{password}")
    public User findUser(User user);
}
