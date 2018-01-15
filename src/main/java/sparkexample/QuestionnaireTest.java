package sparkexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuestionnaireTest {

	@Test
	void test() {
		
		//Creation classe demande
		String[] reponses = {"Bleu", "Rouge", "Jaune", "Vert"};
				
		Demande demande = new Demande("Quelle est votre couleur preferee ?", reponses);
		
		//Creation classe questionnaire
		Questionnaire quest = new Questionnaire();
		
		quest.demandes.add(demande);
	}

}
