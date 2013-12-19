package logic.Quiz;

import client.QuizAlternativesView;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public class QuizSessionAlternatives extends QuizSession {
    
     @Override
    public boolean play() throws QuitException {
        
        QuizAlternativesView ui = new QuizAlternativesView();
        ui.initialize();
        ui.setOriginalWord("Hej");
        
        GlossaryListAlternatives glossaryList = new GlossaryListAlternatives();
        glossaryList.initialize("Herman", "english", 5);
        
        String word = glossaryList.nextWord();
        ui.setOriginalWord(word);
        
        return true;
    }
}
