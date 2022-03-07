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
        if (j == 22) {
          System.out.print("#");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    int date = 13;
    if (date == 13) {
      System.out.print("It's an unlucky day");
    }
  }
}