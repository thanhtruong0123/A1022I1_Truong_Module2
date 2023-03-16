package no16_io_binary_file;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brandName;
    private long price;
    private String otherDescribe;

    public Product() {
    }

    public Product(int id, String name, String brandName, long price, String otherDescribe) {
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.otherDescribe = otherDescribe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getOtherDescribe() {
        return otherDescribe;
    }

    public void setOtherDescribe(String otherDescribe) {
        this.otherDescribe = otherDescribe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                ", otherDescribe='" + otherDescribe + '\'' +
                '}';
    }
}
