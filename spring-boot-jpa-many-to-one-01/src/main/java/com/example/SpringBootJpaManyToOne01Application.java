package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Owner;
import com.example.entity.Vehicle;
import com.example.repository.OwnerRepository;
import com.example.repository.VehicleRepository;

@SpringBootApplication
public class SpringBootJpaManyToOne01Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaManyToOne01Application.class, args);
    }

    @Autowired
    private VehicleRepository vehicleRepo;

    @Override
    public void run(String... args) throws Exception {
        Owner o1 = new Owner("fahim", "nellore");
        Owner o2 = new Owner("suresh", "vijayawada");
        Vehicle v1 = new Vehicle("Hero", "Glamour", o1);
        Vehicle v2 = new Vehicle("Honda", "Shine", o1);
        Vehicle v3 = new Vehicle("Yamaha", "R15", o1);
        Vehicle v4 = new Vehicle("Suziki", "Shift", o2);
        Vehicle v5 = new Vehicle("Yamaha", "FZ", o2);


        vehicleRepo.saveAll(Arrays.asList(v1, v2, v3, v4, v5));
//		vehicleRepo.save(v1);
//		vehicleRepo.save(v2);
//		vehicleRepo.save(v3);
    }

}
