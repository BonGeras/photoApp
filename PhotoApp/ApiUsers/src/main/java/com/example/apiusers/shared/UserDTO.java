package com.example.apiusers.shared;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = -3340856169644218351L;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userId;
    private String encryptedPasswordId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEncryptedPasswordId() {
        return encryptedPasswordId;
    }

    public void setEncryptedPasswordId(String encryptedPasswordId) {
        this.encryptedPasswordId = encryptedPasswordId;
    }
}
