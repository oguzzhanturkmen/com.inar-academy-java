package chapters.chapter_05;

public class Exercise_20 {
	public static void main(String[] args) {
		boolean isPrime = true;
		int counter  = 0;
		
		for(int i=2; i < 1001; i++ ) {
			isPrime = true;
			for(int j = i - 1 ; j > 1 ; j--) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}if(isPrime) {
				counter++;
				System.out.print(i);
				System.out.print((counter % 8 == 0) ? "\n" : " ");
			}
	}

}
}