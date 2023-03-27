package ee.mainor.classroom.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class ProductDto {

    private ProductPreviewDto productPreviewDto;
    private ProductCategoryDto productCategory;
    private ManufacturerDto manufacturer;

}
