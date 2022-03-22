package com.sepm_2b.packages;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;

//    @GetMapping("/test")
//    public List<UserEntity> getUsers(){
//        return userRepository.findAll();
//    }
}

