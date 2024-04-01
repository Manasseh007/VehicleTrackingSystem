package com.numadic.vehicleTrackingSystem;

import com.numadic.vehicleTrackingSystem.vehicletracking.Vehicle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VehicleTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleTrackingSystemApplication.class, args);
	}

}

/*
@Bean
	public CommandLineRunner commandLineRunner(Vehicle vehicle) {
		return runner -> {
			createVehicle(vehicle);
		};
	}

	private void createVehicle(Vehicle vehicle) {
		System.out.println("New vehicle added into database!!!");
	}
*/