package lecture1.model;

public class Lengths {
    public static float length(double x1, double y1, double x2, double y2) {
        double len = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)*(y2 - y1));
        return (float) len;
    }
}
