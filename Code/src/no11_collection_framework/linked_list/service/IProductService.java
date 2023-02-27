package no11_collection_framework.linked_list.service;

import no11_collection_framework.linked_list.model.Product;

public interface IProductService {
    public Product show();
    public void add(int id, String name, long value);
    public void edit(int id, String newName, long newValue);
    public void remove(int id);
    public void search(String name);
    public void sort(int type);
}
