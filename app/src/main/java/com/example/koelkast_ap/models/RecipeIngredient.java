package com.example.koelkast_ap.models;

public class RecipeIngredient {
    private int id;
    private String name;
    private double quantity;
    private String unit;
    private boolean isInFridge;
    private boolean isAvailable;

    public RecipeIngredient(int id, String name, double quantity, String unit, boolean isInFridge) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.isInFridge = isInFridge;
        this.isAvailable = false;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getQuantity() { return quantity; }
    public String getUnit() { return unit; }
    public boolean isInFridge() { return isInFridge; }
    public boolean isAvailable() { return isAvailable; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(double quantity) { this.quantity = quantity; }
    public void setUnit(String unit) { this.unit = unit; }
    public void setInFridge(boolean inFridge) { isInFridge = inFridge; }
    public void setAvailable(boolean available) { isAvailable = available; }
} 