package org.example.Model;

public class Liquid extends Product{
    private Double liters;
    public Liquid(String productName, Double liters, Integer price) {
        super(productName, price);
        this.liters = liters;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }
    @Override
    public String toString(){
        return "Nombre: " + super.getProductName() + " /// Litros: " + liters + " /// Precio: $" + super.getPrice();
    }
}