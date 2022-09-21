package chapters.chapter_05;

public class Exercise_40 {
	public static void main(String[] args) {
		
		int counterHeads = 0;
		int counterTails = 0;
		int flipping ;
		
		for(int i = 0 ; i < 1000000; i++) {
			flipping = (int)(Math.random() * 2);
			
			if(flipping == 0) {
				counterHeads++;
			}
			if(flipping == 1) {
				counterTails++;
			}
		}
		System.out.println("Heads : " + counterHeads);
		System.out.println("Tails : " + counterTails);
	}

}
