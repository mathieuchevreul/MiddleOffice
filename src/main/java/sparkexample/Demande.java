package sparkexample;

public class Demande {
	private String id;
	private String question;
	private String[] reponses;
	private int oui;
	private int non;
	
	public Demande (String id, String question, String[] reponses)
	{
		this.id = id;
		this.question = question;
		this.reponses = reponses;
		this.oui = 0;
		this.non = 0;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public String[] getReponses() {
		return this.reponses;
	}
	
	public int getOui() {
		return this.oui;
	}
	
	public int getNon() {
		return this.non;
	}
	
	public void addOui() {
		oui++;
	}
	
	public void addNon() {
		non++;
	}
}
