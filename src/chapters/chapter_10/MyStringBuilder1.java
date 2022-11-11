package chapters.chapter_10;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }
    public String toString() {
        return this.s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        String str = this.s + s.toString();
        return new MyStringBuilder1(str);
    }
    public MyStringBuilder1 append(int i) {
        String str = this.s + String.valueOf(i);
        return new MyStringBuilder1(str);
    }
    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        this.s = this.s.toLowerCase();
        return new MyStringBuilder1(this.s);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        this.s = this.s.substring(begin, end);
        return new MyStringBuilder1(this.s);
    }
}
