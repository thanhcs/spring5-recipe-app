package guru.springframework.controller;

import guru.springframework.controller.dto.RecipeDto;
import guru.springframework.service.RecipeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/recipes")
public class RecipeController {
    private final RecipeService recipeService;
    private final ModelMapper modelMapper;

    public RecipeController(RecipeService recipeService, ModelMapper modelMapper) {
        this.recipeService = recipeService;
        this.modelMapper = modelMapper;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/"
    )
    public ResponseEntity<List<RecipeDto>> getRecipes() {
        List<RecipeDto> dtos = modelMapper.map(recipeService.getRecipes(), new TypeToken<List<RecipeDto>>(){}.getType());
        return ResponseEntity.ok(dtos);
    }
}
