package com.avi.springmvcminiproject.service;

import com.avi.springmvcminiproject.entity.Assets;
import com.avi.springmvcminiproject.pojo.AssetsPOJO;

import java.util.List;
import java.util.Optional;

public interface AssetsService {

    void save(AssetsPOJO assetsPOJO);

    List<Assets> findAll();

    Optional<Assets> findById(int id);

    void deleteById(int id);
}
