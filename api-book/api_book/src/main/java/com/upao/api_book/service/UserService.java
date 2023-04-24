package com.upao.api_book.service;

import com.upao.api_book.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);
    User updateUser(Long id, User user);
    void deleteUser(Long id);

}
