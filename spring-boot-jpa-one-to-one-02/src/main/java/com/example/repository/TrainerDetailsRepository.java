package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.TrainerDetails;

@Repository
public interface TrainerDetailsRepository extends JpaRepository<TrainerDetails, Integer> {

}
