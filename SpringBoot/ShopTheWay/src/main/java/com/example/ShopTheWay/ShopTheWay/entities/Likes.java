package com.example.ShopTheWay.ShopTheWay.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Likes {
    @Id
    private Long LikeID;
    private String timestamp;

    @OneToOne
    private Buyer buyer;


}
