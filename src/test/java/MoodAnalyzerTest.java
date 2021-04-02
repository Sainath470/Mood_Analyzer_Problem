import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class MoodAnalyzerTest {
    @Test
    public void given_Mood_When_HappySad_ReturnMessage() {
        MoodAnalyzer moodTesting = new MoodAnalyzer("I am in sad mood");
        moodTesting.message="I am in Sad mood";
        String mood_Store=moodTesting.moodAnalyser();
        Assertions.assertEquals("SAD",mood_Store);

    }
}