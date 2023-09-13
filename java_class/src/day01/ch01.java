package day01;

public class ch01 {
    public static void main(String[] args) {
        method1(1, 2);
        method1(1, 2, 3);
        method1();

        method2("안녕", "하세요");
        method2("땡큐", "베리", "감사");
        method2();
    }

    static void method1(int... values) {
        for(int tmp : values) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }

    static void method2(String... values) {
        for (String tmp : values) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }
}
