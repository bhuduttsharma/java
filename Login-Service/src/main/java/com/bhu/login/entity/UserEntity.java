package com.bhu.login.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bhudutt
 */
@Entity
@Table(name = "USERS")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String roles;
}