public class Ball {
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