package com.numadic.vehicleTrackingSystem.vehicletracking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByVehicleId(Long vehicleId);
}
