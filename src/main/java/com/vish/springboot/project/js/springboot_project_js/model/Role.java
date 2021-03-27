package com.vish.springboot.project.js.springboot_project_js.model;


import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@Table(name = "roles")
@NoArgsConstructor
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
