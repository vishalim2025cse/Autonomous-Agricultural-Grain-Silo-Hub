package com.example.silohub.controller;
import org.springframework.web.bind.annotation.*; import com.example.silohub.entity.*; import com.example.silohub.repository.*; import java.time.LocalDate; import java.util.List;
@RestController @RequestMapping("/api/finance") @CrossOrigin public class FinanceController {
 private final InvoiceRepository invoices; private final VendorBillRepository bills;
 public FinanceController(InvoiceRepository i,VendorBillRepository b){invoices=i;bills=b;}
 @PostMapping("/invoices") public Invoice invoice(@RequestBody Invoice x){x.setInvoiceDate(LocalDate.now());if(x.getStatus()==null)x.setStatus("UNPAID");return invoices.save(x);}
 @GetMapping("/invoices") public List<Invoice> invoices(){return invoices.findAll();}
 @PutMapping("/invoices/{id}/pay") public Invoice pay(@PathVariable Long id){Invoice x=invoices.findById(id).orElseThrow();x.setStatus("PAID");return invoices.save(x);}
 @PostMapping("/vendor-bills") public VendorBill bill(@RequestBody VendorBill x){x.setBillDate(LocalDate.now());if(x.getStatus()==null)x.setStatus("UNPAID");return bills.save(x);}
 @GetMapping("/vendor-bills") public List<VendorBill> bills(){return bills.findAll();}
 @PutMapping("/vendor-bills/{id}/pay") public VendorBill payBill(@PathVariable Long id){VendorBill x=bills.findById(id).orElseThrow();x.setStatus("PAID");return bills.save(x);}
}