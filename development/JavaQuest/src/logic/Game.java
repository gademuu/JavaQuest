/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;


import logic.Common.QuitException;
import logic.Student.StudentManager;
import logic.Glossary.GlossaryManager;
import logic.Quiz.QuizSession;
import client2.*;
import client2.Quizz.QuizView;
import client2.login.LoginFrame;
import client2.student.NewUserFrame;
import logic.Login.LoginManager;
import logic.Quiz.QuizManager;
import logic.statistics.StatisticsManager;

/**
 *
 * @author herman
 * 
 */
public class Game implements MainFrameListener {
    
    //constants
    private static final String CREATE_QUIZ = "create_quiz";
    //end of constants
    
    //variables
    private MainFrame ui;
    private QuizManager quiz;
    private StudentManager studentManager;
    private GlossaryManager glossaryManager;
    private LoginFrame loginUi;
    private LoginManager lm;
    private NewUserFrame nuf;
    private StatisticsManager statisticsManager;
    
    //end of variables
    
    public Game(){
        
        loginUi = new LoginFrame();
        loginUi.setMainFrameListener(this);
        loginUi.initialize();
        lm = new LoginManager(loginUi);
        ui = new MainFrame();
        nuf = new NewUserFrame();
        nuf.setMainFrameListener(this);
        StudentManager sm = new StudentManager(nuf);
        QuizView qv =  ui.getQuizView();
        qv.setMainFrame(ui);
        qv.setAlternativesSetter(ui.getQuizAlternativesPanel());
        qv.setTextSetter(ui.getQuizTextPanel());
        QuizManager qm = new QuizManager(qv); 
        GlossaryManager gm = new GlossaryManager( ui.getGlossaryView());
        statisticsManager = new StatisticsManager(lm, ui.getStatisticsView());
       
        
}
    public void newUserFrameCreate(){
        nuf.initialize();
    }
    
      public void mainFrameCreate(){
          ui.initialize();
      }
      
    
    /*public void play() {
        
        boolean finished = false;
        
        while(!finished) {
            
            // TODO
            // 1. Display view
            // 2. receive command (start quiz, manage user, manage glossary)
            String command = "";
			
			try {
			
				command = ui.getCommand();
				processCommand(command);
                                //hanterar alla olika commandon
			
			} catch (QuitException qe) {
				finished = handleQuit();
			
			}
            
        }
        
        
    }
    
    private boolean processCommand(String command) throws QuitException {
        
        boolean isHandled = false;
        
        
        if(command.equals(CREATE_QUIZ)){
            isHandled = handleQuiz();
        }
            
        // TODO
        // switch on command
        // call appropriate handle methods
        // isHandled = handleXXX();
        
        return isHandled;
    }
    
    private boolean handleQuiz() throws QuitException {
        
        return true;
        
    }
    
    private boolean handleStudent() throws QuitException {
        return studentManager.play();
    }
    
     private boolean handleGlossary() throws QuitException {
        return glossaryManager.play();
    }
    
    private boolean handleQuit(){
        return true;
    }
    */
    public static void main(String[]args){
        Game g = new Game();
        
    }
}
