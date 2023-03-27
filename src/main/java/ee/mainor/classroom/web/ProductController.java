package ee.mainor.classroom.web;


import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.dto.ProductPreviewDto;
import ee.mainor.classroom.model.Product;
import ee.mainor.classroom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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



}
