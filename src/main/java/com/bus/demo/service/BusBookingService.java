package com.bus.demo.service;

import com.bus.demo.model.Bus;
import org.springframework.stereotype.Service;

@Service
public interface BusBookingService {

    Bus createBus(Bus busRequest);

    Bus modifyBus(Long busNumber, Bus bus);
}
