import java.util.Scanner;
public class ArmStrong {
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    int d = 0;
    int e;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Number: ");
    a = s.nextInt();
    e = a;
    while(a > 0) {
      b = a % 10;
      c = b * b * b;
      a = a / 10;
      d = c + d;
    }
    if(e == d) {
      System.out.println(e + " is an armstrong number");
    } else {
        System.out.println(e + " is not an armstrong number");
    }
  }
}
