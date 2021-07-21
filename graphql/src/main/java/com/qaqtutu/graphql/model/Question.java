package com.qaqtutu.graphql.model;

import lombok.Data;

@Data
public class Question {
    private Long id;
    private String title;
    private String content;
    private Integer userId;
    private String name;
}