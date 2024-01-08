package com.bus.demo.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private Long busNumber;
    @Column
    private String busType;
    @Column
    private String busName;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Long busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
