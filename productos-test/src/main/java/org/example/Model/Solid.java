package org.example.Model;

public class Solid extends Product{
    private String content;
    public Solid(String productName, String content, Integer price) {
        super(productName,  price);
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + getProductName() + " /// Contenido: " + content + " /// Precio: $" + getPrice();
    }
}
