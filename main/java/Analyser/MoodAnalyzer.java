package Analyser;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			message = message.toLowerCase();
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			return "HAPPY";
			//UC2.1
		}
		//UC2
}
}
