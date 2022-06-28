package com.project1.invoiceInfo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private String description;
    private double price;
    private int qty;
    private int taxPercent;
    private double total;
//    private double subTotal;
//    private int totalTax;

//    private String invoiceNote;

    @ManyToOne
    private InvoiceInfo invoiceInfo;


}