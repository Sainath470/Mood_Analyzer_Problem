import java.util.Locale;
public class MoodAnalyzer {
    String message;
    public MoodAnalyzer()
    {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String moodAnalyser() {
        if(message.toLowerCase(Locale.ROOT).contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}