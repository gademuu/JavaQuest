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
import client.GameView;
import logic.Quiz.QuizManager;

/**
 *
 * @author herman
 * 
 */
public class Game {
    
    //constants
    
    private static final String CREATE_QUIZ = "create_quiz";
    
    private GameView ui;
    private QuizManager quiz;
    private StudentManager studentManager;
    private GlossaryManager glossaryManager;
    
    public void play() {
        
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
        
        return quiz.play();
        
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
}
