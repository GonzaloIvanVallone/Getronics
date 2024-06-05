package org.example.Model;

public class Solid extends Product{
    private String content;
    public Solid(String productName, String content, Integer price) {
        super(productName,  price);
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "Nombre: " + super.getProductName() + " /// Contenido: " + content + " /// Precio: $" + super.getPrice();
    }
}
