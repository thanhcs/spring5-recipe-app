package guru.springframework.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class IngredientDto {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
}
