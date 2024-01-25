package DAO;

import java.util.List;

import Model.Product;

public interface ProductDao {
    void addProduct(Product product);

    Product getProductById(int productId);

    List<Product> getAllProducts();

    void update(Product product);

    void delete(Long id);

}
