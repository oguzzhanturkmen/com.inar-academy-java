package chapters.chapter_05;

public class Exercise_06 {
	public static void main(String[] args) {
		
		System.out.printf("Miles    Kilometers  |  Kilometers    Miles\n");
		
		for(int i = 1, j = 20; i < 11 && j < 66 ; i++ , j+=5) {
			System.out.printf("%-9d%-10.3f  |  %-11d%9.3f\n" , i , i * 1.609 , j ,  j / 1.609);
		}
	}

}
