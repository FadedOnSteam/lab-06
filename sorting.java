import java.util.ArrayList;
public class sorting{
    public static void bubbleSort(ArrayList<String> a){
        String temp;
        for (int i = 0; i < a.size()-1; i++) {
            for (int j = 0; j < a.size() - 1 - i; j++) {
                if(a.get(j).compareTo(a.get(j+1)) < 0){
                    temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);

                }
            }
        }
    }
    public static void selectionSort(ArrayList<String> a){

    }
    public static void insertionSort(ArrayList<String> a){

    }
}