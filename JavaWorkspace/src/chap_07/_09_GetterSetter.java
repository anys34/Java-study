package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        BlackBox b2 = new BlackBox();
        b2.setModelName("햐양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

    }
}
