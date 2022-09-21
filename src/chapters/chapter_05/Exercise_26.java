package chapters.chapter_05;

public class Exercise_26 {
	public static void main(String[] args) {
		
		double e = 1;
		double permutation ;
		for(double i = 1; i <= 10000; i ++) {
			permutation = i ;
			for(double j = i - 1 ; j > 0; j--) {
				permutation *= j ;
			}
			e += (1 / permutation);
		}
		System.out.println("e 1 is " + e);
		
		e = 1;
		permutation = 1;
		for(double i = 1; i <= 20000; i ++) {
			permutation = i ;
			for(double j = i - 1; j > 0; j--) {
				permutation *= j ;
			}
			e += 1 / permutation;
		}
		System.out.println("e 2 is " + e);
		
		e = 1;
		permutation = 1;
		for(double i = 1; i <= 100000; i ++) {
			permutation = i ;
			for(double j = i - 1; j > 0; j--) {
				permutation *= j ;
			}
			e += 1 / permutation;
		}
		System.out.println("e 3 is " + e);
		
		
	}

}
