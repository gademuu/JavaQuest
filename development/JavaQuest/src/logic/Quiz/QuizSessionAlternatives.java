package logic.Quiz;

import client2.QuizAlternativesView;
import client2.*;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public class QuizSessionAlternatives extends QuizSession implements QuizAlternativesListener{
    
        
      
       private QuizAlternativesViewSetter qavs;
        
    public QuizSessionAlternatives(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton, QuizSessionSetter setter ){
        super(studentName, language1, language2,  numberOfWordsSelected, threeAttemptsButton, setter );
        ((QuizAlternativesViewSetter)setter).setQuizAlternativesViewListener(this);
        glossaryList = new GlossaryListAlternatives();
        glossaryList.initialize(studentName, language2, numberOfWordsSelected);
    
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
        if(attemptInProgress)
            return;
        WordAlternative wa = ((GlossaryListAlternatives)glossaryList).nextWordAlternative();
      
        numberOfattemptsCounter = 0;
        
        if(wa!=null){
            System.out.println(wa);
            
            ((QuizAlternativesViewSetter)ui).setWord(wa.getOrginal());
            
             String []ord =  wa.getAlternativesInRandomOrder();
   
            ((QuizAlternativesViewSetter)ui).setAlt1(ord[0]);
    
            ((QuizAlternativesViewSetter)ui).setAlt2(ord[1]);
    
            ((QuizAlternativesViewSetter)ui).setAlt3(ord[2]);
    
        }else {
            ((GlossaryListAlternatives)glossaryList).saveStats();
            finished = true;
         

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
