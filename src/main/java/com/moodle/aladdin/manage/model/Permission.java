package com.moodle.aladdin.manage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tom on 2017/3/13.
 */
@Data
@Entity
public class Permission {
    @Id
    @GeneratedValue
    long id;

    @Column
    String name;

    @ManyToMany(mappedBy = "permissions")
    Set<Role> roles = new HashSet<>();
}
