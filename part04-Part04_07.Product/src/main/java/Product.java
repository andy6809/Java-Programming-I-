/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Famiglia Scogna 5.0
 */
public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    
    public Product(String nameProduct, double priceProduct, int quantityProduct){
        
        this.name = nameProduct;
        this.price = priceProduct;
        this.quantity = quantityProduct;
        
    }
    
    public void printProduct(){
        System.out.println(this.name + ", " + this.price + ", " + this.quantity);
    }
    
}
