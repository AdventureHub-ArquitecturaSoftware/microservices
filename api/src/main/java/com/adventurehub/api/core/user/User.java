package com.adventurehub.api.core.user;


public class User {
    private Integer userId;
    private String email;
    private String password;
    private String serviceAddress;

    public User(Integer userId, String email, String password,String serviceAddress) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.serviceAddress = serviceAddress;
    }
    public User() {

    }

    public Integer getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
    public void setId(Integer id) {
        this.userId = id;
    }

    public void setServiceAddress(String serviceAddress){
        this.serviceAddress=serviceAddress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
