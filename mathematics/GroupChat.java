package learn;

class Chck{
	static final int N = 20;
	static int n = 1;
	
	static void fun1() {
		if( n <= N) {
			System.out.printf("%d ", n);
			n++;
			fun2();
		}
		else {
			return;
		}
	}
	
	static void fun2() {
		if( n <= N) {
			System.out.printf("%d ", n);
			n++;
			fun1();
		}
		else {
			return;
		}
	}
	
}
public class GroupChat
{
	public static void main(String[] args) {
		Chck c = new Chck();
		
		c.fun1();
	}
}
