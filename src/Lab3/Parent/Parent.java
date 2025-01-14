package Lab3.Parent;
public class Parent {
        public static int a, b ;

        public static int getA() {
            return a;
        }

        public static int getB() {
            return b;
        }

        public static void setA(int a) {
            Parent.a = a;
        }

        public static void setB(int b) {
            Parent.b = b;
        }
        public int add(int x , int y){
            return x+y;
        }
        int sub(int x, int y){
            return x-y;
        }
    }


