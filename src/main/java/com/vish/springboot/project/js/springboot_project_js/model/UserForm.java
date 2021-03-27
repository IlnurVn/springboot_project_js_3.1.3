package com.vish.springboot.project.js.springboot_project_js.model;

import lombok.Data;

@Data
public class UserForm {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;
    private String role;
}
