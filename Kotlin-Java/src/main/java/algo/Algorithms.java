package algo;

import algo.sort.MergeSort;

import java.util.ArrayList;
import java.util.Random;

public class Algorithms {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            arrayList.add(i, randomNumber());
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\nis sorted to");
        MergeSort.mergeSort(arrayList);
        for (int i = 0; i < 128; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public static int randomNumber() {
        Random r = new Random();
        return r.nextInt(999) + 1 ;
    }
}
