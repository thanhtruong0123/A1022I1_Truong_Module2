package no11_collection_framework.homework.mvc_form.service;

import no11_collection_framework.homework.mvc_form.model.Product;
import no11_collection_framework.homework.mvc_form.repository.IProductRepo;
import no11_collection_framework.homework.mvc_form.repository.ProductRepo;

public class ProductService implements IProductService {
    private IProductRepo repository = new ProductRepo();

    public Product show() {
        repository.show();
        return null;
    }

    public void add(int id, String name, long value) {
        repository.add(id, name, value);
    }

    public void edit(int id, String name, long value) {
        repository.edit(id, name, value);
    }

    public void search(String name) {
        repository.search(name);
    }
}
