package com.springframework.springrecipeapp.services;

import com.springframework.springrecipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
