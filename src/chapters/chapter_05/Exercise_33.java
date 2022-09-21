package chapters.chapter_05;

public class Exercise_33 {
	public static void main(String[] args) {
		
		
		for(int i = 1; i < 10000; i++) {
			double sum = 0;
			
			for(int j = i / 2; j > 0 ; j--) {
				if(i % j == 0){
					sum += j;
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

}
