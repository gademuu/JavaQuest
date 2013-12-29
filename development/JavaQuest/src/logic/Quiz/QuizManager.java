
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
    private String language1;
    private String language2;
    private String studentName;
    private int numberOfWordsSelected;
    private String threeAlternativesButtonToggled;
    private String startQuizButton;
    
    
    
    public QuizManager(){
         ui = new QuizView(this);
         ui.initialize();
        
    }
    
    public boolean play() throws QuitException {
        
        GlossaryListAlternatives glossaryList = new GlossaryListAlternatives();
        glossaryList.initialize(studentName,language2, numberOfWords);
         
        return true;
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
            quizSession = new QuizSessionAlternatives(language1, language2, studentName,  numberOfWordsSelected);
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
    
      
    public void language2Selected(String language){
         language2 = language;
    }
    public void language1Selected(String language){
         language1 = language;
    }
    public void studentName(String name){
        
        studentName = name;
    
    }
    public void numberOfWordsSelected(int numberOfWords){
        numberOfWordsSelected = numberOfWords;
    }
   
    
    public static void main(String[] args){
        
        QuizManager qm = new QuizManager();
        
        qm.numberOfWordsSelected(4);
        qm.studentName("Herman");
        qm.threeAlternativesButtonToggled();
        qm.language1Selected("Sv");
        qm.language2Selected("english");
        qm.startQuizButton();
      
        
        
        
       
    try {
        new QuizManager().play();
    } catch(QuitException qe) {
        qe.printStackTrace();
    }
    
    }
    
}
