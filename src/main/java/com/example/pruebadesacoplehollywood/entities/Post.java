package com.example.pruebadesacoplehollywood.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "post")
@Data
public class Post implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;
}
