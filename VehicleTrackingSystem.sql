-- Create a table to store vehicle data
Create database if not exists VehicleTrackingSystem;

Use VehicleTrackingSystem;
-- Create a table for vehicles
CREATE TABLE IF NOT EXISTS Vehicle (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    registration_number VARCHAR(20) NOT NULL,
    Make VARCHAR(50) NOT NULL,
    Model VARCHAR(50) NOT NULL,
    `Location` VARCHAR(50) NOT NULL,
    year INT,
    latitude DOUBLE,
    longitude DOUBLE,
    last_location_update DATETIME
);

-- Create a table for transactions
CREATE TABLE IF NOT EXISTS Transaction (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    vehicle_id BIGINT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    description VARCHAR(255),
    latitude DOUBLE,
    longitude DOUBLE,
    timestamp DATETIME NOT NULL,
    user_id INT,
    transaction_type VARCHAR(50) NOT NULL,
    FOREIGN KEY (vehicle_id) REFERENCES Vehicle(id)
);

-- Insert Sample data 
INSERT INTO Vehicle (registration_number, Make, Model, Location, year, latitude, longitude, last_location_update)
VALUES
    ('NDW 369852', 'Toyota', 'Corrola', 'Cape Town', 2023, -33.918861, 18.423300, now()),
    ('NUZ 741258', 'Ford', 'EcoSport', 'Johannesburg', 2024, -26.20227000, 28.04363000, now());


-- Insert Sample data 
INSERT INTO Transaction (vehicle_id, amount, description, latitude, longitude, timestamp, user_id, transaction_type)
VALUES
    (1, 50.00, 'Full tank refill', -33.918861, 18.423300, now(), 1, 'Refueling'),
    (2, 25.00, 'Oil change', -26.20227000, 28.04363000, now(), 2, 'Maintenance');
