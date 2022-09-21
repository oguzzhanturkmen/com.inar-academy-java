package chapters.chapter_05;

public class Exercise_19 {
	public static void main(String[] args) {
		
		
		//NOT FINISHED YET
		for(int i = 1; i < 9; i++) {
			
			for(int j = 0; j < 8 - i; j++) {
				System.out.print("    ");
			}
			System.out.printf("%-4d" , 1);
			for(int k = 1; k < i  ; k++ ) {
				if(i == 1) {
					break;
				}
				
				System.out.printf("%-4d" , (int)Math.pow(2, k));
			}
			for(int m = i - 2; m > 0 ; m-- ) {
				if(i == 1) {
					break;
				}
				
				System.out.printf("%-4d" , (int)Math.pow(2, m));
			}
			if(i != 1) {
				System.out.printf("%-4d" ,1);
			}
			System.out.println();
		}
	}
}
