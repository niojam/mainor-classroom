package ee.mainor.classroom.mapper;

import ee.mainor.classroom.dto.ProductCategoryDto;
import ee.mainor.classroom.model.ProductCategory;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryMapper {

    public ProductCategoryDto toDto(ProductCategory productCategory) {
        return new ProductCategoryDto(productCategory.getId(), productCategory.getName());
    }

}
