package com.diyo.realestatelist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Review {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewId;
    private Long userId;
    private Long propertyId;
    private Long landId;
    private Long rating;
    private String review;
}
