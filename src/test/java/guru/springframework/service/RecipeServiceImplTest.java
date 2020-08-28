package guru.springframework.service;

import guru.springframework.config.ModelMapperConfig;
import guru.springframework.repository.RecipeRepository;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

@RunWith(MockitoJUnitRunner.class)
class RecipeServiceImplTest {
    private RecipeService recipeService;
    private ModelMapper modelMapper;

    @Mock
    private RecipeRepository recipeRepository;

    @BeforeClass
    void classSetUp() {
        modelMapper = (new ModelMapperConfig()).modelMapper();
    }

    @BeforeEach
    void setUp() {
        recipeService = new RecipeServiceImpl(recipeRepository, modelMapper);
    }

    @Test
    void getRecipes() {
    }
}