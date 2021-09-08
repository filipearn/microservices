package arn.filipe.productcatalog.repository;

import arn.filipe.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

    List<Product> findByName(String name);

}