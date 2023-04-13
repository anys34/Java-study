package chap_12;

import javax.jws.soap.SOAPBinding;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable A_package = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                }
                System.out.println("-- A 상품 준비 완료 --");
            }
        };

        Runnable B_package = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("B 상품 준비 " + i + "/5");
                }
                System.out.println("-- B 상품 준비 완료 --");
            }
        };

        Runnable Set_package = new Runnable() {
            @Override
            public void run() {
                System.out.println("== 세트 상품 포장 시작 ==");
                for(int i = 1; i <= 5; i++) {
                    System.out.println("세트 상품 포장 " + i + "/5");
                }
                System.out.println("== 세트 상품 포장 완료 ==");
            }
        };

        Thread Thread_a = new Thread(A_package);
        Thread Thread_b = new Thread(B_package);
        Thread Thread_Set = new Thread(Set_package);

        Thread_a.start();
        Thread_b.start();

        try {
            Thread_a.join();
            Thread_b.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread_Set.start();

    }
}
