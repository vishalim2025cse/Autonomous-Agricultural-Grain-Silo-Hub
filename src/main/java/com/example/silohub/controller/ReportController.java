package com.example.silohub.controller;
import org.springframework.web.bind.annotation.*; import com.example.silohub.repository.*; import java.util.*;
@RestController @RequestMapping("/api/reports") @CrossOrigin public class ReportController {
 private final InvoiceRepository invoices; private final VendorBillRepository bills; private final SiloUnitRepository silos;
 public ReportController(InvoiceRepository i,VendorBillRepository b,SiloUnitRepository s){invoices=i;bills=b;silos=s;}
 @GetMapping("/pnl") public Map<String,Object> pnl(){double income=invoices.findAll().stream().mapToDouble(x->x.getAmount()==null?0:x.getAmount()).sum();double expense=bills.findAll().stream().mapToDouble(x->x.getAmount()==null?0:x.getAmount()).sum();Map<String,Object> m=new LinkedHashMap<>();m.put("conditioningRevenue",income);m.put("fanAndMaintenanceExpenses",expense);m.put("netResult",income-expense);return m;}
 @GetMapping("/dashboard") public Map<String,Object> dashboard(){Map<String,Object> m=new LinkedHashMap<>();m.put("silos",silos.count());m.put("invoices",invoices.count());m.put("vendorBills",bills.count());return m;}
}