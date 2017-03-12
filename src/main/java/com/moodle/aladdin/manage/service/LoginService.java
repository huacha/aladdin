package com.moodle.aladdin.manage.service;

import com.moodle.aladdin.manage.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by tom on 2017/3/12.
 */
@Service
public class LoginService {

    public Optional<User> findByUsername(String username) {
        return null;
    }
}
