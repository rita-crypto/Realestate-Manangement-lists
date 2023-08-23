package com.diyo.realestatelist.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "land_id_generator", sequenceName = "land_id_sequence")

    private Long landId;
    private String title;
    private String description;
    private Long price;
    private Long areaInAcres;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    private String views;
    private String status;
    private Date listingDate;
    private Date lastUpdateDate;
}
