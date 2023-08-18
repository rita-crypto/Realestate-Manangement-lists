package com.diyo.realestatelist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

   /*@OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name = "fkPropertyId", referencedColumnName = "propertyId")
   private List<Booking> bookings;*/

    private Long numberOfBedrooms;
    private Long numberOfBathrooms;
    private String propertyStatus;
    private Date listingTodaysDate;

    private Date lastUpdateDate;
}
