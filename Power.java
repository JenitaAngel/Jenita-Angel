public class Power {

	public static int output1;
	public static void userMethod(int input1) {
		int a = input1;
		int s = 0;
		int t = 0;
		int p = 0;
		int sum = 1;
		while (a > 0) {
			s = a % 10;
			a = a / 10;
			t++;
		}
		int[] b = new int[t];
		a = input1;
		for (int i = 0; i < t; i++) {
			b[i] = a % 10;
			a = a / 10;
		}
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				sum *= b[i];
			}
			p = p + sum;
			sum = 1;
		}
			output1 = p;
		}
			public static void main(String[] args) {
		userMethod(1234);
		System.out.println(output1);
	}
	}
	
