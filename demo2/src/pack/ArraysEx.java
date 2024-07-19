package pack;

import java.util.Arrays;
public class ArraysEx {
    public static void main(String[] args) {
        char[] consonants= {'b','c','d','f','g'};
        Arrays.sort(consonants);
        for (int i=0;i<consonants.length;i++){
            System.out.println(consonants[i]);

        }
        System.out.println("Sorted Array in Ascending order by toString:"+ Arrays.toString(consonants));
        //sort in descending order
        char[] reverse= new char[consonants.length];
        for (int i = 0; i < consonants.length; i++) {
            reverse[i] = consonants[consonants.length - 1 - i];
        }
        System.out.println("Sorted array in descending order: " + Arrays.toString(reverse));

    }
}
