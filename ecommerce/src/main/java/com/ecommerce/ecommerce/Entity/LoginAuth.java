package com.ecommerce.ecommerce.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "login")
public class LoginAuth {
    @Id
    @Column(name = "login_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int login_id;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "role", length = 20)
    private String role;


    public LoginAuth(int login_id, String email, String password,String role) {
        this.login_id = login_id;
        this.email = email;
        this.password = password;
        this.role = role;

    }

    public LoginAuth() {
    }

    public int getLogin_id() {
        return login_id;
    }

    public void setLogin_id(int login_id) {
        this.login_id = login_id;
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
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "LoginAuth{" +
                "login_id=" + login_id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
