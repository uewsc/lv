package com.example.ordersys.model;

import lombok.Data;

@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private int isadmin;
}
