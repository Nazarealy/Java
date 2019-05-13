package Cutlery;

public class PlateCutlery extends CutleryMain{

    private double diagonal;
    private String color;
    private StructureType structure;

    public PlateCutlery() {
    }

    public PlateCutlery(double price, double rating, String material, String production, double diagonal, String color, StructureType structure) {
        super(price, rating, material, production);
        this.diagonal = diagonal;
        this.color = color;
        this.structure = structure;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public StructureType getStructure() {
        return structure;
    }

    public void setStructure(StructureType structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "PlateCutlery{" +
                "diagonal=" + diagonal +
                ", color='" + color + '\'' +
                ", structure=" + structure +
                '}';
    }
}
