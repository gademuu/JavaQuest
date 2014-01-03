
package logic.Quiz;


import client2.*;
import client2.QuizViewSetter;
import logic.Common.QuitException;

/**
 * 
 * @author herman
 */
public class QuizManager implements QuizViewListener{
    
    //Constants
    private static final String RUN_QUIZ = "run_quiz";
    private static final int NUMBER_OF_WORDS= 10;
    //variables
    private QuizViewSetter ui;
    private QuizSession quizSession;
    private String studentName;
    private String language1 = "swedish";
    private String language2;
    private String threeAlternativesToggled;
    private boolean threeAttemptsButton = false;
    private boolean threeAlternativesActive = false;
    private String startQuizButton;
    
    
    //Hur ska vi instanciera startviewn 
    public QuizManager(QuizViewSetter ui){
        
        this.ui = ui;  
        String []lang ={"english","german","french"};
        ui.setLanguages(lang);
        ui.setQuizViewListener(this);
    }
     
    
    public void initialize( String studentName){
        this.studentName = studentName;
    }
   private boolean handleRunQuiz() throws QuitException{
         if(threeAlternativesActive) {
            quizSession = new QuizSessionAlternatives(language1, language2, studentName,  NUMBER_OF_WORDS,true,ui.getQuizAlternativesViewSetter() );
         }else{
             quizSession = new QuizSessionTextfield(language1, language2, studentName, NUMBER_OF_WORDS,true,ui.getQuizTextViewSetter() );
         }
          return quizSession.play();
     }
     
   
   // Listener methods 
    public void startQuizButton(){
          try {
        handleRunQuiz();
    } catch(QuitException qe) {
        qe.printStackTrace();
        }
    }
    
    public void listMenu(){
    }
    
    public void languageMenu(){}
    
    public void threeAttemptsBtnToggle(){
        threeAttemptsButton = !threeAttemptsButton;
        
    }
    public void alternativesQuizToggled(){
        threeAlternativesActive  = !threeAlternativesActive ;
        System.out.println("threeAlternativesActive [" + threeAlternativesActive + "]");
    }
    public void textQuizToggled(){
    }
    
     public void language2(String language){
         language2 = language;
    }
    public void language1(String language){
         language1 = language;
    }
   
    
    /* public void threeAlternativesButtonToggled() {
    threeAlternativesButtonActive = !threeAlternativesButtonActive;
    System.out.println("threeAlternativesButtonToggled [" + threeAlternativesButtonActive + "]");
        }
    
   
    public void studentName(String name){
        
        studentName = name;
    
    }
    public void numberOfWordsSelected(int numberOfWords){
        numberOfWordsSelected = numberOfWords;
    }
   */
    
    public static void main(String[] args){
        
      
        
        
      //  QuizSessionAlternatives qsa = new QuizSessionAlternatives("Herman","swedish","english",5);
        
        
        //qm.startQuizButton();
      
      
    
    }
}
