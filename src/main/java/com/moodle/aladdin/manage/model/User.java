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
public class User {
    @Id
    @GeneratedValue
    long id;

    @Column
    String name;

    @Column
    String password;

    @ManyToMany
    Set<Role> roles = new HashSet<>();
}
