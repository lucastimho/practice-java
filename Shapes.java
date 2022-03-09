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

class Rect extends Shapes {
  Point tl;
  Point br;

  Rect() {
    tl = new Point(0.0, 0.0);
    br = new Point(1.0, 1.0);
  }

  void stretch(double horz, double vert) {
    br.x += horz;
    br.y += vert;
  }

  double area() {
    double w = br.x - tl.x;
    double h = br.y - tl.y;
    return w * h;
  }
}

class Triangle extends Shapes {

}

public class Shapes {
  public static void main(String[] args) {
    Point p = new Point(1.5, 2.0);
    Rect r = new Rect();
    Rect r2d2 = new Rect();
    r2d2.stretch(3.0, 2.0);
    System.out.println("The area of r is ");
    System.out.println(r.area());
    System.out.println("The area of r2d2 is ");
    System.out.println(r2d2.area());
  }
}
