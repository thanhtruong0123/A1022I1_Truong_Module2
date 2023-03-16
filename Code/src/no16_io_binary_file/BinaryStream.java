package no16_io_binary_file;

import java.io.*;
import java.util.List;

public class BinaryStream {
    private static final String FILE_PATH = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\no16_io_binary_file\\product.dat";

    public static void writeObject(Product product) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(product);
        oos.close();
    }

    public static Product readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product product = (Product) ois.readObject();
        ois.close();
        return product;
    }
}
