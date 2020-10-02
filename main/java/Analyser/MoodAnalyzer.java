package Analyser;

import Analyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood()throws MoodAnalysisException {
		try {
			if(message.length()==0) 
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY, "Mood cannot be empty");
			message = message.toLowerCase();
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL, "Mood cannot be null");
			//UC2.1
		}
		//UC3
}
}
