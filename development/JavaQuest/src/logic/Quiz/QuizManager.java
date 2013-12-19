
package logic.Quiz;

import client.QuizView;
import client.QuizViewListener;
import logic.Common.QuitException;

/**
 * Tar in vilket språk som ska används, och vilka glosor osv. 
 * Förbereder ett quiz.
 * @author herman
 */
public class QuizManager implements QuizViewListener{
    
    //Constants
    private static final String RUN_QUIZ = "run_quiz";
    
    //variables
    private QuizView ui;
    private QuizSession quizSession;
    private boolean threeAlternativesButtonActive = false; 
    
    
    
    public QuizManager(){
         ui = new QuizView(this);
         ui.initialize();
        
    }
    
    public boolean play() throws QuitException {
        
        boolean finished = false;
        
        while (!finished) {
        
            
        }
        
        return finished;
        
    }
    
     private boolean processCommand(String command) throws QuitException {
        
        boolean isHandled = false;
        
        
        if(command.equals(RUN_QUIZ)){
            isHandled = handleRunQuiz();
        }
            
        return isHandled;
    }
     
     private boolean handleRunQuiz() throws QuitException{
         if(threeAlternativesButtonActive) {
            quizSession = new QuizSessionAlternatives();
        }else{
             quizSession = new QuizSessionTextfield();
         }
          return quizSession.play();
     }
     
    public void threeAlternativesButtonToggled() {
    threeAlternativesButtonActive = !threeAlternativesButtonActive;
    System.out.println("threeAlternativesButtonToggled [" + threeAlternativesButtonActive + "]");
        }
    
    public void startQuizButton(){
          try {
        handleRunQuiz();
    } catch(QuitException qe) {
        qe.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        
          
    try {
        new QuizManager().play();
    } catch(QuitException qe) {
        qe.printStackTrace();
    }
    
    }
    
}
