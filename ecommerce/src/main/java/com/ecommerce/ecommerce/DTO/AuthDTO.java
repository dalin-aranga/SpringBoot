package com.ecommerce.ecommerce.DTO;

public class AuthDTO {
    private int login_id;
    private String email;
    private String password;
    private String role;


    public AuthDTO(int login_id, String email, String password, String role) {
        this.login_id = login_id;
        this.email = email;
        this.password = password;
        this.role = String.valueOf(role);
    }

    public AuthDTO() {
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
        return "AuthDTO{" +
                "login_id=" + login_id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
