public class ClassAndObject {
    public static void main(String[] args) {
        //Create an object (reference + instance)
        Television sonyTv;
        sonyTv = new Television();
        Television LG;
        LG= new Television();

        //print the fields

        System.out.println("Serial Number: " + sonyTv.sNo);
        System.out.println("Height: " + sonyTv.height);
        System.out.println("Width: " + sonyTv.width);
        System.out.println("Price: " + sonyTv.price);
        System.out.println("Is Available: " + sonyTv.isAvailable);

        System.out.println("Serial Number: " + LG.sNo);
        System.out.println("Height: " + LG.height);
        System.out.println("Width: " + LG.width);
        System.out.println("Price: " + LG.price);
        System.out.println("Is Available: " + LG.isAvailable);

        //call the methods
        sonyTv.switchOn();
        sonyTv.allowHDMIConnection();
    }

}

class Television {
    //fields
    String sNo = "S001";
    byte height = 50;
    byte width = 100;
    float price = 500.50f;
    boolean isAvailable = false;
    //methods
    void switchOn(){
        System.out.println("Displays the TV logo");
        System.out.println("Start up music!");
        System.out.println("Menu display");
    }
    void allowHDMIConnection(){
        System.out.println("Connect laptop/home theatre through HDMI");
    }

}
