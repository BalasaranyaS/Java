public class FunctionEx {

    String str="Hi this is good!";
    public void indexex(){
        System.out.println(str.indexOf("Hi"));
    }
    public void containex(){
        System.out.println(str.contains("Hi"));
    }
    public void len(){
        System.out.println(str.length());
    }
    public void lowerc(){
        System.out.println(str.toLowerCase());
    }
    public void upperex(){
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        FunctionEx obj=new FunctionEx();
        obj.containex();
        obj.upperex();
        obj.lowerc();
        obj.len();
        obj.indexex();
    }
}
