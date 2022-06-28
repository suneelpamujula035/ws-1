package com.example.mapper;

import com.example.dto.ProductDto;
import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductMapper {

    @Autowired
    private ProductService productService;
    @Autowired
    private ModelMapper modelMapper;

    public ProductDto toProductDto(Product product)
    {
        return modelMapper.map(product, ProductDto.class);
    }

    public Product toProduct(ProductDto productDto)
    {
        return modelMapper.map(productDto, Product.class);
    }

    public List<ProductDto> toProductDtos()
    {
        return productService.findAll()
                .stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    }




}
