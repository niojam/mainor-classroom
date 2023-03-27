package ee.mainor.classroom.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private String currency;

    @ManyToOne
    @JoinColumn(name = "product_category")
    private ProductCategory category;

    @Column(name = "image")
    private Long imageId;

    @ManyToOne
    @JoinColumn(name = "manufacturer")
    private Manufacturer manufacturer;


}
