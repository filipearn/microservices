package arn.filipe.productcatalog.controller;

import arn.filipe.productcatalog.model.Product;
import arn.filipe.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public Iterable<Product> listAll() {
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productService.findByName(name);
    }

}
