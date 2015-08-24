
class interview {
	public static void main(String[] args) {
		System.out.println("hello");
		printFib(10);
	}
	
	public static void printFib(int num) {
		if (num <= 0) return;
		if (num == 1) {
			System.out.println ("0");
			return;
		}
		System.out.print ("0 1");
		if (num == 2) {
			System.out.println();
			return;
		}
		int fib0 = 0;
		int fib1 = 1;
		for (int i = 3; i <=num; i++) {
			int fib = fib0 + fib1; 
			System.out.print (" " + fib);
			fib0 = fib1;
			fib1 = fib;
		}
		System.out.println();
	}
}