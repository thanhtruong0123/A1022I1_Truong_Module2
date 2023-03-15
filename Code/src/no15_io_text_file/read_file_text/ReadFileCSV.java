package no15_io_text_file.read_file_text;

import java.io.*;

public class ReadFileCSV {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\no15_io_text_file\\read_file_text\\file.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line = null;

        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
