package chapters.chapter_12;

public class BinaryFormatException extends  NumberFormatException{


    public BinaryFormatException(String binary) {
        super(binary + "is not valid ");

    }
}
