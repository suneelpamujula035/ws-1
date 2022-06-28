package com.example.springbootmapstruct.controller;

import com.example.springbootmapstruct.dto.ProductDto;
import com.example.springbootmapstruct.entity.Product;
import com.example.springbootmapstruct.mapper.ProductMapper;
import com.example.springbootmapstruct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto productDto)
    {
        System.out.println(productDto);
        Product product = ProductMapper.INSTANCE.toProduct(productDto);
        productService.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id)
    {
        Optional<Product> product = productService.findById(id);
        ProductDto productDto = ProductMapper.INSTANCE.toProductDto(product.get());
        return ResponseEntity.ok(productDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable Long id,	@RequestBody ProductDto productDto)
    {
        Product product = ProductMapper.INSTANCE.toProduct(productDto);
        product.setId(id);
        productService.save(product);
//        Product existingProduct = productService.findById(id).get();
//        ProductDto productDto1 = ProductMapper.INSTANCE.toProductDto(existingProduct);
//        productDto1.setName(productDto.getName());
//        productDto1.setDescription(productDto.getDescription());
//        productDto1.setPrice(productDto.getPrice());
//        Product product = ProductMapper.INSTANCE.toProduct(productDto1);
//        productService.save(product);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id)
    {
        productService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll()
    {
        List<ProductDto> productList = ProductMapper.INSTANCE.toProductDtos(productService.findAll());
        return ResponseEntity.ok(productList);
    }
}
