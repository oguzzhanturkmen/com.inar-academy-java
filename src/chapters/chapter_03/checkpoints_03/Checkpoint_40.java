package chapters.chapter_03.checkpoints_03;

public class Checkpoint_40 {
	public static void main(String[] args) {
		
	int x = 7;
	int y = 7;
	
	System.out.println((x > 0 && x < 10));
	System.out.println(((x > 0) && (x < 10)));
	//yes they are the same
	
	System.out.println((x > 0 || x < 10));
	System.out.println(((x > 0) || (x < 10)));
	//yes they are the same
	
	System.out.println((x > 0 || x < 10 && y< 0));
	System.out.println((x > 0 || (x < 10 && y < 0)));
	
	// yes they are the same
	}

}
