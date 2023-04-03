package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int returnVal = getPower(2); // 2 * 2 = 4
        System.out.println(returnVal);

        returnVal = getPower(3);
        System.out.println(returnVal);

        returnVal = getPowerByExp(3, 3); // 3 * 3 * 3 = 27
        System.out.println(returnVal);

        System.out.println(getPowerByExp(2,4));
    }
}
