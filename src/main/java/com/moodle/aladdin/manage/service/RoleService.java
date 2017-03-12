package com.moodle.aladdin.manage.service;

import com.moodle.aladdin.manage.model.Role;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by tom on 2017/3/12.
 */
@Service
public class RoleService {
    public Set<Role> getRoles(long id) {
        return null;
    }

    public boolean authorized(long id, String s, String s1) {
        return false;
    }
}
