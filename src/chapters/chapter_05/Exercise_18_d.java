package chapters.chapter_05;

public class Exercise_18_d {
	public static void main(String[] args) {

		System.out.println("Pattern D");

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k < 8 - i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
