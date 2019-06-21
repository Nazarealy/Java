package Cutlery;

public class ForkCutlery extends CutleryMain {

    private int needlesnumber;
    private SharpnessType sharpness;

    public ForkCutlery() {
    }


    public ForkCutlery(final double price,
                       final double rating,
                       final String material,
                       final String production,
                       final int needlesnumber,
                       final SharpnessType sharpness) {
        super(price, rating, material, production);
        this.needlesnumber = needlesnumber;
        this.sharpness = sharpness;
    }

    public final int getNeedlesnumber() {
        return needlesnumber;
    }

    public final void setNeedlesnumber(final int needlesnumber) {
        this.needlesnumber = needlesnumber;
    }

    public final SharpnessType getSharpness() {
        return sharpness;
    }

    public final void setSharpness(final SharpnessType sharpness) {
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "ForkCutlery{"
                +
                "needlesnumber=" + needlesnumber
                +
                ", sharpness=" + sharpness
                +
                '}';
    }
}
