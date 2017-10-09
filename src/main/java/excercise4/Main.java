package excercise4;

public class Main {
    public static void main(String[] args) {
        RegularPolygon square = new Square(12);
        RegularPolygon triangle = new EquilateralTriangle(5);

        RegularPolygon[] polygons = new RegularPolygon[2];
        polygons[0] = square;
        polygons[1] = triangle;
        int result = sumOfSideLengths(polygons);
        System.out.print("sumOfSideLengths: " + result);

        System.out.print("\nIntegrior Angle: " + square.getInteriorAngle() + "\ngetPerimeter:" + square.getPerimeter());
    }

    public static int sumOfSideLengths(RegularPolygon[] polygons) {
        int result = 0;
        for (RegularPolygon polygon : polygons) {
            result += polygon.getSideLength();
        }
        return result;
    }
}