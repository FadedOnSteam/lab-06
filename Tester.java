import java.io.*;
import java.util.Scanner;

public class Tester{
    public static void main(String [] args)throws IOException{
        File file = new File ("dictionary.txt");
        Scanner reader = new Scanner(file);

        int size = findSize(reader);
        reader.close();
        
        String [] dictionary = new String [size];

        long pretime;
        long posttime;

        //Generates the base array which all copies are based on
        arrayGenerate(dictionary, file, size);

        //Copies the base array into 6 different arrays
        String [] dictionaryCopy = copyArray(dictionary, size); String [] dictionaryCopy1 = copyArray(dictionary, size);
        String [] dictionaryCopy2 = copyArray(dictionary, size); String [] dictionaryCopy3 = copyArray(dictionary, size);
        String [] dictionaryCopy4 = copyArray(dictionary, size); String [] dictionaryCopy5 = copyArray(dictionary, size);

        pretime = System.nanoTime();  
        sorting.bubbleSort(dictionaryCopy);       
        posttime = System.nanoTime();
        System.out.println("Bubble sort began at: " + pretime + " And ended at: " + posttime + " for a total of: " + (posttime - pretime));

        pretime = System.nanoTime();
        sorting.selectionSort(dictionaryCopy1);
        posttime = System.nanoTime();
        System.out.println("Selection sort began at: " + pretime + " And ended at: " + posttime + " for a total of: " + (posttime - pretime));

        pretime = System.nanoTime();
        sorting.insertionSort(dictionaryCopy2);
        posttime = System.nanoTime();
        System.out.println("Insertion sort began at: " + pretime + " And ended at: " + posttime + " for a total of: " + (posttime - pretime));

        pretime = System.nanoTime();
        sorting.quickSort(dictionaryCopy3, 0, dictionaryCopy3.length-1);
        posttime = System.nanoTime();
        System.out.println("Quick sort began at: " + pretime + " And ended at: " + posttime + " for a total of: " + (posttime - pretime));

        pretime = System.nanoTime();
        sorting.mergeSort(dictionaryCopy4, 0, dictionaryCopy4.length-1);
        posttime = System.nanoTime();
        System.out.println("Merge sort began at: " + pretime + " And ended at: " + posttime + " for a total of: " + (posttime - pretime)); 

        pretime = System.nanoTime();
        sorting.heapSort(dictionaryCopy5);
        posttime = System.nanoTime();
        System.out.println("Heap sort began at: " + pretime + " And ended at: " + posttime + " for a total of: " + (posttime - pretime));
    }
    public static int findSize(Scanner reader){
        int size = 0;
        while(reader.hasNext()){
            reader.nextLine();
            size++;
        }
        return size;
    }
    // method reads the dictionary.txt and addjavs each line to an Array List.
    public static void arrayGenerate(String [] a, File file, int size)throws FileNotFoundException{
        Scanner reader = new Scanner(file);
        for (int i = 0; i < size; i++) {
            a[i] = reader.nextLine();
        }
    }
    //creates a copy of the dictionary Array List
    public static String[] copyArray(String [] a, int size){
        String [] b = new String [size];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
    //prints out the array
    public static void print(String [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}