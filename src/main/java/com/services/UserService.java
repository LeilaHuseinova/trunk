package com.services;

import com.model.entities.User;

import java.util.List;

/**
 * @author leyla
 * @since 17.05.17
 */
public interface UserService {

    void create(String name, String email, String phoneNumber);
    void update(Long id, String email, String phoneNumber);
    void delete(Long id);
    List<User> getAll();
}
