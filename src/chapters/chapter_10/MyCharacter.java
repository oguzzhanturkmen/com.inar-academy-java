package chapters.chapter_10;

public class MyCharacter {

    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }



    private char getChar() {
        return this.ch;
    }

    public boolean compareTo(MyCharacter c) {
        return this.ch == c.getChar();
    }

    public void toLowerCase() {
        this.ch = Character.toLowerCase(this.ch);
    }

    public void toUpperCase() {
        this.ch = Character.toUpperCase(this.ch);
    }

    public boolean isLetter() {
        return (this.ch >= 'a' && this.ch <= 'z') || (this.ch >= 'A' && this.ch <= 'Z');
    }

    public boolean isDigit() {
        return (this.ch >= '0' && this.ch <= '9');
    }

    public boolean isDigitOrLetter() {
        return this.isDigit() || this.isLetter();
    }
}
