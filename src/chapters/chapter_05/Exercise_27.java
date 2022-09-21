package chapters.chapter_05;

public class Exercise_27 {
	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i = 101 ; i < 2101 ; i++) {
			if( (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
				counter++;
				System.out.print(i);
				System.out.print((counter % 10 == 0) ? "\n" : " " );
			}
		}
		System.out.println("\nNumber of leap years is : " + counter);
	}

}
