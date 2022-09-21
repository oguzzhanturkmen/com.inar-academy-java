package chapters.chapter_05;

public class Exercise_18_b {
	public static void main(String[] args) {

		System.out.println("Pattern B");

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7 - i + 1; j++) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}

}
