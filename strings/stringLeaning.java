package string;

public class stringLeaning {
	public static void main(String[] args) {
		
		String name = "Viraj";
		String name2 = new String(" Patil");
		
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.substring(0,5));
		System.out.println(name.contains("Viraj"));
		
		System.out.println(name.equals(name2));
		
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" S Patil"));
		
		System.out.println(name.replace('V', 'K'));
		
		String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborgini";
		String allCars[] = cars.split(",");
		
		for(String car : allCars) {
			System.out.println(car);
		}
		
		System.out.println(name.indexOf('j'));
		
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String name3 = "    Viraj    ";
		System.out.println(name3);
		
		System.out.println(name.strip());
		
		
	}
}
