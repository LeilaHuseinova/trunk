package com.dao;

import com.model.entities.User;

import java.util.List;

/**
 * @author leyla
 * @since 10.06.17
 */
public interface UserDAO {
    
    Long getCountByName(String name);
    void save(User user);
    User getById(Long id);
    void delete(User user);
    List<User> getAll();
}
