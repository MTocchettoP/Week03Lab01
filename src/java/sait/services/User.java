/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.services;

import java.io.Serializable;

/**
 *
 * @author 733196
 */
public class User implements Serializable {

    private String name;
    private String password;
    String[] userNames = {"adam", "betty"};
    String userPassword = "password";

    public User() {
        name = "";
        password = "";
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean loging() {
        boolean isValid = false;

        for(String user : userNames)
            if(user.equals(name))
                if(userPassword.equals(password))
                isValid = true;
        
        return isValid;
    }
}
