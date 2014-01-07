
package logic.Quiz;


import backend.Word;
import backend.WordDaoFactory;
import client2.Quizz.QuizViewListener;
import client2.*;
import client2.Quizz.QuizViewSetter;
import logic.Common.QuitException;
import logic.Login.LoginManager;

/**
 * 
 * @author herman
 */
public class QuizManager implements QuizViewListener{
    
    //Constants
    private static final String RUN_QUIZ = "run_quiz";
    private static final int NUMBER_OF_WORDS= 10;
    //End of constants
    //variables
    private QuizViewSetter ui;
    private QuizSession quizSession;
    private String language1 = "swedish";
    private String language2;
    private String threeAlternativesToggled;
    private boolean threeAttemptsButton = false;
    private boolean threeAlternativesActive = false;
    private String startQuizButton;
    private  LoginManager lm;
    //End of variables
    
    
    
    public QuizManager(QuizViewSetter ui, LoginManager lm){
        this.lm = lm;
        this.ui = ui;  
        ui.setQuizViewListener(this);
    }
     
    
    public void initialize( String studentName){
        //this.studentName = studentName;
    }
   private boolean handleRunQuiz() throws QuitException{
         if(threeAlternativesActive) {
            quizSession = new QuizSessionAlternatives(lm.getStudentName(),language1, language2, NUMBER_OF_WORDS,false,ui.getQuizAlternativesViewSetter() );
             
         }else{
             quizSession = new QuizSessionTextfield(lm.getStudentName(),language1, language2, NUMBER_OF_WORDS,false,ui.getQuizTextViewSetter() );
         }
          return true;
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
        Word[]glossaries = WordDaoFactory.create(true).find(new Word("","",""));
        String[] languages = new String[glossaries.length];
        for (int i = 0 ; i < glossaries.length; i++) {
            languages[i] = glossaries[i].getLanguage();
        }
        ui.setLanguages(languages);
        
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
         System.out.println(language);
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
