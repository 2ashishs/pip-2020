package algo.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arrayList) {
        if (arrayList.size() <= 1)
            return arrayList;
        int mid = arrayList.size() / 2;
        return merge(arrayList.subList(0, mid), arrayList.subList(mid, arrayList.size()));
    }

    public static ArrayList<Integer> merge(List<Integer> listL, List<Integer> listR) {
        ArrayList<Integer> result = new ArrayList<>();
        int iL = 0, iR = 0;
        int sizeL = listL.size(), sizeR = listR.size();
        int sizeResult = sizeL + sizeR;
        for (int i = 0; i < sizeResult; i++) {
            if (listL.get(iL) <= listR.get(iR))
                result.add(i, listL.get(iL++));
            else
                result.add(i, listR.get(iR++));
        }
        return result;
    }
}
