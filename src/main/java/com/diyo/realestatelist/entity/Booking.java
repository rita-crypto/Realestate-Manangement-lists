package com.diyo.realestatelist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long bookingId;
    private Long userId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="fkPropertyId")
    private Property property;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkLandId")
    private Land land;

    private Date dateTime;
    private String inquiry;
}
