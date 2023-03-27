package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.dto.ProductPreviewDto;
import ee.mainor.classroom.mapper.ProductMapper;
import ee.mainor.classroom.model.Manufacturer;
import ee.mainor.classroom.model.Product;
import ee.mainor.classroom.repository.ManufacturerRepository;
import ee.mainor.classroom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductPreviewDto> findAll() {
        return productMapper.fromProductToProductPreview(productRepository.findAll());
    }

    public ProductDto findById(Long id) {
        return productMapper.fromProductToProductDto(productRepository.getReferenceById(id));
    }

}
