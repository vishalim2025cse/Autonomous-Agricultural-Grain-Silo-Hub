package com.example.silohub.controller;
import org.springframework.web.bind.annotation.*; import com.example.silohub.entity.*; import com.example.silohub.service.SiloService; import java.util.List;
@RestController @RequestMapping("/api/silos") @CrossOrigin public class SiloController {
 private final SiloService service; public SiloController(SiloService s){service=s;}
 @PostMapping("/units") public SiloUnit create(@RequestBody SiloUnit s){return service.create(s);}
 @GetMapping("/units") public List<SiloUnit> all(){return service.all();}
 @PostMapping("/telemetry") public Telemetry telemetry(@RequestBody Telemetry t){return service.ingest(t);}
 @GetMapping("/telemetry/{id}") public List<Telemetry> recent(@PathVariable Long id){return service.recent(id);}
}