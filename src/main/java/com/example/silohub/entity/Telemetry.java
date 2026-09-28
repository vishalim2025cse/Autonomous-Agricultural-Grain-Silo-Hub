package com.example.silohub.entity;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="telemetry")
public class Telemetry {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long siloId; private Double humidity; private Double temperature; private boolean fanTriggered; private LocalDateTime recordedAt;
 public Telemetry(){}
 public Long getId(){return id;} public Long getSiloId(){return siloId;} public void setSiloId(Long v){siloId=v;}
 public Double getHumidity(){return humidity;} public void setHumidity(Double v){humidity=v;}
 public Double getTemperature(){return temperature;} public void setTemperature(Double v){temperature=v;}
 public boolean isFanTriggered(){return fanTriggered;} public void setFanTriggered(boolean v){fanTriggered=v;}
 public LocalDateTime getRecordedAt(){return recordedAt;} public void setRecordedAt(LocalDateTime v){recordedAt=v;}
}