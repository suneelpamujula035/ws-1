package com.avi.springmvcminiproject.serviceimplementation;

import com.avi.springmvcminiproject.dao.AssetsRepository;
import com.avi.springmvcminiproject.entity.Assets;
import com.avi.springmvcminiproject.pojo.AssetsPOJO;
import com.avi.springmvcminiproject.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AssetServiceImpl implements AssetsService {
    @Autowired
    private AssetsRepository assetsRepository;
    @Transactional
    public void save(AssetsPOJO assetsPOJO) {
        Assets assets=new Assets(assetsPOJO.getProduct());
        assetsRepository.save(assets);
    }

    @Override
    public List<Assets> findAll() {
        return assetsRepository.findAll();
    }

    @Override
    public Optional<Assets> findById(int id) {
        return assetsRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        assetsRepository.deleteById(id);
    }

}
