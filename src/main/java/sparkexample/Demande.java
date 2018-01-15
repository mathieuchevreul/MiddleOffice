package sparkexample;

public class Demande {
	private String question;
	private String[] reponses;
	
	public Demande (String question, String[] reponses)
	{
		this.question = question;
		this.reponses = reponses;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public String[] getReponses() {
		return this.reponses;
	}
}
