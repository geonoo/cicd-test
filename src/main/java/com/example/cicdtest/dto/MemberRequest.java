package com.example.cicdtest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberRequest {
    private String name;

    public MemberRequest(String name){
        this.name = name;
    }
}
