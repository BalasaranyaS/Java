package accessmodifiers.p1;

public class C1P1 {
    private int  privatevar=1;
    int defaultVar=2;
    public int publicvar=3;
    protected int protectedvar=4;
    static protected int protectedstaticvar=5;

    public static void main(String[] args) {
        C1P1 c1p1=new C1P1();
        System.out.println(c1p1.privatevar);
        System.out.println(c1p1.defaultVar);
        System.out.println(c1p1.protectedvar);
        System.out.println(c1p1.publicvar);
        System.out.println(c1p1.protectedstaticvar);
    }
}
