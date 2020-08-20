package guru.springframework.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RecipeDto {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private String difficulty;
    private Byte[] image;
    private NotesDto notesDto;
    private Set<IngredientDto> ingredients;
}
