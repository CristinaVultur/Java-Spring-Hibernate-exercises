package com.example.ex1.repository;


import com.example.ex1.exception.NoProductFoundException;
import com.example.ex1.exception.NoSufficientQuantityException;
import com.example.ex1.model.Product;
import com.example.ex1.model.Shop;
import org.springframework.stereotype.Repository;

import java.awt.color.ProfileDataException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ShopProductRepository {
    private static Shop shop;

    public ShopProductRepository(){

        // Arrays.asList() produce colectie imutabila
        List<Product> products = new ArrayList<>();

        Product p1 = new Product(1, "Ciocolata", 5, 2);
        Product p2 = new Product(2, "Pufuleti", 2, 2);

        products.add(p1);
        products.add(p2);

        shop = new Shop(1, "Shop1","Bucuresti", products);
    }

    public Product saveProduct(Product product){
        /*if(product.getQuantity()<=0){
            throw new NoSufficientQuantityException("Product must have a quantity >0");
        }*/
        shop.getProductList().add(product);
        return product;
    }
    public Shop retrieveShop(){
        return shop;
    }

    public Product buyProduct(int productId){
        Product product = shop.getProductList()
                .stream()
                .filter(p->p.getId()==productId)
                .map(this::adaptQuantity)
                .findFirst()
                .orElseThrow(() -> new  NoProductFoundException("The given product id does not exist!"));
        if(product.getQuantity() < 0 ){
            throw new NoSufficientQuantityException("No more items for this product in stock!");
        }else{
            return product;
        }
    }

    private Product adaptQuantity(Product product){
        product.setQuantity(product.getQuantity() - 1);
        return product;
    }

}
