package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/product")
public class ProductController {
    ProductService productService = new ProductService();
    @GetMapping ("")
        public String showAllProduct (Model model) {
        List <Product> productList = productService.getAllProduct();
        model.addAttribute("products",productList);
        return "/index";
        }
    @GetMapping("/create")
    public String create (Model model) {
        model.addAttribute("product",new Product());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping ("/{id}/edit")
    public String edit (@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findProductById(id));
        return "/edit";
    }
    @PostMapping ("/update")
    public String update(Product product) {
        productService.updateProduct(product);
        return "redirect:/product";
    }

    @GetMapping ("/{id}/delete")
    public String delete (@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/product";
    }

    @GetMapping ("{id}/view")
    public String view (@PathVariable int id, Model model) {
        model.addAttribute("product",productService.findProductById(id));
        return "/view";
    }

}
