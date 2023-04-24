package ee.mainor.classroom.mapper;

import ee.mainor.classroom.dto.ProductCategoryDto;
import ee.mainor.classroom.model.ProductCategory;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryMapper {

    public ProductCategoryDto toDto(ProductCategory productCategory) {
        return new ProductCategoryDto(productCategory.getId(), productCategory.getName());
    }

    public ProductCategory toEntity(ProductCategoryDto productCategoryDto) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(productCategoryDto.getId());
        productCategory.setName(productCategoryDto.getName());
        productCategory.setDescription(productCategory.getDescription());
        return productCategory;
    }

}
