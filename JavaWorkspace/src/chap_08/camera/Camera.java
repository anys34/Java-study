package chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사지을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainPicture(); // 구현해야 하는 메소드
}
