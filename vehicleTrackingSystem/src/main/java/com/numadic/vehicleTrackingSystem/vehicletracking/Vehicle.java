package com.numadic.vehicleTrackingSystem.vehicletracking;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "Make")
    private String Make;

    @Column(name = "Model")
    private String Model;

    @Column(name = "Location")
    private String Location;

    @Column(name = "year")
    private int year;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "last_location_update")
    private LocalDateTime lastLocationUpdate;

    public Vehicle() {
    }

    public Vehicle(Long id, String registrationNumber, String make, String model, String location, int year, double latitude, double longitude, LocalDateTime lastLocationUpdate) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        Make = make;
        Model = model;
        Location = location;
        this.year = year;
        this.latitude = latitude;
        this.longitude = longitude;
        this.lastLocationUpdate = lastLocationUpdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getLastLocationUpdate() {
        return lastLocationUpdate;
    }

    public void setLastLocationUpdate(LocalDateTime lastLocationUpdate) {
        this.lastLocationUpdate = lastLocationUpdate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Location='" + Location + '\'' +
                ", year=" + year +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", lastLocationUpdate=" + lastLocationUpdate +
                '}';
    }
}
