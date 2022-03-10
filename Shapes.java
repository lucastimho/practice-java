class Point {
  double x;
  double y;

  Point(double intial_x, double intial_y) {
    x = intial_x;
    y = intial_y;
  }

  void return_to_origin() {
    x = 0;
    y = 0;
  }
}

class Rect extends Shapes {
  Point topLeft;
  Point bottomRight;

  Rect() {
    type = "rectangle";
    topLeft = new Point(0.0, 0.0);
    bottomRight = new Point(1.0, 1.0);
  }

  void stretch(double horz, double vert) {
    bottomRight.x += horz;
    bottomRight.y += vert;
  }

  double area() {
    type = "area";
    double width = bottomRight.x - topLeft.x;
    double height = bottomRight.y - topLeft.y;
    return width * height;
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
    // Point p = new Point(1.5, 2.0);
    Rect rectina = new Rect();
    double arina = rectina.area();
    System.out.print("The area of arina is ");
    System.out.println(arina);

    Rect rectifer = new Rect();
    rectifer.stretch(2.0, 3.0);
    double arifer = rectifer.area();
    System.out.print("The area of arifer is ");
    System.out.println(arifer);

    System.out.print("Rectina is a ");
    System.out.println(rectina.type);
    System.out.print("Rectifer is a ");
    System.out.println(rectifer.type);
    Triangle trina = new Triangle();
    System.out.print("Trina is a ");
    System.out.println(trina.type);
    // Rect r = new Rect();
    // Rect r2d2 = new Rect();
    // r2d2.stretch(3.0, 2.0);
    // Triangle t = new Triangle();
    // System.out.print("The area of r is ");
    // System.out.println(r.area());
    // System.out.print("The area of r2d2 is ");
    // System.out.println(r2d2.area());
    // System.out.print("The type of shape t is ");
    // System.out.println(t.type);

  }
}
