package prac_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        task3();
//        task4();
//        task5(args);
        task6();
    }

    static void task3() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i :
                arr) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum / arr.length);
    }

    static void task4() {
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        int sum1 = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        do {
            sum1 += arr[i];
            min = Integer.min(arr[i], min);
            ++i;
        } while (i < 5);
        int sum2 = 0;
        int max = Integer.MIN_VALUE;
        i = 0;
        while (i < 5) {
            sum2 += arr[i];
            max = Integer.max(max, arr[i]);
            ++i;
        }
        System.out.println(sum1 == sum2 ? "Sum: " + Integer.toString(sum1) : "sum1 != sum2");
        System.out.println("Max: " + Integer.toString(max));
        System.out.println("Min: " + Integer.toString(min));
    }
    
    static void task5(String[] args) {
        for (var a :
                args) {
            System.out.println(a);
        }
    }

    static void task6() {
        System.out.println(1);
        for (int i = 2; i < 11; i++) {
            System.out.printf("1/%d%n", i);
        }
    }

    static BigInteger task7Factorial(BigInteger num) { //todo: unfinished yet
        BigInteger ans = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(i.add(BigInteger.valueOf(1))) == -1; i = i.add(BigInteger.valueOf(1))) {

        }
    }
}
