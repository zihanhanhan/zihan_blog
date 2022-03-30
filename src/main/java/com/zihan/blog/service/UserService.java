package com.zihan.blog.service;

import com.zihan.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
