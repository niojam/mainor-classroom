package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.ProductCategoryDto;
import ee.mainor.classroom.mapper.ProductCategoryMapper;
import ee.mainor.classroom.model.ProductCategory;
import ee.mainor.classroom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductCategoryService {

    private final ProductRepository productRepository;
    private final ProductCategoryMapper productCategoryMapper;

    public ProductCategoryDto createCategory(ProductCategoryDto productCategoryDto) {
        ProductCategory productCategory = productCategoryMapper.toEntity(productCategoryDto);
        return productCategoryMapper.toDto(productCategory);
    }

}
