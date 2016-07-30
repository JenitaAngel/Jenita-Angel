import java.util.Scanner;
public class UserGreaterNumber {
  Scanner scr = new Scanner(System.in);
  int a = scr.nextInt();
  int b = scr.nextInt();
  int c = scr.nextInt();
  int r = 0;
  int d = 0;
  int r = (a > b && a > c) ? a : b;
		int d = (r > c) ? r : c;
		if (r > d) {
			System.out.println(r + " is greater");
		} else {
			System.out.println(d + " is greater");
		}
	}
