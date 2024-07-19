package Docs;

public class Test3 {
    public static void method(){
        System.out.println("Called");
    }

    public static void main(String[] args) {
        method();    // calling a nonstatic method without creating an instance throws compilation error
    }

}
