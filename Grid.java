public class Grid {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.print(i);
      System.out.print(", ");
    }
    int height = 20;
    int width = 50;
    for (int j = 0; j < height; j++) {
      for (int i = 0; i < width; i++) {
        if ((i > 20 && i < 23) || j == 9) {
          System.out.print(" ");
        } else {
          System.out.print("#");
        }
      }
      System.out.println("");
    }
  }
}