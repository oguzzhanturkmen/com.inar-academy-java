package chapters.chapter_03.checkpoints_03;

public class Checkpoint_08 {
	public static void main(String[] args) {

		int x = 3;
		int y = 2;
		int z;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		}
		else
			System.out.println("x is " + x);
		
		//It gets inside of the first if but second if is false so the program ends.
	}

}
