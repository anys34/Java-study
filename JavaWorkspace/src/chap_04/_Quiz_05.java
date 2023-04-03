package chap_04;

public class _Quiz_05 {
    public static void main(String[] args) {
        String car = "장애인 차량";
        int hour = 10;
        int price = 0;
        price = 4000 * hour;
        if (price > 30000)
            price = 30000;
        if (car.equals("경차") || car.equals("장애인 차량")){
            price *= 0.5;
        }
        System.out.println("주차 요금은 " + price + " 원입니다.");
    }
}
