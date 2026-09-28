package com.example.silohub.repository;
import org.springframework.data.jpa.repository.JpaRepository; import com.example.silohub.entity.Telemetry; import java.util.List;
public interface TelemetryRepository extends JpaRepository<Telemetry,Long>{List<Telemetry> findTop10BySiloIdOrderByRecordedAtDesc(Long siloId);}