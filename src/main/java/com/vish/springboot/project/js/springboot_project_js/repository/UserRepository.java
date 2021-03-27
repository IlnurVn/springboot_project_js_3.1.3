package com.vish.springboot.project.js.springboot_project_js.repository;


import com.vish.springboot.project.js.springboot_project_js.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
