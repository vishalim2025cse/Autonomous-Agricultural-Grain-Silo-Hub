package com.example.silohub.entity;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity @Table(name="vendor_bills")
public class VendorBill {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long vendorId; private Double amount; private String description; private String status; private LocalDate billDate;
 public VendorBill(){}
 public Long getId(){return id;} public Long getVendorId(){return vendorId;} public void setVendorId(Long v){vendorId=v;}
 public Double getAmount(){return amount;} public void setAmount(Double v){amount=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public LocalDate getBillDate(){return billDate;} public void setBillDate(LocalDate v){billDate=v;}
}