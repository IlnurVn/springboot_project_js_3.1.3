package com.vish.springboot.project.js.springboot_project_js.service;

import com.vish.springboot.project.js.springboot_project_js.model.Role;
import com.vish.springboot.project.js.springboot_project_js.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserService userService;


    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.getUserByEmail(email);
        Set<GrantedAuthority> roles = new HashSet<>();

        List<Role> userRoles = userService.getRolesByUserId(user.getId());
        for (Role r : userRoles) {
            roles.add(new SimpleGrantedAuthority(r.getName()));
        }

        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), roles);

        return userDetails;
    }
}
