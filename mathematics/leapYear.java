package dsa;

public class leapYear {
	public static void main(String[] args) {
		int year = 2032;
		System.out.println(leap(year));
	}
	public static boolean leap(int year) {
		if( year % 4 == 0) {
			if( year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
