
package logic.Quiz;


import backend.Word;
import backend.WordDaoFactory;
import client2.Quizz.QuizViewListener;
import client2.*;
import client2.Quizz.QuizViewSetter;
import logic.Login.LoginManager;

/**
 * Handles the parameters by the user when starting up a new quiz. 
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
    private boolean respondInSwedish = false;
    //End of variables

    /**
     * Constructor for the QuizManager.
     * @param ui
     * @param lm
     */
    public QuizManager(QuizViewSetter ui, LoginManager lm){
        this.lm = lm;
        this.ui = ui;  
        ui.setQuizViewListener(this);
    }

    /**
     *
     * @param studentName
     */
    public void initialize( String studentName){
        //this.studentName = studentName;
    }
    
   private boolean handleRunQuiz(){
         if(threeAlternativesActive) {
            quizSession = new QuizSessionAlternatives(lm.getStudentName(),language1, language2, NUMBER_OF_WORDS,threeAttemptsButton,respondInSwedish,ui.getQuizAlternativesViewSetter() );
             
         }else{
            quizSession = new QuizSessionTextfield(lm.getStudentName(),language1, language2, NUMBER_OF_WORDS,threeAttemptsButton,respondInSwedish,ui.getQuizTextViewSetter() );
         }
          return true;
     }

        public void startQuizButton(){   
            handleRunQuiz();
    }
    
    /**
     * Fills the list menu.
     */
    public void listMenu(){
        Word[]glossaries = WordDaoFactory.create(true).find(new Word("","",""));
        String[] languages = new String[glossaries.length];
        for (int i = 0 ; i < glossaries.length; i++) {
            languages[i] = glossaries[i].getLanguage();
        }
        ui.setLanguages(languages);
        
    }
    
    /**
     *  Checks what language is toggled.
     * @param language
     */
    public void languageMenu(String language){
        language2 = language;
    }
    
    /**
     * Checks if the three attempts button is toggled.
     */
    public void threeAttemptsBtnToggle(){
        threeAttemptsButton = !threeAttemptsButton;
        
    }

    /**
     * Checks if the alternatives button is toggled.
     */
    public void alternativesQuizToggled(){
        threeAlternativesActive  = !threeAlternativesActive ;
    }

    //Not in use
    public void textQuizToggled(){}

    /**
     * Checks if the answer in language button is toggled.
     * @param language
     */
    public void language2(String language){
         language2 = language;
          respondInSwedish = false;
    }

    /**
     * Checks if the answer in sweden button is toggled.
     * @param language
     */
    public void language1(String language){
         language1 = language;
         respondInSwedish = true;
    }
   
}
