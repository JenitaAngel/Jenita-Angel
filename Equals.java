public class Equals {

	public static void main(String[] args) {
		String str = new String(args[0]);
		String str1 = new String(args[1]);
		if (str.equals(str1)) {
			System.out.println(str+str1 + " is a same string");
		} else {
			System.out.println("It is not a same string");
		}
	}
}
