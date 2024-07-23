package Docs;

import java.sql.SQLOutput;

public class Test6 {
    public Test6(){
        this((byte)4);
    }
    public Test6(byte var){
        System.out.println(var);
    }

    public static void main(String[] args) {
        Test6 t6 = new Test6();
    }
}
