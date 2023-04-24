package ee.mainor.classroom.web;


import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.dto.ProductPreviewDto;
import ee.mainor.classroom.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//#TODO do test1
// #TODO finish get endpoints
// #TODO ADD post, put enpoints
// #TODO add image

// #TODO ADD validation
// #TODO start FRONTEND

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("all")
    public List<ProductPreviewDto> findAllProducts() {
        return productService.findAll();
    }


    @GetMapping("{id}")
    public ProductDto findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping
    public ProductDto createProduct(@Valid @RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    @PutMapping
    public ProductDto updateProduct(@Valid @RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }



}
