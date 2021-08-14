package recusion;

class Num{
	static final int N = 10;
	static int n = 1;
	
	void fun1() {
		if(n <= N) {
			System.out.print(n+1 + " ");
			n++;
			fun2();
		}
		else {
			return;
		}
	}
	void fun2() {
		if(n <= N) {
			System.out.print(n-1 + " ");
			n++;
			fun1();
		}
		else {
			return;
		}
	}
}


public class evenOddseries {
	public static void main(String[] args) {
		Num n = new Num();
		n.fun1();
	}

}
