package com.example.cicdtest.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @Builder
    public Member(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Member() {

    }
}
