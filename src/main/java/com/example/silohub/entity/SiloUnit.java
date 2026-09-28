package com.example.silohub.entity;
import jakarta.persistence.*;
@Entity @Table(name="silo_units")
public class SiloUnit {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false,unique=true) private String name;
 private String location; private Double humidityThreshold=65.0; private Double temperatureThreshold=35.0; private boolean fanActive=false;
 public SiloUnit(){}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getLocation(){return location;} public void setLocation(String v){location=v;}
 public Double getHumidityThreshold(){return humidityThreshold;} public void setHumidityThreshold(Double v){humidityThreshold=v;}
 public Double getTemperatureThreshold(){return temperatureThreshold;} public void setTemperatureThreshold(Double v){temperatureThreshold=v;}
 public boolean isFanActive(){return fanActive;} public void setFanActive(boolean v){fanActive=v;}
}