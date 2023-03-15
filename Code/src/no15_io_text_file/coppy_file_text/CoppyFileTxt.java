package no15_io_text_file.coppy_file_text;

import java.io.*;
import java.util.Scanner;

public class CoppyFileTxt {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập file nguồn: ");
        String sourceFile = sc.nextLine();

        System.out.println("Nhập file đích: ");
        String targetFile = sc.nextLine();

        File source = new File(sourceFile);
        File target = new File(targetFile);

        FileReader fileReader = new FileReader(source);
        FileWriter fileWriter = new FileWriter(target);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line = null;

        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
        System.out.println("Xong");
    }
}
