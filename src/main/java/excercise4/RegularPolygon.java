package excercise4;

public interface RegularPolygon {
    int getNumSides();

    int getSideLength();

    default int getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default double getInteriorAngle() {
        return (getNumSides() - 2) * 3.14 / getNumSides();
    }
}
