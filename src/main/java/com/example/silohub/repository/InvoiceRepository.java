package com.example.silohub.repository;
import org.springframework.data.jpa.repository.JpaRepository; import com.example.silohub.entity.Invoice;
public interface InvoiceRepository extends JpaRepository<Invoice,Long>{}