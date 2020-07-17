/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.Product;
import java.util.function.Predicate;


public class FunctionPredication implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice()>=100;
    }
    
    
}
