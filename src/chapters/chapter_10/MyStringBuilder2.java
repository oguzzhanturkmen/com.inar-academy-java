package chapters.chapter_10;

public class MyStringBuilder2 {

    private char[] chars;

    public MyStringBuilder2(){
        chars = new char[8];
    }
    public MyStringBuilder2(char[] chars){
        this.chars = chars;
    }
    public MyStringBuilder2(String s){
        this.chars = s.toCharArray();
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < this.chars.length; i++) {
            str += this.chars[i];
        }
        return str;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String begin = toString().substring(0 ,offset);
        String end = toString().substring(offset);
        String output = begin + s.toString() + end;

        return new MyStringBuilder2(output.toCharArray());
    }
    public MyStringBuilder2 reverse(){
        char[] array = new char[chars.length];

        for (int i = 0 , j = chars.length - 1; i < chars.length; i++ , j--) {
            array[j] = chars[i];
        }
        return new MyStringBuilder2(array);
    }
    public MyStringBuilder2 substring(int begin){
        return new MyStringBuilder2(toString().substring(begin).toCharArray());
    }
    public MyStringBuilder2 toUpperCase(){
        return new MyStringBuilder2(toString().toUpperCase().toCharArray());
    }
}
