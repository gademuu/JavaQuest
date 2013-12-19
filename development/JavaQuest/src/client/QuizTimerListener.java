/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

/**
 * Används av timer för att skicka klocktiden till QuizView 
 * @author herman
 */
public interface QuizTimerListener {
    
    // TODO
    // Callback for TimerTask 
	
	public void timerEvent(String event);
    
}
