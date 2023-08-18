package com.diyo.realestatelist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
