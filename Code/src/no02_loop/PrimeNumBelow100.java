package no02_loop;

public class PrimeNumBelow100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
           int checkNum = 0;

           for (int j = 1; j <= i; j++) {
               if (i % j == 0) {
                   checkNum++;
               }
           }

           if (checkNum == 2) {
               System.out.print(i + " ");
           }
        }
    }
}
