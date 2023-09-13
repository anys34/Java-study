public class ch04 {
    static class A {
        int m1, m2, m3, m4;
        A() {
            m1 = 1;
            m2 = 2;
            m3 = 3;
            m4 = 4;
        }

        A(int a) {
            this();
            m1 = a;
        }
        A(int a, int b) {
            this(a);
            m2 = b;
        }
    }
    public static void main(String[] args) {
        new A();
        new A(345);
        new A(1234, 21312);
    }
}
