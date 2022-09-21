package chapters.chapter_03.checkpoints_03;

public class Checkpoint_06 {
	public static void main(String[] args) {

		int score = 88;

		if (score > 90) {
			score += score * 3 / 100;
		} 
		else {
			score -= score * 1 / 100;
		}

		System.out.println(score);
	}

}
