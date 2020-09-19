package algo;

import algo.sort.MergeSort;

import java.util.ArrayList;
import java.util.Random;

public class Algorithms {
    public static void main(String[] args) {
        //Variables
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> sortedList;
        int inputListSize = 64;
        long startTime, endTime;
        //Initialize arrayList with random numbers
        System.out.print("Unsorted List:\n");
        for (int i = 0; i < inputListSize; i++) {
            arrayList.add(i, randomNumber());
            System.out.print(arrayList.get(i) + " ");
        }
        //Merge Sort
        startTime = System.currentTimeMillis();
        sortedList = MergeSort.mergeSort(arrayList);
        endTime = System.currentTimeMillis();
        System.out.print("\nMerge Sort in " + (endTime - startTime) + "ms:\n");
        for (int i = 0; i < inputListSize; i++) {
            System.out.print(sortedList.get(i) + " ");
        }
    }

    public static int randomNumber() {
        Random r = new Random();
        return r.nextInt(9999) + 1;
    }
}
