package Cutlery;

public class PlateCutlery extends CutleryMain {

    private double diagonal;
    private String color;
    private StructureType structure;

    public PlateCutlery() {
    }

    public PlateCutlery(final double price,
                        final double rating,
                        final String material,
                        final String production,
                        final double diagonal,
                        final String color,
                        final StructureType structure) {
        super(price, rating, material, production);
        this.diagonal = diagonal;
        this.color = color;
        this.structure = structure;
    }

    public final double getDiagonal() {
        return diagonal;
    }

    public final void setDiagonal(final double diagonal) {
        this.diagonal = diagonal;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(final String color) {
        this.color = color;
    }

    public final StructureType getStructure() {
        return structure;
    }

    public final void setStructure(final StructureType structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "PlateCutlery{"
                +
                "diagonal=" + diagonal
                +
                ", color='" + color + '\''
                +
                ", structure=" + structure
                +
                '}';
    }
}
