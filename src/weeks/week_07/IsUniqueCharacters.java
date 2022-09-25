package weeks.week_07;

import java.util.Scanner;

public class IsUniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine();
        System.out.println((isUnique(str)));

    }
    public static boolean isUnique(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++){
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
        }
    }
        return true;
    }
}
