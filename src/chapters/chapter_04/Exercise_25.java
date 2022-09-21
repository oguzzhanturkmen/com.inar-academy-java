package chapters.chapter_04;

public class Exercise_25 {
	public static void main(String[] args) {
		
		char ch1 =(char)((int)((Math.random() * 26) + 65));
		char ch2 =(char)((int)((Math.random() * 26) + 65));
		char ch3 =(char)((int)((Math.random() * 26) + 65));
		
		int randNumber = (int)(Math.random() * 9001 +1000);
		
		String plate = "" + ch1 + ch2 + ch3 + randNumber;
		System.out.println(plate);
	}

}
