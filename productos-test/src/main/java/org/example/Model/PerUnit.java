package org.example.Model;

public class PerUnit extends Product{
    private String unit;
    public PerUnit(String productName, Integer price, String unit) {
        super(productName, price);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "Nombre: " + super.getProductName() + " /// Precio: $" + super.getPrice() + " /// Unidad de venta: " + unit;
    }
}
