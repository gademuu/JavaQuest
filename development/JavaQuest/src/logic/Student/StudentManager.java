/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic.Student;

import client.StudentView;

/**
 *  (ska använda studentdao, skapa en ny student. Ta imot password och namn.)
 * @author herman
 */
public class StudentManager {
    
    private StudentView ui;
    
    /*
    Hantera commandon från användaren. 
    */
    public boolean play() {
        
         boolean finished = false;
        
        while(!finished) {
            
            // TODO
            // 1. Display student management view with student info
            // 2. receive commands
            
            
        }
        
        return finished;
        
    }
    
     private boolean processCommand(String command) {
        
        boolean isHandled = false;
        // TODO
        // switch on command
        // call appropriate handle methods
        // isHandled = handleXXX();
        
        return isHandled;
    }
    
}
