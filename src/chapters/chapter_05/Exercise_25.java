package chapters.chapter_05;

public class Exercise_25 {
	public static void main(String[] args) {
		
		double total = 0;
		for(double i = 1 ; i < 10001 ; i++ ) {
			total += (Math.pow((-1) , i + 1)) / (2 * i - 1);
		}
		System.out.println("i = 10000  --> " + 4 * total);
		
		total = 0;
		for(double i = 1 ; i < 20001 ; i++ ) {
			total += (Math.pow((-1) , i + 1)) / (2 * i - 1);
		}
		System.out.println("i = 20000  --> " + 4 * total);
		
		total = 0;
		for(double i = 1 ; i < 100001 ; i++ ) {
			total += (Math.pow((-1) , i + 1)) / (2 * i - 1);
		}
		System.out.println("i = 100000 --> " + 4 * total);
	}

}
