package com.example.silohub.entity;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity @Table(name="customer_invoices")
public class Invoice {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long cooperativeId; private Double amount; private String description; private String status; private LocalDate invoiceDate;
 public Invoice(){}
 public Long getId(){return id;} public Long getCooperativeId(){return cooperativeId;} public void setCooperativeId(Long v){cooperativeId=v;}
 public Double getAmount(){return amount;} public void setAmount(Double v){amount=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
 public LocalDate getInvoiceDate(){return invoiceDate;} public void setInvoiceDate(LocalDate v){invoiceDate=v;}
}