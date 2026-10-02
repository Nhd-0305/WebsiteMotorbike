package com.example.websitemotorbike.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    private String accountId;
    private String email;
    private String passwordHash;
    private String phone;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public User() {
    }

    public User(String accountId, String email, String passwordHash, String phone, UserRole userRole) {
        this.accountId = accountId;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phone = phone;
        this.userRole = userRole;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
