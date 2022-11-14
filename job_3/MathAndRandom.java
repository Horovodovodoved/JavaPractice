package job_3;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

//Ctrl+Alt+L - формат
//Ctrl+Alt+O - оптимизировать импорты
public class MathAndRandom {
    public static void main(String[] args) {
        task1();
        // todo: task2();
        task3();
        task4(); // XD
        task5(); // XD
    }

    static void task5() {
        Random rand = new Random();
        int unstated_number_in_the_task = 5;
        int n = getArrayLength(unstated_number_in_the_task, rand);
        int[] arr = new int[n];
        int num_of_even = 0;
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                ++num_of_even;
            }
        }
        int[] even_arr = new int[num_of_even];
        int curr_even_idx = 0;
        System.out.println("\nArray of even numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even_arr[curr_even_idx] = arr[i];
                System.out.print(arr[i] + " ");
                ++curr_even_idx;
            }
        }
    }

    static void task4() {
        Random rand = new Random();
        int unstated_number_in_the_task = 5;
        int n = getArrayLength(unstated_number_in_the_task, rand);
        int[] arr = new int[n];
        int num_of_even = 0;
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                ++num_of_even;
            }
        }
        int[] even_arr = new int[num_of_even];
        int curr_even_idx = 0;
        System.out.println("\nArray of even numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even_arr[curr_even_idx] = arr[i];
                System.out.print(arr[i] + " ");
                ++curr_even_idx;
            }
        }
    }

    static int getArrayLength(int highest_restricted, Random rand) {
        Scanner scan = new Scanner(System.in);
        String[] phrases = {"Неверное число. Повторите ввод:",
                "Число должно быть больше, чем " + highest_restricted + ", введите другое число:",
                "Вас же попросили ввести число больше " + highest_restricted + "! Введите новое:"};
        System.out.println("Введите целое число больше " + highest_restricted + ":");
        int n = 0;
        while (n <= highest_restricted) {
            int candidate_n = scan.nextInt();
            if (candidate_n <= highest_restricted) {
                int idx = rand.nextInt(phrases.length);
                System.out.println(phrases[idx]);
                continue;
            }
            n = candidate_n;
        }
        return n;
    }

    static void task3() {
        Random rand = new Random();
        int[] a = new int[4];
        boolean strictly_increasing = true;
        for (int i = 0; i < 4; i++) {
            a[i] = rand.nextInt(10, 100);
            System.out.print(a[i] + " ");
            if (i > 0 && a[i - 1] >= a[i]) {
                strictly_increasing = false;
            }
        }
        System.out.println("\nSequence is" + (strictly_increasing ? "" : " not") + " strictly increasing");
    }

    static void task1() {
        Random rand = new Random();
        int len = rand.nextInt(2,11);
        double[] array = new double[len];
        System.out.println("Array: ");
        for (int i = 0; i < len; i++) {
            array[i] = randomlyGenerateRandomDouble(rand);
            System.out.println(array[i]);
        }
        sort(array);
        System.out.println("\nSorted Array: ");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }

    static double randomlyGenerateRandomDouble(Random rand) {
        if (rand.nextInt(2) == 0) {
            return Math.random();
        }
        return rand.nextDouble();
    }
}
