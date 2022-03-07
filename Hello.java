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
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 50; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
  }
}