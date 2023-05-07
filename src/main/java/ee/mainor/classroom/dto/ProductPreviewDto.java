package ee.mainor.classroom.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class ProductPreviewDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private String currency;
    private Long imageId;
    private String description;

}
