package com.example.controller;

import com.example.dto.ProductDto;
import com.example.entity.Product;
import com.example.mapper.ProductMapper;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto productDto)
    {
        Product product = productMapper.toProduct(productDto);
        productService.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDto);
    }

//    @PostMapping
//    public ProductDto create(@RequestBody ProductDto productDto)
//    {
//        Product product = productMapper.toProduct(productDto);
//        productService.save(product);
//        return productDto;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id)
    {
        Product product = productService.findById(id).get();
        ProductDto productDto = productMapper.toProductDto(product);
        return ResponseEntity.ok(productDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable Long id,	@RequestBody ProductDto productDto)
    {
        Product updatedProduct = productMapper.toProduct(productDto);
        Product product = productService.findById(id).get();
        product.setId(id);
        product.setPrice(updatedProduct.getPrice());
        product.setDescription(updatedProduct.getDescription());
        product.setName(updatedProduct.getName());
        product.setUpdatedAt(updatedProduct.getUpdatedAt());
        product.setCreatedAt(updatedProduct.getCreatedAt());
        productService.save(product);
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
        List<ProductDto> l = new ArrayList();
        List<Product> productList = productService.findAll();
        if(productList!=null)
        {
            for(Product p : productList)
            {
                ProductDto productDto = productMapper.toProductDto(p);
                l.add(productDto);
            }
        }
        // List<ProductDto> productList = productMapper.toProductDtos();
        return ResponseEntity.ok(l);
    }
}
