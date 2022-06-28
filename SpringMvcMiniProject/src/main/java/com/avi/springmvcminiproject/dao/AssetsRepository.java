package com.avi.springmvcminiproject.dao;

import com.avi.springmvcminiproject.entity.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends JpaRepository<Assets,Integer> {
}
