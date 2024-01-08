package com.bus.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class BusSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Date startTime;

    private Date endTime;

    @ManyToOne
    @JoinColumn(name = "bus_id", nullable = true)
    private Bus bus;

}
