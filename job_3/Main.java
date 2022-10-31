package job_3;

import java.util.Random;

import static java.util.Arrays.sort;

//Ctrl+Alt+L - формат
//Ctrl+Alt+O - оптимизировать импорты
public class Main {


    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        Random rand = new Random();
        int len = rand.nextInt(1,11);
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
