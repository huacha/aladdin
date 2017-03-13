package com.moodle.aladdin.manage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by peng.zhiqiang on 2017/3/13.
 */

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    long id;

    @Column
    String name;

    @Column
    String icon;

    @Column
    String path;

    @ManyToMany(mappedBy = "menus")
    Set<Role> roles = new HashSet<>();
}
