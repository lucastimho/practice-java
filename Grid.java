public class Grid {
  public static void main(String[] args) {
    // System.out.println("Current dir: " + System.getProperty("user.dir"));
    int x = 20;
    int y = 9;
    int height = 20;
    int width = 50;
    for (int k = 0; k < 100; k++) {
      for (int l = 0; l < 15; l++) {
        System.out.println("");
      }
      for (int j = 0; j < height; j++) {
        for (int i = 0; i < width; i++) {
          if (i == x && j == y) {
            System.out.print(" ");
          } else {
            System.out.print("#");
          }
        }
        System.out.println("");
      }
      try {
        java.lang.Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace(System.err);
        System.exit(1);
      }
    }
    System.out.println("Current dir: " + System.getProperty("user.dir"));
  }
}