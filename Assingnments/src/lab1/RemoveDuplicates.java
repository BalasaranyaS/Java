import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 6, 7, 6, 8, 2};

        // Sort the array
        Arrays.sort(array);

        // Variables to keep track of unique elements
        int n = array.length;
        int[] temp = new int[n];
        int j = 0;


        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n - 1];
        int[] uniqueArray = new int[j];
        System.arraycopy(temp, 0, uniqueArray, 0, j);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Duplicates removed: " + Arrays.toString(uniqueArray));
    }
}