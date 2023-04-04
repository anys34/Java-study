package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화
        // 정보은닉

        // 접근 제어자
        // private : 해당 클래스
        // public : 모들 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근가

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("햐양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");


    }
}
