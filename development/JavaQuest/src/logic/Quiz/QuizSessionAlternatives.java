package logic.Quiz;

import client.QuizAlternativesView;
import client2.*;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public class QuizSessionAlternatives extends QuizSession implements QuizAlternativesListener{
    
        
       private GlossaryListAlternatives gla;
       private QuizAlternativesViewSetter qavs;
        
    public QuizSessionAlternatives(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton, QuizSessionSetter setter ){
        super(studentName, language1, language2,  numberOfWordsSelected, threeAttemptsButton, setter );
        gla = new GlossaryListAlternatives();
        
        gla.initialize(studentName, language2, numberOfWordsSelected);
    
    }
    
    /* @Override
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
  */  
    
    public void wordOneBtnPressed(String answer){
        isCorrect(answer);
        
        }
       
       
    public void wordTwoBtnPressed(String answer){
        isCorrect(answer);
    }
    public void wordThreeBtnPressed(String answer){
        isCorrect(answer);
    }
    
    public void nextWord(){
        WordAlternative wa = gla.nextWordAlternative();
        numberOfattemptsCounter = 0;
        
        if(wa!=null){
            System.out.println(wa);
        }else {
            gla.saveStats();

        }
     }
    
  /*  public static void main(String[] args){
       
        QuizSessionAlternatives qsa = new QuizSessionAlternatives("herman","swedish","english",11,true);
        String []s ={"car","hello","smoke","girl","boy","floor"};
        for(int i=0; i<=10;i++){
            
            qsa.nextWord();
            qsa.wordOneBtnPressed(s[i]);
              
        }
        
    }*/
    
    
}
