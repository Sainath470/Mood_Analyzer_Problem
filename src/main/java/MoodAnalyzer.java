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
            if (message.toLowerCase(Locale.ROOT).contains("sad")) {
                return "SAD";
            }
             else
                    return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException("You have given NULL, PLEASE TRY AGAIN");
        }
    }
    }
