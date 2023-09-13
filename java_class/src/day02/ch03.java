package day02;

public class ch03 {
    static class A {
        float sum;
        void averageScore(int... a) {
            sum = 0;
            for(int k : a)
                sum += k;
            System.out.println(sum / a.length);
        }
    }
    public static void main(String[] args) {
        A a = new A();

        a.averageScore(1);
        a.averageScore(1, 2);
        a.averageScore(1, 2, 3);
        a.averageScore(1, 2, 3, 4);
    }
}
