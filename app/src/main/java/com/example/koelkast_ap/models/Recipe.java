package com.example.koelkast_ap.models;

import java.util.List;

public class Recipe {
    private int id;
    private String name;
    private String imageUrl;
    private List<RecipeIngredient> ingredients;
    private List<String> steps;
    private int matchPercentage;

    public Recipe(int id, String name, String imageUrl, List<RecipeIngredient> ingredients, List<String> steps) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.ingredients = ingredients;
        this.steps = steps;
        this.matchPercentage = 0;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getImageUrl() { return imageUrl; }
    public List<RecipeIngredient> getIngredients() { return ingredients; }
    public List<String> getSteps() { return steps; }
    public int getMatchPercentage() { return matchPercentage; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public void setIngredients(List<RecipeIngredient> ingredients) { this.ingredients = ingredients; }
    public void setSteps(List<String> steps) { this.steps = steps; }
    public void setMatchPercentage(int matchPercentage) { this.matchPercentage = matchPercentage; }
} 