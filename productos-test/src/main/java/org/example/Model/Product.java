package org.example.Model;

public abstract class Product implements Comparable<Product>{
    private String productName;
    private Integer price;

    public Product(String productName, Integer price){
        this.productName = productName;
        this.price = price;
    }

    public String getProductName(){
        return productName;
    }

    public Integer getPrice(){
        return price;
    }

    @Override
    public int compareTo(Product p) {
        return Integer.compare(this.price, p.price);
    }
}
