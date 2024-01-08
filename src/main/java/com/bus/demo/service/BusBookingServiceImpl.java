package com.bus.demo.service;

import com.bus.demo.model.Bus;
import com.bus.demo.repository.BusRepository;
import com.bus.demo.repository.BusScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class BusBookingServiceImpl implements BusBookingService{
    private String errorMessage = "Only admin users can add or update buses.";
    @Autowired
    private BusRepository busRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private BusScheduleRepository busScheduleRepository;
    @Override
    public Bus createBus(Bus busRequest) {

        if(userService.isAdmin(busRequest.getUser().getId()))
        {
            busRepository.save(busRequest);
        } else {
            throw new RuntimeException(errorMessage);
        }
        return busRequest;
    }

    @Override
    public Bus modifyBus(Long busNumber, Bus bus) {
       Bus bus1 = busRepository.findByBusNumber(busNumber);

       if(Objects.nonNull(bus1)) {
           busRepository.save(bus);
       } else {
           throw new RuntimeException("Bus not found");
       }
        if(userService.isAdmin(bus.getUser().getId()))
        {
            busRepository.save(bus);
        } else {
            throw new RuntimeException(errorMessage);
        }
       return bus;
    }
}
