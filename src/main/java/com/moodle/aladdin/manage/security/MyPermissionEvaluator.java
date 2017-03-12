package com.moodle.aladdin.manage.security;

import com.moodle.aladdin.manage.model.User;
import com.moodle.aladdin.manage.service.LoginService;
import com.moodle.aladdin.manage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by tom on 2017/3/13.
 */
@Component
public class MyPermissionEvaluator implements PermissionEvaluator {
    @Autowired
    private LoginService loginService;
    @Autowired
    private RoleService roleService;
    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        String username = authentication.getName();
        User user = loginService.findByUsername(username).get();
        return roleService.authorized(user.getId(), targetDomainObject.toString(), permission.toString());
    }
    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        // not supported
        return false;
    }
}
