package com.bus.demo.repository;

import com.bus.demo.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BusRepository extends JpaRepository<Bus, UUID> {
    public Bus findByBusNumber(Long busNumber);
}
