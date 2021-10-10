package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    public List <Product> getAllProduct ();
    public void save (Product product);
    public Product findProductById (int id);
    public void updateProduct (Product product);
    public void deleteProduct (int id);
}
