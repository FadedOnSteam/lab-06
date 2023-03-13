import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester{
    public static void main(String [] args)throws IOException{
        Scanner reader = new Scanner(new File ("dictionary.txt"));
        ArrayList<String> dictionary = new ArrayList<String>();
        ArrayList<String> dictionaryCopy = new ArrayList<String>();

        arrayGenerate(dictionary, reader);

        dictionaryCopy = copyArray(dictionary);

        //sorting.bubbleSort(dictionaryCopy);       commented out bubble sort due to it bogging down the time this program took to run

        System.out.println(System.nanoTime());

        sorting.quicksort(dictionaryCopy, 0, dictionaryCopy.size()-1);

        System.out.println(System.nanoTime());

    }
    // method reads the dictionary.txt and addjavs each line to an Array List.
    public static void arrayGenerate(ArrayList<String> a, Scanner reader){
        while(reader.hasNext()){
            a.add(reader.nextLine());
        }
    }
    //creates a copy of the dictionary Array List
    public static ArrayList<String> copyArray(ArrayList<String> a){
        ArrayList<String> b = new ArrayList<String>();
        for (int i = 0; i < a.size(); i++) {
            b.add(a.get(i));
        }
        return b;
    }
}