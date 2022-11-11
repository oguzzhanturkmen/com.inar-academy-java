package chapters.chapter_10;

public class MyString2 {

    public char[] chars;

    public MyString2() {
        this.chars = new char[8];
    }

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public int compare(String s) {
        if (chars.length < s.length()) {
            return -1;
        } else if (chars.length == s.length()) {
            return 0;
        }
        return 1;
    }

    public MyString2 substring(int begin) {
        if (!((begin > 0 && begin < chars.length - 1))) {
            System.out.println("Invalid input !!!");
            System.exit(-1);
        }

        String str = "";

        for (int  oldIndex = begin; oldIndex < chars.length ;  oldIndex++) {
            str += chars[oldIndex];
        }
        return new MyString2(str);
    }

    public MyString2 toUpperCase() {
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                str += (char) (chars[i] - 32);
            } else {
                str += chars[i];
            }
        }
        return new MyString2(str);
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("True") : new MyString2("False");
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }

}
