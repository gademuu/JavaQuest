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
import client2.login.LoginFrameOld;
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
        StudentManager sm = new StudentManager(nuf, lm);
        QuizView qv =  ui.getQuizView();
        qv.setMainFrame(ui);
        qv.setAlternativesSetter(ui.getQuizAlternativesPanel());
        qv.setTextSetter(ui.getQuizTextPanel());
        QuizManager qm = new QuizManager(qv,lm); 
        GlossaryManager gm = new GlossaryManager( ui.getGlossaryView());
        statisticsManager = new StatisticsManager(lm, ui.getStatisticsView());
        ui.setStatisticsViewListener(statisticsManager);
        ui.setQuizViewListener(qm);
        
    }
    public void newUserFrameCreate(){
        nuf.initialize();
    }
    
    public void mainFrameCreate(){
        ui.initialize();
    }
      
    public static void main(String[]args){
        Game g = new Game();   
    }
}
