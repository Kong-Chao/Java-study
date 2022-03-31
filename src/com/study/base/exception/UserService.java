package com.study.base.exception;

public class UserService {
    public User login(String userName,String passWord) throws MyException{
        if (!"admin".equals(userName)){
            throw new MyException("用户名出错");
        }else if (!"123456".equals(passWord)){
            throw new MyException("密码错误");
        }
        User user = new User("admin","123456",18,"男");
        return user;
    }
}
