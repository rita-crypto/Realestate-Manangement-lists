package com.diyo.realestatelist.entity;

import lombok.*;

import java.util.Date;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "property_id_generator", sequenceName = "property_id_sequence")

    private Long propertyId;
    private String title;
    private String description;
    private String propertyType;
    private Long price;
    private Long area;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "propertyLocationId", referencedColumnName = "propertyId")
   */

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;


    private Long numberOfBedrooms;
    private Long numberOfBathrooms;
    private String propertyStatus;
    private Date listingDate;

    private Date lastUpdateDate;
}
