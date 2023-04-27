package hw1;

import hw1.HeapSort.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long time = System.nanoTime();

        int [] arr = GetArray(100, 1, 120);
        System.out.println("Новый массив: "+ Arrays.toString(arr));

        HeapSort hp = new HeapSort();
        hp.heapSort(arr);
        System.out.println(Arrays.toString(arr));
        time = System.nanoTime() - time;
        System.out.printf("Код выполнен за: %,9.3f ms\n", time/1_000_000.0);
    }
    private static int [] GetArray(int massSize, int min, int max){
        int arr[] = new int[massSize];
        for (int i = 0; i < arr.length; i++) {
            int rand = new Random().nextInt(min, max);
            arr[i] = rand;
        }
        return arr;
    }
}