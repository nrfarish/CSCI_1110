package excercise10_3;

public class MyInteger {
	
	int value = 0;
	
	MyInteger() {
		
	}
	
	MyInteger(int a){
		value = a;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	static boolean isEven(int a) {
		return (a % 2 == 0);
	}
	
	static boolean isOdd(int a) {
		return (a % 2 != 0);
	}
	
	static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	
	static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	
	static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	
	public boolean equals(int a, int b) {
		return (a == b);
	}
	
	public boolean equals(MyInteger a) {
		return (a.getValue() == this.value);
	}
	
	static int parseInt(char[] a) {
		String string = "";
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			string = string + a[i];
		}
		num = MyInteger.parseInt(string);
		return num;
	}
	
	static int parseInt(String a) {
		int num = 0;
		for (int i = 0; i < a.length(); i++) {
			num *= 10;
			num += (a.charAt(i) - '0');
		}
		return num;
	}
	
}
