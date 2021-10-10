package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> productList;

    static {

        productList = new HashMap<>();
        productList.put(1, new Product(1, "Iphone", "Apple"));
        productList.put(2, new Product(2, "Galaxy", "Samssung"));
        productList.put(3, new Product(3, "Flex", "LG"));
        productList.put(4, new Product(4, "Bold", "Blackberry"));
        productList.put(5, new Product(5, "xperia", "Sony"));
        productList.put(6, new Product(6, "Reno", "oppo"));
    }

    @Override
    public List<Product> getAllProduct() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public Product findProductById(int id) {
        return productList.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(int id) {
        productList.remove(id);
    }
}
