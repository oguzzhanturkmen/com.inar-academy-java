package chapters.chapter_05;

public class Exercise_13 {
	public static void main(String[] args) {
		
		int number = 0;
		for(int i = 1 ; Math.pow(i, 3) < 12000; i++) {
			number = i ;
		}
		System.out.println(number);
		
	}

}
