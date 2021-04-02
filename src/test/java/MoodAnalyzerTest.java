import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class MoodAnalyzerTest {
    @Test
    public void given_Mood_When_HappySad_ReturnMessage() {
        MoodAnalyzer moodTesting = new MoodAnalyzer();
        moodTesting.message="I am in Happy mood";
        String mood_Store=moodTesting.moodAnalyser();
        Assertions.assertEquals("HAPPY",mood_Store);

    }
}