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

    public void setProductName(String productName){
        this.productName = productName;
    }


    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }


    @Override
    public int compareTo(Product p) {
        return Integer.compare(this.price, p.price);
    }
}
