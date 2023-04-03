package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        String result = (120 >= height) ? "키가 " + height + "cm 이므로 탑승 불가능 합니다." : "키가 " + height + "cm 이므로 탑승 가능합니다.";

        System.out.println(result);
    }
}
