package com.diyo.realestatelist.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "booking_id_generator", sequenceName = "booking_id_sequence")

    private Long bookingId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkUserId")
    private User user;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="fkPropertyId")
    private Long propertyId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkLandId")
    private Long landId;*/
   @JoinColumn(name ="fkPropertyId")
   private Long propertyId;

    private Date dateTime;
    private String inquiry;
}
