package chapters.chapter_12;

public class HexFormatException extends  NumberFormatException{


    public HexFormatException(String hex) {
        super(hex + "is not valid ");

    }
}
