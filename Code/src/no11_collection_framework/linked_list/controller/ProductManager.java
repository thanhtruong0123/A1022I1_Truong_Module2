package no11_collection_framework.linked_list.controller;

import no11_collection_framework.linked_list.service.IProductService;
import no11_collection_framework.linked_list.service.ProductService;

import java.util.Scanner;

public class ProductManager {
    private static IProductService service = new ProductService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = 0;
        while (select != 7) {
            System.out.println("==========PRODUCT==========");
            System.out.println("1. Show product list");
            System.out.println("2. Add new product");
            System.out.println("3. Edit a product");
            System.out.println("4. Remove a product");
            System.out.println("5. Search a product");
            System.out.println("6. Sort product list");
            System.out.println("7. Exit");
            System.out.println("Please, select a number");
            System.out.println("============================");

            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }
            switch (select) {
                case 1: //ShowList
                    service.show();
                    break;
                case 2: //add
                    try {
                        System.out.println("Enter id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter value: ");
                        long value = Long.parseLong(sc.nextLine());
                        service.add(id, name, value);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input, please enter a number.");
                    }
                    break;
                case 3: //edit
                    try {
                        System.out.println("Enter id: ");
                        int editId = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter new name");
                        String newName = sc.nextLine();
                        System.out.println("Enter new value");
                        long newValue = Long.parseLong(sc.nextLine());
                        service.edit(editId, newName, newValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input, please enter a number.");
                    }
                    break;
                case 4: // remove
                    try {
                        System.out.println("Enter id: ");
                        int removeId = Integer.parseInt(sc.nextLine());
                        service.remove(removeId);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input, please enter a number.");
                    }
                    break;
                case 5: // search
                    System.out.println("Enter a name to search");
                    String findName = sc.nextLine();
                    service.search(findName);
                    break;
                case 6: // sort
                    System.out.println("Select type to sort");
                    System.out.println("1. Sort the products by price from low to high");
                    System.out.println("2. Sort the products by price from high to low");
                    int type = Integer.parseInt(sc.nextLine());
                    service.sort(type);
                    break;
                case 7: // exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }

        }
    }
}
