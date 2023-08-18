package com.diyo.realestatelist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long locationId;
    private String city;
    private String state;
    private String zipCode;
}
