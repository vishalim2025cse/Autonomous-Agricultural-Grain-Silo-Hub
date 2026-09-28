package com.example.silohub.repository;
import org.springframework.data.jpa.repository.JpaRepository; import com.example.silohub.entity.Vendor;
public interface VendorRepository extends JpaRepository<Vendor,Long>{}