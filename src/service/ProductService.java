
package service;

import entities.Product;
import java.util.List;
import java.util.function.Predicate;


public class ProductService {
    
    public Double filterProduct(List<Product> list, Predicate<Product> criterie){
                double sum=0.0;
                for(Product obj: list){
                
                if(criterie.test(obj)){
                sum+=obj.getPrice();

                }
                
                }
                return sum;
    }
}
