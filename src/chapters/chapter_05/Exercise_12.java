package chapters.chapter_05;

public class Exercise_12 {
	public static void main(String[] args) {
		
		int number = 0;
		for(int i = 1 ; Math.pow(i, 2) < 12000; i++) {
			number = i ;
		}
		System.out.println(number+1);
		
	}

}
