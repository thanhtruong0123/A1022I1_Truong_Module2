package no1_Introduction.Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberToString {
    static String result = " ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNum = sc.nextInt();
        if (inputNum < 11) {
            switch (inputNum) {
                case 0: result = "Zero"; break;
                case 1: result = "One"; break;
                case 2: result = "Two"; break;
                case 3: result = "Three"; break;
                case 4: result = "Four"; break;
                case 5: result = "Five"; break;
                case 6: result = "Six"; break;
                case 7: result = "Seven"; break;
                case 8: result = "Eight"; break;
                case 9: result = "Nine"; break;
                case 10: result = "Ten"; break;
            }
        } else if (inputNum < 20) {
            switch (inputNum) {
                case 11: result = "Eleven"; break;
                case 12: result = "Twelve"; break;
                case 13: result = "Thirteen"; break;
                case 14: result = "Fourteen"; break;
                case 15: result = "Fifteen"; break;
                case 16: result = "Sixteen"; break;
                case 17: result = "Seventeen"; break;
                case 18: result = "Eighteen"; break;
                case 19: result = "Nineteen"; break;
            }
        } else if (inputNum < 100) {
            switch (inputNum / 10) {
                case 3: result = "Thirty"; break;
                case 4: result = "Fourty"; break;
                case 5: result = "Fifty"; break;
                case 6: result = "Sixty"; break;
                case 7: result = "Seventy"; break;
                case 8: result = "Eighty"; break;
                case 9: result = "Ninety"; break;
            }
            switch (inputNum % 10) {
                case 1: result += " One"; break;
                case 2: result += " Two"; break;
                case 3: result += " Three"; break;
                case 4: result += " Four"; break;
                case 5: result += " Five"; break;
                case 6: result += " Six"; break;
                case 7: result += " Seven"; break;
                case 8: result += " Eight"; break;
                case 9: result += " Nine"; break;
            }
        } else if (inputNum < 1000) {
            switch (inputNum/100) {
                case 1: result = "One Hundred And "; break;
                case 2: result = "Two Hundred And "; break;
                case 3: result = "Three Hundred And "; break;
                case 4: result = "Four Hundred And "; break;
                case 5: result = "Five Hundred And "; break;
                case 6: result = "Six Hundred And "; break;
                case 7: result = "Seven Hundred And "; break;
                case 8: result = "Eight Hundred And "; break;
                case 9: result = "Nine Hundred And "; break;
            }
            int perNum = inputNum%100;
            if (perNum < 11) {
                switch (perNum) {
                    case 1: result += "One"; break;
                    case 2: result += "Two"; break;
                    case 3: result += "Three"; break;
                    case 4: result += "Four"; break;
                    case 5: result += "Five"; break;
                    case 6: result += "Six"; break;
                    case 7: result += "Seven"; break;
                    case 8: result += "Eight"; break;
                    case 9: result += "Nine"; break;
                    case 10: result += "Ten"; break;
                }
            } else if (perNum < 20) {
                switch (perNum) {
                    case 11: result += "Eleven"; break;
                    case 12: result += "Twelve"; break;
                    case 13: result += "Thirteen"; break;
                    case 14: result += "Fourteen"; break;
                    case 15: result += "Fifteen"; break;
                    case 16: result += "Sixteen"; break;
                    case 17: result += "Seventeen"; break;
                    case 18: result += "Eighteen"; break;
                    case 19: result += "Nineteen"; break;
                }
            } else if (perNum < 100) {
                switch (perNum / 10) {
                    case 3: result += "Thirty"; break;
                    case 4: result += "Fourty"; break;
                    case 5: result += "Fifty"; break;
                    case 6: result += "Sixty"; break;
                    case 7: result += "Seventy"; break;
                    case 8: result += "Eighty"; break;
                    case 9: result += "Ninety"; break;
                }
                switch (perNum % 10) {
                    case 1: result += " One"; break;
                    case 2: result += " Two"; break;
                    case 3: result += " Three"; break;
                    case 4: result += " Four"; break;
                    case 5: result += " Five"; break;
                    case 6: result += " Six"; break;
                    case 7: result += " Seven"; break;
                    case 8: result += " Eight"; break;
                    case 9: result += " Nine"; break;
                }
            } else {
                System.out.println("Please!!! Enter a number lower than 1000");
            }
        }
        System.out.println(result);
    }
}
