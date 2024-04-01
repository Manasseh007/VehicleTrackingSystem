package com.numadic.vehicleTrackingSystem.vehicletracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleRepository vehicleRepository;


    @Autowired
    public VehicleController(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    // Endpoints to register a new vehicle
    @PostMapping
    public String registerVehicle(@RequestParam Vehicle vehicle) {
        vehicleRepository.save(vehicle);
        return "Vehicle registered successfully!";
    }

    // Endpoints to fetch vehicle data
    @GetMapping
    public List<Vehicle> getVehicleData() {
        return vehicleRepository.findAll();

    }

}
