class Point {
  double x;
  double y;

  Point(double xi, double yi) {
    x = xi;
    y = yi;
  }

  void return_to_origin() {
    x = 0;
    y = 0;
  }
}

public class Shapes {
  public static void main(String[] args) {
    Point p = new Point(1.5, 2.0);
  }
}
