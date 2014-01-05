package logic.Quiz;

import client2.Quizz.QuizAlternativesViewSetter;
import client2.Quizz.QuizTextListener;
import client2.Quizz.QuizTextViewSetter;

/**
 *
 * @author herman
 */
public class QuizSessionTextfield extends QuizSession implements  QuizTextListener {
    
    

    public QuizSessionTextfield(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAtemptsButton, QuizTextViewSetter setter) {
        super(studentName, language1, language2, numberOfWordsSelected,threeAtemptsButton,setter);
        ((QuizTextViewSetter)setter).setQuizTextViewListener((QuizTextListener) this);
        glossaryList = new GlossaryListTextfield();
        glossaryList.initialize(studentName, language2, numberOfWordsSelected);
    }
    
           
            public void okButton(String answer){
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
                 numberOfattemptsCounter = 0;
                String w = glossaryList.nextWord();    
                if(!w.equals("")){
                     timer.cancel();
                     timer = new QuizTimer();
                     timer.initialize(this, TIMER_INTERVAL, TIMER_DURATION);
                    System.out.println(w);
                     ((QuizTextViewSetter)ui).setWord(w);
               }else{
                     ((GlossaryListTextfield)glossaryList).saveStats();
                        finished = true;
                        ui.setStatsDialog("Du är nu klar med quizzen! Du klarade " + glossaryList.getStats());
                }   
            }
    
    
    
}
