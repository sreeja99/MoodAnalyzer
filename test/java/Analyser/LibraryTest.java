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
}
