/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


public class Product implements Comparable<Product> {
    private String name;
    public Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name.toUpperCase() + ", price=" + String.format("%.2f", price) + '}';
    }


    @Override
    public int compareTo(Product other) {
        return name.compareTo(other.name);
    }
    
}
