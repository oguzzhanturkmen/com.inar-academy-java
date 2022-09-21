package chapter01;

public class Chapter01_Exercise12 {
	public static void main(String[] args) {
		double seconds = 100 * 60 + 35;
		double miles_per_sec = 24 / seconds ;
		double km_per_hour = miles_per_sec * 60 * 60 * 1.6 ;
		System.out.println("Km per hour is : " + km_per_hour );
		
	}

}
