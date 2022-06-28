package com.avi.springmvcminiproject.controller;

import com.avi.springmvcminiproject.entity.Assets;
import com.avi.springmvcminiproject.service.AssetsService;
import com.avi.springmvcminiproject.pojo.AssetsPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/asset")
public class AssetsController {
    @Autowired
    private AssetsService assetsService;

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute AssetsPOJO assetsPOJO, BindingResult result,Model theModel){
        if(result.hasErrors()){
            return "AssetForm";
        }
        assetsService.save(assetsPOJO);
        return "redirect:/asset/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "AssetForm";
    }

    @RequestMapping("/list")
    public String list(Model theModel){
        List<Assets> assets=assetsService.findAll();
        theModel.addAttribute("assets",assets);
        return "AssetList";
    }
    @RequestMapping("/update/{id}")
    public String update(Model theModel,@PathVariable("id") int id){
        Optional<Assets> assets=assetsService.findById(id);
        if(assets.isPresent()) {
            theModel.addAttribute("assetUpdate", assets.get());
        }
        return "AssetEditForm";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        assetsService.deleteById(id);
        return "redirect:/asset/list";
    }

}
