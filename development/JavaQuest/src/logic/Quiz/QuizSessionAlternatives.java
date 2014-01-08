package logic.Quiz;

import client2.Quizz.QuizSessionSetter;
import client2.Quizz.QuizAlternativesViewSetter;
import client2.Quizz.QuizAlternativesListener;
import client2.Quizz.QuizAlternativesView;
import client2.*;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public class QuizSessionAlternatives extends QuizSession implements QuizAlternativesListener{
    
        
      
       private QuizAlternativesViewSetter qavs;
       
        
    public QuizSessionAlternatives(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton, boolean respondInSwedish, QuizSessionSetter setter ){
        super(studentName, language1, language2,  numberOfWordsSelected, threeAttemptsButton, setter);
        ((QuizAlternativesViewSetter)setter).setQuizAlternativesViewListener(this);
        glossaryList = new GlossaryListAlternatives();
        glossaryList.initialize(studentName, language2, numberOfWordsSelected, respondInSwedish);
        nextWord();
    
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
    
    @Override
      public void timerEvent(String event){
          super.timerEvent(event);
          if(event.equals("0")) {
              nextWord();
          }
      }
    
    public void nextWord(){
        if(attemptInProgress)
            return;
         if(finished) return;
        WordAlternative wa = ((GlossaryListAlternatives)glossaryList).nextWordAlternative();
      
        numberOfattemptsCounter = 1;
        
        if(wa!=null){
            timer.cancel();
            timer = new QuizTimer();
            timer.initialize(this, TIMER_INTERVAL, TIMER_DURATION);
            System.out.println(wa);
            
            ((QuizAlternativesViewSetter)ui).setWord(wa.getOrginal());
            
            String []ord =  wa.getAlternativesInRandomOrder();
   
            ((QuizAlternativesViewSetter)ui).setAlt1(ord[0]);
    
            ((QuizAlternativesViewSetter)ui).setAlt2(ord[1]);
    
            ((QuizAlternativesViewSetter)ui).setAlt3(ord[2]);
    
        }else {
            ((GlossaryListAlternatives)glossaryList).saveStats();
            finished = true;
            ui.setStatsDialog("Du är nu klar med quizzen! Du klarade " + glossaryList.getStats());
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
