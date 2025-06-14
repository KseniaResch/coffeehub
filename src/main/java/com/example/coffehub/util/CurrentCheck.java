package com.example.coffehub.util;

import com.example.coffehub.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CurrentCheck {
    List<ProductEntity> products = new ArrayList<ProductEntity>();
   //adds one chosen product
    void add (ProductEntity product) {
        if(product == null) {
            return;
        }
        List<ProductEntity> list = products.stream()
                .filter(p->p.getId()== product.getId())
                .collect(Collectors.toList());
        if(list.size()==0) {
            products.add(product);
            return;
        }
        list.get(0).setQuantity(list.get(0).getQuantity()+1);
    }
    //removes one chosen product
    void remove(ProductEntity product) {
        if(product == null) {
            return;
        }
        List<ProductEntity> list = products.stream()
                .filter(p->p.getId()== product.getId())
                .collect(Collectors.toList());
        if(list.size()==0) {
            return;
        }
        if(list.get(0).getQuantity()== 1){
            products.remove(list.get(0));
        }
        list.get(0).setQuantity(list.get(0).getQuantity()-1);

    }
    //removes all samples of chosen product
    void removeAll(ProductEntity product) {
        if(product == null) {
            return;
        }
        List<ProductEntity> list = products.stream()
                .filter(p->p.getId()== product.getId())
                .collect(Collectors.toList());
        if(list.size()==0) {
            return;
        }
        products.remove(list.get(0));

    }
    //clears the check
    void clear(){
        products.clear();

    }
    // returns the whole list of products in the check
    public List<ProductEntity> getProducts() {
        return products;
    }
}
