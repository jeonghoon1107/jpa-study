package com.jeonghoon.jpa.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created By Jeonghoon on 2018-10-17.
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seq;

    private String id;

    private String description;

    @Builder
    public User(String id, String description) {
        this.id = id;
        this.description = description;
    }
}
