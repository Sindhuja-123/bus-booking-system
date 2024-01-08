package com.bus.demo.repository;

import com.bus.demo.model.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BusScheduleRepository extends JpaRepository<BusSchedule, UUID> {
}
