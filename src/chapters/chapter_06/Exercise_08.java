package chapters.chapter_06;

public class Exercise_08 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-7s%-15s%-15s\n" , "Celsius" , "Fahrenheit" , "|" , "Fahrenheit" , "Celsius");
        for (int i = 0; i < 65; i++){
            System.out.print("_");
        }
        for(double i = 40 , j = 120; i > 30 && j >=30; i-- , j -= 10 ){
            System.out.printf("\n%-15f%-15f%-7s%-15f%-15f\n" , i ,celsiusToFahrenheit(i) ,"|" , j , fahrenheitToCelsius(j) );

        }

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius =  (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
