package com.bus.demo;

import com.bus.demo.model.Bus;
import com.bus.demo.service.BusBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BusBookingController {

    private BusBookingService busBookingService;

    @PostMapping("/add-bus")
    public ResponseEntity<Bus> addBusDetails(@RequestBody Bus busRequest) {
        Bus createdBus = busBookingService.createBus(busRequest);
        return ResponseEntity.ok().body(createdBus);
    }

    @PatchMapping("/{id}/modify-bus")
    public ResponseEntity<?> modifyBus(@PathVariable("id") Long busNumber,@RequestBody  Bus bus) {
        Bus modifyBus = busBookingService.modifyBus(busNumber, bus);
        return ResponseEntity.ok().body("Successfully Modified");
    }
}
