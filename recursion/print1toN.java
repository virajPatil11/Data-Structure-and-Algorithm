package recusion;


class Number{
	static final int N = 10;
	static int n = 1;
	
	void fun1() {
		if(n <= N) {
			System.out.print(n + " ");
			n++;
			fun2();
		}
		else {
			return;
		}
	}
	void fun2() {
		if(n <= N) {
			System.out.print(n + " ");
			n++;
			fun1();
		}
		else {
			return;
		}
	}
}

public class print1toN {
	public static void main(String[] args) {
		Number n = new Number();
		
		n.fun1();
	}
}
