import java.util.ArrayList;
public class sorting{
    public static void bubbleSort( String [] a){
        String temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j].compareTo(a[j+1]) > 0){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(String [] a){
        int indexSmallest;
        String temp;

        for (int i = 0; i < a.length; i++) {
            indexSmallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j].compareTo(a[indexSmallest]) < 0){
                    indexSmallest = j;
                }
            }
            temp = a[i];
            a[i] = a[indexSmallest];
            a[indexSmallest] = temp;
        }
    }
    public static void insertionSort(String [] a){
        String temp;
        int j;
        for (int i = 0; i < a.length; i++) {
            j = i;
            while(j > 0 && a[j].compareTo(a[j-1]) < 0){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                --j;
            }
        }
    }
    public static int partition(String [] a, int i, int k) {
        int midpoint;
        int low;
        int high;
        String pivot;
        String temp;
        boolean done;

        midpoint = i + (k - i) / 2;
        pivot = a[midpoint];

        done = false;
        low = i;
        high = k;

        while(!done){
            while(a[low].compareTo(pivot) < 0){
                ++low;
            }
            while(a[high].compareTo(pivot) > 0){
                --high;
            }
            if(low >= high){
                done = true;
            }
            else {
                temp = a[low];
                a[low] = a[high];
                a[high] = temp;

                ++low;
                --high;
            }
        }
        return high;
    }
    public static void quickSort(String [] a, int i, int k) {
        int j;
        if(i >= k){
            return;
        }

        j = partition(a, i, k);

        quickSort(a, i, j);
        quickSort(a, j + 1, k);
   }
    public static void merge(String [] a, int i, int j, int k){
        int mergedSize = k - i + 1;
        String mergedString [] = new String [mergedSize];
        int mergePos;
        int leftPos;
        int rightPos;

        mergePos = 0;
        leftPos = i;
        rightPos = j + 1;

        while(leftPos <= j && rightPos <= k){
            if(a[leftPos].compareTo(a[rightPos]) > 0){
                mergedString[mergePos] = a[leftPos];
                ++leftPos;
            }
            else{
                mergedString[mergePos] = a[rightPos];
                ++rightPos;
            }
            ++mergePos;
        }

        while(leftPos <= j){
            mergedString[mergePos] = a[leftPos];
            ++leftPos;
            ++mergePos;
        }

        while(rightPos <= k){
            mergedString[mergePos] = a[rightPos];
            ++rightPos;
            ++mergePos;
        }

        for(mergePos = 0; mergePos < mergedSize; ++mergePos){
            a[i + mergePos] = mergedString[mergePos];
        }
    }
    public static void mergeSort(String [] a, int i, int k){
        int j;

        if(i < k){
            j = (i + k) / 2;

            mergeSort(a, i, j);
            mergeSort(a, j + 1, k);

            merge(a, i, j, k);
        }
    }
}