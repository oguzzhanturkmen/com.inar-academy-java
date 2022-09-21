package chapters.chapter_05;

public class Exercise_10 {
	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i =1; i < 1001; i++) {
			if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				counter++;
				System.out.printf("%-3d" , i);
				System.out.print((counter % 10 == 0) ? "\n" :" ");
			}
			
		}
		
	}

}
