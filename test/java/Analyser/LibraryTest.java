package Analyser;

import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void StringAnalyzeMethod(){
    	MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String mood=null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		assertEquals("SAD", mood);
    }
    @Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
		String mood=null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException_OfTypeNull() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		try {
			moodAnalyser.analyseMood();
		}
		catch(MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	//UC3.1
	
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException_OfTypeEmpty() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
		try {
			moodAnalyser.analyseMood();
		}
		catch(MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
