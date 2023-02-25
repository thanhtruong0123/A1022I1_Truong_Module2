package no11_collection_framework.homework.mvc_form.repository;

public interface IProductRepo {
    public void show();
    public void add(int id, String name, long value);
    public void edit(int id, String newName, long newValue);
    public void search(String name);
}
