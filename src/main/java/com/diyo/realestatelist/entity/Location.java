package com.diyo.realestatelist.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "location_id_generator", sequenceName = "location_id_sequence")

    private Long locationId;
    private String city;
    private String state;
    private String zipCode;
}
