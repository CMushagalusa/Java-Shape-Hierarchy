public abstract class Polygon extends TwoDShape {
    protected int numSides;
    protected boolean regularity;

    public Polygon(String name, String colour, int numSides, boolean isRegular) {
        super(name, colour);

        this.numSides = numSides;
        regularity = isRegular;

    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getNumSides() {
        return numSides;
    }

    public boolean getRegularity() {
        return regularity;
    }
}