package recusion;

public class decimalTobinary {
	public static void main(String[] args) {
		String binary = findBinary(233,"");
		System.out.println(binary);
	}
	public  static String findBinary(int decimal, String result) {
		if(decimal == 0) {
			return result;
		}
		else {
			result = decimal % 2 + result;
			return findBinary(decimal / 2 , result);
		}
	}
}
