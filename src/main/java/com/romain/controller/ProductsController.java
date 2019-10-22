package com.romain.controller;

import com.romain.model.Product;
import com.romain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Romain Angier on 22/10/19.
 */

@Controller
public class ProductsController {

    @Autowired
    ProductRepository productRepository;


    @RequestMapping("/product/{id}")
    public String product(@PathVariable Long id, Model model){
        model.addAttribute("product", productRepository.findOne(id));
        return "product";
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public String productsList(Model model){
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }

    @RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
    @ResponseBody
    public String saveProduct(@RequestBody Product product) {
        productRepository.save(product);
        return product.getProductId().toString();
    }

    @RequestMapping(value = "/removeproduct", method = RequestMethod.POST)
    @ResponseBody
    public String removeProduct(@RequestParam Long Id){
        productRepository.delete(Id);
        return Id.toString();
    }
}
