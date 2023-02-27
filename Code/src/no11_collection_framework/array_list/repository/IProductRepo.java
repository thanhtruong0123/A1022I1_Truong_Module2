package no11_collection_framework.array_list.repository;

public interface IProductRepo {
    public void show();
    public void add(int id, String name, long value);
    public void edit(int id, String newName, long newValue);
    public void remove(int id);
    public void search(String name);
    public void sort(int type);
}
