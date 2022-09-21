package chapters.chapter_02.checkpoints_02;

public class Checkpoint_23 {
	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalMilliseconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMilliseconds % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
	}

}
