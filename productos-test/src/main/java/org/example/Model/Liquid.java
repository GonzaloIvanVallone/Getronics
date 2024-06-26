package org.example.Model;

public class Liquid extends Product{
    private Double liters;
    public Liquid(String productName, Double liters, Integer price) {
        super(productName, price);
        this.liters = liters;
    }

    @Override
    public String toString(){
        return "Nombre: " + getProductName() + " /// Litros: " + liters + " /// Precio: $" + getPrice();
    }
}