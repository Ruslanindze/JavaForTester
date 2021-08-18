public class Point {

    public int x;
    public int y;

    public

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(p1.x - p2.x) + Math.sqrt(p1.y - p2.y);
    }
}