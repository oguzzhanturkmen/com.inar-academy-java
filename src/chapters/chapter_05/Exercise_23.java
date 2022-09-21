package chapters.chapter_05;

public class Exercise_23 {
	public static void main(String[] args) {
		double sum1 = 0.0;
		for(double i = 1; i < 50001; i++) {
			sum1 += (1 / i) ;
		}
		System.out.println(sum1);
		
		double sum2 = 0.0;
		
		for(double i = 50000; i > 0; i--) {
			sum2 += (1 / i) ;
		}
		System.out.println(sum2);
		System.out.println("Difference between sums : " + (sum2 - sum1));
	}

}
