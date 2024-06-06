package org.example.Model;

public class PerUnit extends Product{
    private String unit;
    public PerUnit(String productName, Integer price, String unit) {
        super(productName, price);
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Nombre: " + getProductName() + " /// Precio: $" + getPrice() + " /// Unidad de venta: " + unit;
    }
}
