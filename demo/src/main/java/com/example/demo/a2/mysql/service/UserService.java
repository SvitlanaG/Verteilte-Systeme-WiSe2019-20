package com.example.demo.a2.mysql.service;

import com.example.demo.a2.mysql.web.model.UserModel;

public interface UserService {

    UserModel getUser(Long id);

    UserModel saveUser(UserModel body);

    UserModel updateUser(Long id, UserModel body);

    UserModel deleteUser(Long id);
}
