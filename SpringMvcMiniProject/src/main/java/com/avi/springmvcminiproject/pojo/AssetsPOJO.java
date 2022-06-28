package com.avi.springmvcminiproject.pojo;

import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class AssetsPOJO {
    private int id;

    @Pattern(regexp = "[a-zA-Z]{1,10}")
    private String product;
}
