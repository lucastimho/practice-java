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
    type = "rectangle";
    tl = new Point(0.0, 0.0);
    br = new Point(1.0, 1.0);
  }

  void stretch(double horz, double vert) {
    br.x += horz;
    br.y += vert;
  }

  double area() {
    type = "area";
    double w = br.x - tl.x;
    double h = br.y - tl.y;
    return w * h;
  }
}

class Triangle extends Shapes {
  Point a;
  Point b;
  Point c;

  Triangle() {
    type = "triangle";
  }
}

public class Shapes {
  String type;

  Shapes() {
    type = "not yet set";
  }

  public static void main(String[] args) {
    Point p = new Point(1.5, 2.0);
    Rect r = new Rect();
    Rect r2d2 = new Rect();
    r2d2.stretch(3.0, 2.0);
    Triangle t = new Triangle();
    System.out.print("The area of r is ");
    System.out.println(r.area());
    System.out.print("The area of r2d2 is ");
    System.out.println(r2d2.area());
    System.out.print("The type of shape t is ");
    System.out.println(t.type);
  }
}
