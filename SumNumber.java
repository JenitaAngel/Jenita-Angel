import java.util.Scanner;
public class SumNumber {
  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int number = Math.abs(s.nextInt());
    int x = 0;
    int sum = 0;
    while(number > 0) {
      x = number % 10;
      number = number / 10;
      sum = sum + x;
    }
    System.out.println("sum is: " + sum);
    scr.close();
  }
}
