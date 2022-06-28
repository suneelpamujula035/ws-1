package com.example.springbootmapstruct.mapper;

import com.example.springbootmapstruct.dto.ProductDto;
import com.example.springbootmapstruct.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

    @Mapper(implementationPackage = "mapper.impl")
    public interface ProductMapper {

        ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

        ProductDto toProductDto(Product product);

        List<ProductDto> toProductDtos(List<Product> products);

        Product toProduct(ProductDto productDto);
    }
