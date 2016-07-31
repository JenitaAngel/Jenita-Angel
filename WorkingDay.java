import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		switch (s) {
		case "monday":
			System.out.println("true");
			break;
		case "tuesday":
			System.out.println("true");
			break;
		case "wednesday":
			System.out.println("true");
			break;
		case "thursday":
			System.out.println("true");
			break;
		case "friday":
			System.out.println("true");
			break;
		case "saturday":
			System.out.println("true");
			break;
		case "sunday":
			System.out.println("false");
			break;
		}
		scr.close();
	}
}
