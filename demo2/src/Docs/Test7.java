package Docs;

    public class Test7 {
        public Test7() {
        }

        public Test7(Test7 ref) {
            this(ref, "Hai");
        }

        public Test7(Test7 ref, String str) {
            ref.Test7(str);
            System.out.println("Hi");
        }

        public void Test7(String str) {
            System.out.println(str);
        }

        public static void main(String[] args) {
            Test7 t = new Test7();
            Test7 t7=new Test7(t);

        }
    }
