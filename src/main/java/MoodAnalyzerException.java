public class MoodAnalyzerException extends Exception{

    public exceptionType type;

    public MoodAnalyzerException(String message)
    {
        super(message);
        this.type=type;
    }


    public enum exceptionType
    {
        NULL,
        EMPTY
    }

}
