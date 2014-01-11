package logic.Quiz;

import client2.Quizz.QuizSessionSetter;
import client2.Quizz.QuizAlternativesViewSetter;
import client2.Quizz.QuizAlternativesListener;
import client2.Quizz.QuizAlternativesView;
import client2.*;


/**
 * Handles a quiz session with three alternatives.
 * @author herman
 */
public class QuizSessionAlternatives extends QuizSession implements QuizAlternativesListener{
    
        
      
       private QuizAlternativesViewSetter qavs;

    /**
     * Constructor for the QuizSessionAlternatives.
     * @param studentName
     * @param language1
     * @param language2
     * @param numberOfWordsSelected
     * @param threeAttemptsButton
     * @param respondInSwedish
     * @param setter
     */
    public QuizSessionAlternatives(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton, boolean respondInSwedish, QuizSessionSetter setter ){
        super(studentName, language1, language2,  numberOfWordsSelected, threeAttemptsButton, setter);
        ((QuizAlternativesViewSetter)setter).setQuizAlternativesViewListener(this);
        glossaryList = new GlossaryListAlternatives();
        glossaryList.initialize(studentName, language2, numberOfWordsSelected, respondInSwedish);
        nextWord();
    
    }
 
    /**
     * Checks if the word one button is pressed.
     * @param answer
     */
    public void wordOneBtnPressed(String answer){
        isCorrect(answer);    
    }
          
    /**
     * Checks if the word two button is pressed.
     * @param answer
     */
    public void wordTwoBtnPressed(String answer){
        isCorrect(answer);
    }
    
    /**
     * Checks if the word three button is pressed.
     * @param answer
     */
    public void wordThreeBtnPressed(String answer){
        isCorrect(answer);
    }
    
    /**
     * If the timer equals "0", the next word will appear. 
     * @param event
     */
    @Override
      public void timerEvent(String event){
          super.timerEvent(event);
          if(event.equals("0")) {
              nextWord();
          }
      }
    
    /**
     * Gives the user the next word after pressing a word button.
     */
    public void nextWord(){
        if(attemptInProgress)
            return;
         if(finished) return;
        WordAlternative wa = ((GlossaryListAlternatives)glossaryList).nextWordAlternative();
      
        numberOfattemptsCounter = 1;
        //
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
}
