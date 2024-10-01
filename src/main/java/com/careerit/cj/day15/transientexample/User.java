package com.careerit.cj.day15.transientexample;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String username;
    transient String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + "]";
    }
}
