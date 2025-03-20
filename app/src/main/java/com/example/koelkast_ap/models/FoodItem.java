package com.example.koelkast_ap.models;

public class FoodItem {
    private int id;
    private String name;
    private String category;
    private String imageUrl;
    private boolean isInFridge;
    private int quantity;
    private String unit;

    public FoodItem(int id, String name, String category, String imageUrl, boolean isInFridge, int quantity, String unit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.imageUrl = imageUrl;
        this.isInFridge = isInFridge;
        this.quantity = quantity;
        this.unit = unit;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getImageUrl() { return imageUrl; }
    public boolean isInFridge() { return isInFridge; }
    public int getQuantity() { return quantity; }
    public String getUnit() { return unit; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public void setInFridge(boolean inFridge) { isInFridge = inFridge; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setUnit(String unit) { this.unit = unit; }
} 