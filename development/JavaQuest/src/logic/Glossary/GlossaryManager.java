/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic.Glossary;

import client.GlossaryView;
import logic.Common.QuitException;

/**
 * Hanterar ordlistorna, läsa upp glosor för ett språk i taget. Använd find() från dao. 
 * Ta imot hur många olika frågor. Använda shuffle för att blanda glosorna. Använda create() från dao för att skapa nya glosor. 
 * @author herman
 */
public class GlossaryManager {
    
    private GlossaryView ui;
    
    public boolean play() throws QuitException {
        
         boolean finished = false;
        
        while(!finished) {
            
            // TODO
            // 1. Display glossary management view 
            // 2. receive commands
			// 3. Quit = throw exception
            
            
        }
        
        return finished;
        
    }
    
     private boolean processCommand(String command) throws QuitException {
        
        boolean isHandled = false;
        // TODO
        // switch on command
        // call appropriate handle methods
        // isHandled = handleXXX();
        
        return isHandled;
    }
    
}
