package com.diyo.realestatelist.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "user_id_generator", sequenceName = "user_id_sequence")

    private Long userId;

    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
