package chapters.chapter_05;

public class Exercise_18_c {
	public static void main(String[] args) {

		System.out.println("Pattern C");

		for (int i = 1; i < 7; i++) {
			for (int j = 7; j > i ; j--) {
				System.out.print("  ");
			}
			for(int k = i; k > 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
