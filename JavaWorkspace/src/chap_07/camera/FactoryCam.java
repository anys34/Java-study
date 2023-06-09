package chap_07.camera;

public class FactoryCam  extends Camera { // 자식 클래스 (단 하나의 부모만 가능)
    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장카메라");
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
