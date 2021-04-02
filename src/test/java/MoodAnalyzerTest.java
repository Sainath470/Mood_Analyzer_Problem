import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MoodAnalyzerTest {
    @Test
    public void given_Mood_When_HappySad_ReturnMessage() {
        MoodAnalyzer moodTesting = new MoodAnalyzer();
        String mood = moodTesting.moodAnalyser("I am in any mood");
        Assertions.assertEquals("HAPPY", mood);

    }
}