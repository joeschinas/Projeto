/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.Product;


public class ComparableFunction implements Comparable<Product> {
    

    @Override
    public int compareTo(Product p) {
        return p.getPrice().compareTo(p.price);
    }
}
