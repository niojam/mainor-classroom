package ee.mainor.classroom.mapper;

import ee.mainor.classroom.dto.ProductDto;
import ee.mainor.classroom.dto.ProductPreviewDto;
import ee.mainor.classroom.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductMapper {

    private final ManufacturerMapper manufacturerMapper;
    private final ProductCategoryMapper productCategoryMapper;

    public ProductPreviewDto fromProductToProductPreview(Product product) {
        return new ProductPreviewDto().setId(product.getId())
                .setName(product.getName())
                .setCurrency(product.getCurrency())
                .setPrice(product.getPrice()).setImageId(product.getImageId());
    };

    public ProductDto fromProductToProductDto(Product product) {
        return new ProductDto()
                .setId(product.getId())
                .setName(product.getName())
                .setDescription(product.getDescription())
                .setCurrency(product.getCurrency())
                .setPrice(product.getPrice()).setImageId(product.getImageId())
                .setManufacturer(manufacturerMapper.toManufacturerDto(product.getManufacturer()))
                .setProductCategory(productCategoryMapper.toDto(product.getCategory()));
    };

    public Product fromDtoToEntity(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setImageId(productDto.getImageId());
        product.setCurrency(productDto.getCurrency());

        product.setCategory(productCategoryMapper.toEntity(productDto.getProductCategory()));
        product.setManufacturer(manufacturerMapper.toManufacturerEntity(productDto.getManufacturer()));

        return product;
    }



    public List<ProductPreviewDto> fromProductToProductPreview(List<Product> products) {
        return products.stream().map(this::fromProductToProductPreview).toList();
    }


}
