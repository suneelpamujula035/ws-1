package com.project1.invoiceInfo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String invoiceNo;
    private String billTo;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invoiceDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
    private String grandTotal;
    private double subTotal;
    private double totalTax;
    @Lob
    private byte[] file;
    
    private String invoiceNote;
  

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="invoiceId")
    private List<Product> listOfProducts;


}
