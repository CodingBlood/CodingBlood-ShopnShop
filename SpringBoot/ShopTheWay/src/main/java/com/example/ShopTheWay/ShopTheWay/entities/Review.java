package com.example.ShopTheWay.ShopTheWay.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Review {
    @Id
    private Long ReviewID;
    private String timestamp;

    @OneToOne
    private Buyer buyer;


}
