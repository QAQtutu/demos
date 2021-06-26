package com.qaqtutu.jpah2.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @author: 张家尧
 * @create: 2021/06/26 11:09
 */

@Data
@Entity
@Table(name = "sys_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}