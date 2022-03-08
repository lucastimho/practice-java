class Ball {
  int x;
  int y;

  int vx;
  int vy;

  void move(int width, int height) {
    x += vx;
    y += vy;
    if (x >= width || x == 0) {
      vx *= -1;
    }
    if (y >= height || y == 0) {
      vy *= -1;
    }
  }

  Ball() {
    x = 23;
    y = 7;

    vx = 1;
    vy = 1;
  }
}

public class Grid {
  public static void take_a_nap(int duration) {
    // puts computer to sleep for 0.5 seconds
    try {
      java.lang.Thread.sleep(duration);
    } catch (Exception e) {
      e.printStackTrace(System.err);
      System.exit(1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Current dir: " + System.getProperty("user.dir"));
    int height = 20;
    int width = 50;
    Ball ball = new Ball();
    for (int frame = 0; frame < 100; frame++) {
      // draws blank lines
      for (int i = 0; i < 15; i++) {
        System.out.println("");
      }
      // makes grid
      for (int j = 0; j < height; j++) {
        for (int i = 0; i < width; i++) {
          if (i == ball.x && j == ball.y) {
            System.out.print(" ");
          } else {
            System.out.print("#");
          }
        }
        System.out.println("");
      }
      take_a_nap(100);
      // move hole diagonally
      ball.move(width, height);
      System.out.println(frame);
    }
  }
}