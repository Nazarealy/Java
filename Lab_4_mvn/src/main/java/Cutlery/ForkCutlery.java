package Cutlery;

public class ForkCutlery extends CutleryMain {

    private int needlesnumber;
    private SharpnessType sharpness;

    public ForkCutlery() {
    }


    public ForkCutlery(double price, double rating, String material, String production, int needlesnumber, SharpnessType sharpness) {
        super(price, rating, material, production);
        this.needlesnumber = needlesnumber;
        this.sharpness = sharpness;
    }

    public int getNeedlesnumber() {
        return needlesnumber;
    }

    public void setNeedlesnumber(int needlesnumber) {
        this.needlesnumber = needlesnumber;
    }

    public SharpnessType getSharpness() {
        return sharpness;
    }

    public void setSharpness(SharpnessType sharpness) {
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "ForkCutlery{" +
                "needlesnumber=" + needlesnumber +
                ", sharpness=" + sharpness +
                '}';
    }
}
