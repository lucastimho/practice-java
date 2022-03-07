public class Grid {
  public static void main(String[] args) {
    System.out.println("Current dir: " + System.getProperty("user.dir"));
    for (int k = 0; k < 100; k++) {
      for (int j = 0; j < 15; j++) {
        System.out.println("");
        int x = 20;
        int y = 9;
        int height = 20;
        int width = 50;
        for (j = 0; j < height; j++) {
          for (int i = 0; i < width; i++) {
            if (i == x && j == y) {
              System.out.print(" ");
            } else {
              System.out.print("#");
            }
          }
          System.out.println("");
        }
      }
    }
  }
}