package com.user.registration.Test;

import org.hamcrest.CoreMatchers;

import com.user.regestration.MoodAnalyser;
import com.user.regestration.MoodAnalysisException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	
		@Test
	    public void testMoodAnalyse(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	     String mood =  moodAnalyser.analyseMood("This is a sad message");
	        Assert.assertTrue(mood, CoreMatchers.is("SAD") != null);
	    }
		
		@Test
		public void givenNullMoodShouldReturnHappy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			 String mood =  moodAnalyser.analyseMood(null);
			 Assert.assertEquals("Happy", mood);
		}
		
		@Test
		public void givenValidMoodMessage() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood ="";
			try {
				moodAnalyser.validAnalyse(null);
			} catch (MoodAnalysisException e) {
				Assert.assertEquals("Please enter proper message", e.getMessage());
			}
		
		}

}
