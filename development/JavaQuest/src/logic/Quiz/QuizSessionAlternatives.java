package logic.Quiz;

import client.QuizAlternativesView;
import client2.QuizAlternativesListener;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public class QuizSessionAlternatives extends QuizSession implements QuizAlternativesListener{
    
        
       private GlossaryListAlternatives gla;
        
    public QuizSessionAlternatives(String studentName, String language1, String language2, int numberOfWordsSelected){
        super(studentName, language1, language2,  numberOfWordsSelected);
        gla = new GlossaryListAlternatives();
        
        gla.initialize(studentName, language2, numberOfWordsSelected);
    
    }//blablalbalba så jag kan commita
    
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
        
    
        if(gla.isCorrect(answer)) {
            System.out.println("correct!");

        }else 
        System.out.println("wrong");
        }
       
    public void wordTwoBtnPressed(){
        
    }
    public void wordThreeBtnPressed(){
        
    }
    
    public void nextWord(){
        WordAlternative wa = gla.nextWordAlternative();
        
        if(wa!=null){
            System.out.println(wa);
        }else {
            gla.saveStats();

        }
     }
    
    public static void main(String[] args){
       
        QuizSessionAlternatives qsa = new QuizSessionAlternatives("herman","swedish","english",5);
        String []s ={"car","hello","smoke","girl","boy","floor"};
        for(int i=0; i<=5;i++){
            
            qsa.nextWord();
            qsa.wordOneBtnPressed(s[i]);
             
        
        
        
        }
        
    }
    
    
}
