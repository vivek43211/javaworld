class A{
    public void meth1() {
        System.out.println("i am method 1 of class A");
    }
    public void meth2() {
        System.out.println("i am method 2 of class A");

    }
    }
    // method overiding = if child class implemnet the same method as parent in parent class aagin then that function is
//                         method overidding

    class B extends A {
    @Override
        public void meth2() {
            System.out.println("i am method 2 of class B");

        }

    }
public class method_overiding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
