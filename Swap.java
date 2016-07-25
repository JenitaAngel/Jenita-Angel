public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int temp;
		System.out.println("Before Swapping: ");
		System.out.println("a = " + a + "\tb = " + b + "\tc = " + c);
		temp = c;
		c = b;
		b = a;
		a = temp;
		System.out.println("After Swapping: ");
		System.out.println("a = " + a + "\tb = " + b + "\tc = " + c);
	}
}
