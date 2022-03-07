/**
 * Hello
 */

public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.print("Hello World \n");
    for (int i = 0; i < 5; i++) {
      System.out.print(i);
      System.out.print(", ");
    }
    int height = 20;
    int width = 50;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
  }
}