import java.util.ArrayList;
public class sorting{
    public static void bubbleSort(ArrayList<String> a){
        String temp;
        for (int i = 0; i < a.size()-1; i++) {
            for (int j = 0; j < a.size() - 1 - i; j++) {
                if(a.get(j).compareTo(a.get(j+1)) > 0){
                    temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);

                }
            }
        }
    }
    public static void selectionSort(ArrayList<String> a){
        int indexSmallest;
        String temp;

        for (int i = 0; i < a.size(); i++) {
            indexSmallest = i;
            for (int j = i + 1; j < a.size(); j++) {
                if(a.get(j).compareTo(a.get(indexSmallest)) < 0){
                    indexSmallest = j;
                }
            }
            temp = a.get(i);
            a.set(i, a.get(indexSmallest));
            a.set(indexSmallest, temp);
        }
    }
    public static void insertionSort(ArrayList<String> a){

    }
    public static int partition(ArrayList<String> a, int i, int k) {
        int midpoint;
        int low;
        int high;
        String pivot;
        String temp;
        boolean done;

        midpoint = i + (k - i) / 2;
        pivot = a.get(midpoint);

        done = false;
        low = i;
        high = k;

        while(!done){
            while(a.get(low).compareTo(pivot) < 0){
                ++low;
            }
            while(a.get(high).compareTo(pivot) > 0){
                --high;
            }
            if(low >= high){
                done = true;
            }
            else {
                temp = a.get(low);
                a.set(low, a.get(high));
                a.set(high, temp);

                ++low;
                --high;
            }
        }
        return high;
    }
    public static void quicksort(ArrayList<String> a, int i, int k) {
        int j;
        if(i >= k){
            return;
        }

        j = partition(a, i, k);

        quicksort(a, i, j);
        quicksort(a, j + 1, k);
   }
}