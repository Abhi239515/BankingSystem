package com.abhi.onlinebanking.service;

import com.abhi.onlinebanking.entity.User;
import com.abhi.onlinebanking.security.UserRole;

import java.util.List;
import java.util.Set;



public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save(User user);

    User createUser(User user, Set<UserRole> userRoles);

    User saveUser(User user);

    List<User> findUserList();

    void enableUser(String username);

    void disableUser(String username);

}
