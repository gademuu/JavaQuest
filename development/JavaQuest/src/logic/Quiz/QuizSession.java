package logic.Quiz;

import client.QuizSessionView;
import client2.QuizView;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public abstract class QuizSession {
    
    protected static final int MAX_NUMBER_OF_ATTEMPTS = 3;
    
    protected QuizSessionView ui;
    protected GlossaryList glossaryList;
    protected QuizTimer timer;
    protected String language1;
    protected String language2;
    protected String studentName;
    protected int numberOfWordsSelected;
    protected boolean threeAttemptsButton;
    protected int numberOfattemptsCounter = 0; 
    
   
    
      public QuizSession(String studentName, String language1, String language2, int numberOfWordsSelected, boolean threeAttemptsButton ){
          this.studentName = studentName;
          this.language1 = language1;
          this.language2 = language2;
          this.numberOfWordsSelected = numberOfWordsSelected;
          this.threeAttemptsButton  = threeAttemptsButton ;
      
      }
      
      protected void isCorrect(String answer){
           if(numberOfattemptsCounter == MAX_NUMBER_OF_ATTEMPTS){
                 System.out.println("no more attempts");   
            }
    
        if(glossaryList.isCorrect(answer)) {
            System.out.println("correct!");
        }else {
        System.out.println("wrong");
            if(threeAttemptsButton){
                 numberOfattemptsCounter++;
                 System.out.println(numberOfattemptsCounter);
                  
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
