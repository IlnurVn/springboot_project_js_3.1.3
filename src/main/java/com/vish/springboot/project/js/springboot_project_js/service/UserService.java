package com.vish.springboot.project.js.springboot_project_js.service;


import com.vish.springboot.project.js.springboot_project_js.model.Role;
import com.vish.springboot.project.js.springboot_project_js.model.User;
import com.vish.springboot.project.js.springboot_project_js.model.UserForm;

import java.util.List;

public interface UserService {

    void createUser(UserForm userForm);

    List<User> readAllUsers();

    User readUser(long id);

    void updateUser(UserForm userForm);

    void deleteUser(long id);

    boolean validateUser(User user);

    List<Role> getRolesByUserId(long id);

    User getUserByEmail(String email);

    String curUserEmail();
}
