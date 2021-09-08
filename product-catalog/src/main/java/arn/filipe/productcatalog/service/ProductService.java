package arn.filipe.productcatalog.service;

import arn.filipe.productcatalog.model.Product;
import arn.filipe.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);

    }

    public List<Product> findByName(String name) {
        return productRepository.findByName(name);

    }
}
