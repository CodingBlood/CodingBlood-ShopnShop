package com.example.ShopTheWay.ShopTheWay.entities;

import javax.persistence.*;

@Entity
public class Buyer {
    @Id
    private Long BuyerID;
    private String Salutation;
    private String fname;
    private String lname;
    private String age;
    private Long Contact_number;
    @Column(unique = true)
    private String EmailID;
    private Long point;
    private String addr_line1;
    private String addr_line2;
    private String addr_state;
    private String addr_city;
    private Long pin;

    @OneToMany
    private Likes like;
    @OneToMany
    private Review review;
}
