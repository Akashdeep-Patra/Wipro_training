package mibee_number_generator;

import java.util.ArrayList;
import java.util.Scanner;

public class generator {


    public static void main(String[] args) {
        String number;
        int size;
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        number = scanner.next();
        size = number.length();
//        System.out.println(size);
        int pointer;
        int counter = 0;
        while (counter < size) {
            pointer = Character.getNumericValue(number.charAt(counter));
            if (pointer % 2 == 0) {
                int sum = 0;
                while (sum % 2 == 0&&counter<size) {
                    sum += Character.getNumericValue(number.charAt(counter));
                    counter++;
                }
                result.append(Integer.toString(sum));
            }
          else if (pointer % 2 == 1) {
                int sum = 0;
                do {
                    sum += Character.getNumericValue(number.charAt(counter));
                    counter++;
                }while (sum%2==1&&counter+1<size);
                result.append(Integer.toString(sum));
            }
        }
        System.out.println(result);
    }
}
