package ExceptionHandling;

public class UnhandledException {
    public static void main(String[] args) {
        int[] arr={3,6,9};
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i=0; i<=5;i++){
            System.out.println(arr[i]); //ArrayIndexOutOfBoundException
        }

    }
}
