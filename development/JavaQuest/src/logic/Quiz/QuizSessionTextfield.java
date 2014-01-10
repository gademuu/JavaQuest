package logic.Quiz;

import client2.Quizz.QuizAlternativesViewSetter;
import client2.Quizz.QuizTextListener;
import client2.Quizz.QuizTextViewSetter;

/**
 * Handles a quiz session with a text field.
 * @author herman
 */
public class QuizSessionTextfield extends QuizSession implements  QuizTextListener {
    
    /**
     * Construcot for the QuizSessionTextfield
     * @param studentName
     * @param language1
     * @param language2
     * @param numberOfWordsSelected
     * @param threeAtemptsButton
     * @param respondInSwedish
     * @param setter
     */
    public QuizSessionTextfield(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAtemptsButton, boolean respondInSwedish, QuizTextViewSetter setter) {
        super(studentName, language1, language2, numberOfWordsSelected,threeAtemptsButton, setter);
        ((QuizTextViewSetter)setter).setQuizTextViewListener((QuizTextListener) this);
        glossaryList = new GlossaryListTextfield();
        glossaryList.initialize(studentName, language2, numberOfWordsSelected, respondInSwedish);
        nextWord();
    }
    
    /**
     * Checks if the ok button is pressed.
     * @param answer
     */
    public void okButton(String answer){
        isCorrect(answer);
    }
                  
    /**
     *
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
     * Give the user the next word after pressing the next button.
     */
    public void nextWord(){
        if(attemptInProgress)
    return;
        if(finished) return;
        numberOfattemptsCounter = 1;
        String w = glossaryList.nextWord();    
        if(!w.equals("")){
            timer.cancel();
            timer = new QuizTimer();
            timer.initialize(this, TIMER_INTERVAL, TIMER_DURATION);
            System.out.println(w);
            ((QuizTextViewSetter)ui).setWord(w);
        } else {
            ((GlossaryListTextfield)glossaryList).saveStats();
            finished = true;
            ui.setStatsDialog("Du är nu klar med quizzen! Du klarade " + glossaryList.getStats());
        }   
    }    
}
