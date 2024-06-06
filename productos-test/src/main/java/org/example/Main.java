package org.example;

import org.example.Model.Liquid;
import org.example.Model.PerUnit;
import org.example.Model.Product;
import org.example.Model.Solid;
import java.util.ArrayList;


public class Main {
    private static final ArrayList<Product> productos= new ArrayList<>();

    public static void main(String[] args){
        Main.productUpload();
        for(Product product : productos){
            System.out.println(product.toString());
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: "+ Main.maxAndMin(productos).get(1).getProductName());
        System.out.println("Producto más barato: "+ Main.maxAndMin(productos).get(0).getProductName());
    }
    public static void productUpload(){
        Liquid producto1 = new Liquid("Coca-Cola Zero", 1.5,20);
        Liquid producto2 = new Liquid("Coca-Cola", 1.5,18);
        Solid producto3 = new Solid("Shampoo Sedal", "500ml",19);
        PerUnit producto4 = new PerUnit("Frutillas", 64,"kilo");
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
    }
    public static ArrayList<Product> maxAndMin(ArrayList<Product> productos){
        Product min = productos.get(0);
        Product max = productos.get(0);
        for(Product product : productos){
            if(product.compareTo(min)<0){
                min=product;
            }
            if(product.compareTo(max)>0){
                max=product;
            }
        }
        ArrayList<Product> maxAndMinProducts = new ArrayList<>();
        maxAndMinProducts.add(min);
        maxAndMinProducts.add(max);
        return maxAndMinProducts;
    }
}