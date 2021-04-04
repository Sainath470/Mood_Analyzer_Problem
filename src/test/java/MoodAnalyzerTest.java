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

    @Test()
    public void given_Null_ThrowException() {
        MoodAnalyzer moodTesting=new MoodAnalyzer(null);
        try{
            moodTesting.moodAnalyser(null);
        }
        catch(MoodAnalyzerException e)
        {
            Assertions.assertEquals(MoodAnalyzerException.exceptionType.NULL,e.type);
        }
    }

        @Test
        public void given_Empty_ThrowException() {
            MoodAnalyzer moodTesting=new MoodAnalyzer();
            try{
                moodTesting.moodAnalyser("");
            }
            catch(MoodAnalyzerException e)
            {
                Assertions.assertEquals(MoodAnalyzerException.exceptionType.EMPTY,e.type);
            }
        }
}