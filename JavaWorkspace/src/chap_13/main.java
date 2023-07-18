package chap_13;

import chap_13.test.Test;

public class main {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.pushget("yeseong");
        t1.print();
        Test t2 = new Test();
        t2.pushget("chang");
        t2.print();
    }
}
