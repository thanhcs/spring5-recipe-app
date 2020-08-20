package guru.springframework.domain;

import guru.springframework.entity.UnitOfMeasure;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Ingredient {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
}
