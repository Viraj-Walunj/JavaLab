package Lab3.Child;
import Lab3.Parent.Parent;

    public class Child extends Parent {
        public static void main(String[] args) {
            Parent parent = new Parent();
            System.out.println(parent.add(10,20));
        }
    }

