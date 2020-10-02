package Analyser;

import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void StringAnalyzeMethod(){
    	MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
    }
    @Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
	//UC2
}
