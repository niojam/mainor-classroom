package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.dto.ProductPreviewDto;
import ee.mainor.classroom.mapper.ManufacturerMapper;
import ee.mainor.classroom.mapper.ProductCategoryMapper;
import ee.mainor.classroom.mapper.ProductMapper;
import ee.mainor.classroom.model.Manufacturer;
import ee.mainor.classroom.model.Product;
import ee.mainor.classroom.model.ProductCategory;
import ee.mainor.classroom.repository.ManufacturerRepository;
import ee.mainor.classroom.repository.ProductCategoryRepository;
import ee.mainor.classroom.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final ProductCategoryRepository productCategoryRepository;
    private final ProductMapper productMapper;


    public List<ProductPreviewDto> findAll() {
        return productMapper.fromProductToProductPreview(productRepository.findAll());
    }

    public ProductDto findById(Long id) {
        return productMapper.fromProductToProductDto(productRepository.getReferenceById(id));
    }

    public ProductDto createProduct(ProductDto productDto) {
        Product product = productMapper.fromDtoToEntity(productDto);
        product.setManufacturer(manufacturerRepository.getReferenceById(productDto.getManufacturer().getId()));
        product.setCategory(productCategoryRepository.getReferenceById(productDto.getProductCategory().getId()));

        return productMapper.fromProductToProductDto(productRepository.save(product));
    }

    public ProductDto updateProduct(ProductDto productDto) {
       productRepository.findById(productDto.getId()).orElseThrow(EntityNotFoundException::new);
        Product product = productMapper.fromDtoToEntity(productDto);
        return productMapper.fromProductToProductDto(productRepository.save(product));
    }


}
