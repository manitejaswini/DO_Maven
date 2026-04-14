package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private LoginRepo rep;

    public Login log(String username, String password) {
        Login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}