/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import service.ProductService;

public class Program {
   
    public static void main(String[] args){
    
    List<Product> list = new ArrayList<>();
    
    list.add(new Product("Mouse", 29.90));
    list.add(new Product("Monitor", 299.90));
    list.add(new Product("Teclado", 79.90));
    list.add(new Product("Caixa de Som", 59.90));
    Double update =1.1;
    list.forEach(p -> p.setPrice(p.getPrice()*update));
    list.forEach(System.out::println);
        System.out.println("-----------------------------");
    list.removeIf(p ->p.price>=100);
    
    list.forEach(System.out::println);
    
    Product prod = new Product("Teclado", 79.90);
    
    list.forEach(p ->p.compareTo(prod));
    
    list.forEach(System.out::println);
    
    List<String> names = list.stream().map(p ->p.getName().toUpperCase()).collect(Collectors.toList());
    names.forEach(System.out::println);
    
    list.forEach(System.out::println);
    ProductService ps = new ProductService();
    Double result = ps.filterProduct(list, p->p.getName().charAt(0)=='T');
    
        System.out.println("Resultado :"+String.format("%.2f", result));
    }
}
