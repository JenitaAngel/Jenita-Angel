public class Greatest {

	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 30;
		int r = (a > b && a > c) ? a : b;
		int d = (r > c) ? r : c;
		if (r > d) {
			System.out.println(r + " is greater");
		} else {
			System.out.println(d + " is greater");
		}
	}
}
