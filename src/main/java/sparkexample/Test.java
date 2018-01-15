package sparkexample;

import org.json.*;
import static spark.Spark.*;

import java.util.*;

public class Test {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Demande> demandes = new ArrayList<Demande>();

	public static void main(String[] args) {
    	
        setPort(80);

        post("/demandes", (request, response) -> {
        	
        	JSONObject obj = new JSONObject(request.body());
        	String question = obj.getString("question");

        	JSONArray reponsesJSON = obj.getJSONArray("reponses");
        	String[] reponses = new String[reponsesJSON.length()]; 
        	for (int i = 0; i < reponsesJSON.length(); i++)
        	{
        	    reponses[i] = reponsesJSON.getString(i);
        	}
        	
        	demandes.add(new Demande(question, reponses));
        	
        	return "Ajouté";
        });

        get("/demandes", (request, response) -> {
        	JSONObject obj = new JSONObject();
        	
        	for (Demande demande : demandes){
        		obj.append("question", demande.getQuestion());
        		obj.append("reponses", demande.getReponses());
        	}
        	
            return obj.toString();
        });
    }
}
