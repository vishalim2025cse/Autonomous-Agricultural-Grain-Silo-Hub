package com.example.silohub.service;
import org.springframework.stereotype.Service; import com.example.silohub.entity.*; import com.example.silohub.repository.*; import java.time.LocalDateTime; import java.util.List;
@Service public class SiloService {
 private final SiloUnitRepository siloRepo; private final TelemetryRepository telemetryRepo;
 public SiloService(SiloUnitRepository s,TelemetryRepository t){siloRepo=s;telemetryRepo=t;}
 public SiloUnit create(SiloUnit s){return siloRepo.save(s);} public List<SiloUnit> all(){return siloRepo.findAll();}
 public Telemetry ingest(Telemetry t){SiloUnit s=siloRepo.findById(t.getSiloId()).orElseThrow(()->new RuntimeException("Silo not found")); boolean trigger=(t.getHumidity()!=null&&t.getHumidity()>s.getHumidityThreshold())||(t.getTemperature()!=null&&t.getTemperature()>s.getTemperatureThreshold());s.setFanActive(trigger);siloRepo.save(s);t.setFanTriggered(trigger);t.setRecordedAt(LocalDateTime.now());return telemetryRepo.save(t);}
 public List<Telemetry> recent(Long id){return telemetryRepo.findTop10BySiloIdOrderByRecordedAtDesc(id);}
}