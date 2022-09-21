package chapter01;

public class Chapter01_Exercise11 {
	public static void main(String[] args) {
		int year_in_second = 365 * 24 * 60 * 60 ;
		int death= year_in_second /13;
		int birth= year_in_second / 7;
		int new_immigrant = year_in_second / 45;
		int population = 312032486 ;

		System.out.println("First year :" + (population + birth + new_immigrant - death));
		System.out.println("Second year :" + (population + ((birth + new_immigrant- death) * 2)));
		System.out.println("Third year :" + (population + ((birth + new_immigrant- death) * 3)));
		System.out.println("Fourth year :" + (population + ((birth + new_immigrant- death) * 4)));
		System.out.println("Fifth year :" + (population + ((birth + new_immigrant- death) * 5)));
		
	}

}
