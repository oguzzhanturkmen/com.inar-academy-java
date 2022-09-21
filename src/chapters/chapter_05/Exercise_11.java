package chapters.chapter_05;

public class Exercise_11 {
	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i = 100 ; i < 201; i++ ) {
			if(i % 5 == 0 &&  i % 6 == 0) {
				continue;
			}
			if(i % 5 == 0) {
				counter++;
				System.out.printf("%-3d" , i);
				System.out.print((counter % 10 == 0) ? "\n" : " ");
			}
			if(i % 6 == 0) {
				counter++;
				System.out.printf("%-3d" , i);
				System.out.print((counter % 10 == 0) ? "\n" : " ");
			}
		}
	}

}
