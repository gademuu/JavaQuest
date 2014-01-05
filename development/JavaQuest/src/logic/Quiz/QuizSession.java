package logic.Quiz;


import client2.Quizz.QuizSessionSetter;
import client2.Quizz.QuizTimerListener;
import client2.Quizz.QuizView;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public abstract class QuizSession implements QuizTimerListener{
    //Constants
    protected static final int MAX_NUMBER_OF_ATTEMPTS = 3;
    protected static final long TIMER_INTERVAL = 1000;
    protected static final long TIMER_DURATION = 10000;
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
    protected int numberOfattemptsCounter = 0; 
    protected int numberOfCorrectAnswers = 0;
    protected boolean finished = false;
    protected boolean attemptInProgress = false;
    //End of variables
    
   
    
      public QuizSession(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton,QuizSessionSetter setter ){
          this.studentName = studentName;
          this.language1 = language1;
          this.language2 = language2;
          this.numberOfWordsSelected = numberOfWordsSelected;
          this.threeAttemptsButton  = threeAttemptsButton ;
          this.ui = setter;
          timer = new QuizTimer();
      
      }
      
      public void timerEvent(String event){
          ui.setTime(event);
         
      }
      
       protected void isCorrect(String answer){
            if(finished)
                     return;
           if(numberOfattemptsCounter == MAX_NUMBER_OF_ATTEMPTS){
                 System.out.println("no more attempts"); 
                 attemptInProgress = false;
                    return;
           }
                 
                 if(glossaryList.isCorrect(answer)) {
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
      
    
    
    public boolean play() throws QuitException {
        
        boolean finished = false;
        
        while (!finished) {
        
            // TODO
        
            // 1. Collect quiz parameters: language, number of questions etc
            // 2. Create GlossaryList
            // 3. Start the Timer
			// timer.initialize(ui, interval, duration);
            // 4. Iterate through the Words using GlossaryList.nextWord
			// In case the user wants to quit a QuitException is thrown 
            
        }
        
        return finished;
        
    }
    
    
}
