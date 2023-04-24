package ee.mainor.classroom.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class ProductDto {


    private Long id;

    @NotBlank
    private String name;

    private BigDecimal price;

    private String currency;

    private Long imageId;

    private String description;

    private ProductCategoryDto productCategory;

    private ManufacturerDto manufacturer;

}
