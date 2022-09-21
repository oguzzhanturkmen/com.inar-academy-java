package chapters.chapter_05;

public class Exercise_15 {
	public static void main(String[] args) {
		int counter = 0;
		for(int i = '!'; i < '~'; i++) {
			System.out.print((char)i);
			counter++;
			System.out.print((counter % 10 == 0) ? "\n" : " ");
			
		}
	}

}
