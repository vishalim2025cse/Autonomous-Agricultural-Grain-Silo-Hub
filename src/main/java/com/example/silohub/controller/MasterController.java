package com.example.silohub.controller;
import org.springframework.web.bind.annotation.*; import com.example.silohub.entity.*; import com.example.silohub.repository.*; import java.util.List;
@RestController @RequestMapping("/api/master") @CrossOrigin public class MasterController {
 private final CooperativeRepository coop; private final VendorRepository vendor;
 public MasterController(CooperativeRepository c,VendorRepository v){coop=c;vendor=v;}
 @PostMapping("/cooperatives") public Cooperative addCoop(@RequestBody Cooperative x){return coop.save(x);}
 @GetMapping("/cooperatives") public List<Cooperative> coops(){return coop.findAll();}
 @PostMapping("/vendors") public Vendor addVendor(@RequestBody Vendor x){return vendor.save(x);}
 @GetMapping("/vendors") public List<Vendor> vendors(){return vendor.findAll();}
}