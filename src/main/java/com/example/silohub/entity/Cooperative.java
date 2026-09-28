package com.example.silohub.entity;
import jakarta.persistence.*;
@Entity @Table(name="cooperatives")
public class Cooperative {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name; private String contactPerson; private String email; private String phone;
 public Cooperative(){}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getContactPerson(){return contactPerson;} public void setContactPerson(String v){contactPerson=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
}