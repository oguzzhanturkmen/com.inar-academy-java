package chapters.chapter_05;

public class Exercise_07 {
	public static void main(String[] args) {
		
		double sum = 10000 ;
		double suppose = 10000;
		
		for(int i = 0; i < 10; i++ ) {
			if (i == 0) {
				
				System.out.println("Suppose is  " + suppose);
				continue;
			}
			suppose += (suppose * 5 / 100);
			if(i < 5) {
				sum += suppose;
			}
			
			System.out.println("Suppose is " + suppose);
		}
			
	
		System.out.println("Sum for 4 years : " + sum);
	}
}	
	
	


