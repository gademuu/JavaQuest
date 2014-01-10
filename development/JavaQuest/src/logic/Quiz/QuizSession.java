package logic.Quiz;


import client2.Quizz.QuizSessionSetter;
import client2.Quizz.QuizTimerListener;
import client2.Quizz.QuizView;
import logic.Common.QuitException;

/**
 * Super class to the the classes QuizSessionAlternatives and QuizSessionTextfield. 
 * Handles a quiz session. 
 * @author herman
 */
public abstract class QuizSession implements QuizTimerListener{
    //Constants

    protected static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    protected static final long TIMER_INTERVAL = 100;

    protected static final long TIMER_DURATION = 20000;
    //End of constants
    
    //Variables
    protected QuizSessionSetter ui;

    protected GlossaryList glossaryList;

    protected QuizTimer timer;

    protected String language1;

    protected String language2;

    protected String studentName;

    protected int numberOfWordsSelected;

    protected boolean threeAttemptsButton =false;

    protected int numberOfattemptsCounter = 1; 

    protected int numberOfCorrectAnswers = 0;

    protected boolean finished = false;

    protected boolean attemptInProgress = false;
    
    //End of variables

    /**
     * Constructor for the QuizSession.
     * @param studentName
     * @param language1
     * @param language2
     * @param numberOfWordsSelected
     * @param threeAttemptsButton
     * @param setter
     */
    public QuizSession(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton,QuizSessionSetter setter ){
          this.studentName = studentName;
          this.language1 = language1;
          this.language2 = language2;
          this.numberOfWordsSelected = numberOfWordsSelected;
          this.threeAttemptsButton  = threeAttemptsButton ;
          this.ui = setter;
          timer = new QuizTimer();
    
      
      }

    /**
     * Sets the timer. 
     * @param event
     */
    public void timerEvent(String event){
          ui.setTime(event);
      }

    /**
     * Checks if the answer is correct.
     * @param answer
     */
    protected void isCorrect(String answer){
            if(finished)
                     return;
           if(numberOfattemptsCounter == MAX_NUMBER_OF_ATTEMPTS){
                 System.out.println("no more attempts"); 
                 attemptInProgress = false;
                    return;
           }
                 
                 if(glossaryList.isCorrect(answer)) {
                     timer.cancel();
                     ui.setIsCorrect(numberOfCorrectAnswers);
                     numberOfCorrectAnswers++;
                     attemptInProgress = false;
                 }else {
                    System.out.println("wrong");
                    ui.setIsInCorrect();
                     if(threeAttemptsButton){
                     numberOfattemptsCounter++;
                    attemptInProgress = true;
                 System.out.println(numberOfattemptsCounter);  
                     }else{
                         glossaryList.repeatWord();
                     }
            
                }  
                
           
      }
    
}
