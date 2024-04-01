package com.numadic.vehicleTrackingSystem.vehicletracking;

import org.apache.el.stream.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}

/*
    public List<Vehicle> findByMake(String make);
    public List<Vehicle> findByModel(String model);
    public Vehicle findByRegistrationNumber(String registrationNumber);


    //List<Vehicle> toyotaVehicles = vehicleRepository.findByMake("Toyota");
    //List<Vehicle> camryVehicles = vehicleRepository.findByModel("Camry");
    //Vehicle vehicle = vehicleRepository.findByRegistrationNumber("ABC123");

    @Query("SELECT v FROM Vehicle v WHERE v.make = :make AND v.model = :model")
    public List<Vehicle> findVehiclesByMakeAndModel(@Param("make") String make, @Param("model") String model);

*/
