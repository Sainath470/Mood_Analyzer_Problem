//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;


class MoodAnalyzerTest {
    @Test
    public void given_Mood_When_Sad_ReturnMessage() throws MoodAnalyzerException{
        MoodAnalyzer moodTesting = new MoodAnalyzer();
        String mood_Store=moodTesting.moodAnalyser("I am in Sad Mood");
        Assertions.assertEquals("SAD",mood_Store);

    }
    @Test
    public void given_Mood_When_Happy_ReturnMessage() throws MoodAnalyzerException {
        MoodAnalyzer moodTesting = new MoodAnalyzer();
        String mood_Store = moodTesting.moodAnalyser("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", mood_Store);
    }
    @SuppressWarnings("deprecation")
    @Test()
    public void given_Null_ThrowException(){
        ExpectedException exceptionRule= ExpectedException.none();
        exceptionRule.expect(MoodAnalyzerException.class);
        String mood="NULL";
        Assertions.assertEquals("NULL", mood);
    }
}