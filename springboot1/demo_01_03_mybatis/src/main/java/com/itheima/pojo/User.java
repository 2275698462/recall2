package com.itheima.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private int age;
    private String tel;
    private int deleted;
    private int version;
}
