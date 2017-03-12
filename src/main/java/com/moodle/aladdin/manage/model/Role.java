package com.moodle.aladdin.manage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tom on 2017/3/12.
 */

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue
    long id;

    @Column
    String name;

    @ManyToMany(mappedBy = "roles")
    Set<User> users = new HashSet<>();

    @ManyToMany
    Set<Permission> permissions = new HashSet<>();
}
