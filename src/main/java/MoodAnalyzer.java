import java.util.Locale;
public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer() {
    }
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyser(String message) throws MoodAnalyzerException {
        try {
            if(message.length()==0)
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.EMPTY,"YOU HAVE GIVEN EMPTY,PLEASE CHECK AGAIN");
            if (message.toLowerCase(Locale.ROOT).contains("sad")) {
                return "SAD";
            }
             else
                    return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.NULL,"You have given NULL, PLEASE TRY AGAIN");
        }
    }
    }
