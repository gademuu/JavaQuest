

package client2.Quizz;

/**
 * Används av timer för att skicka klocktiden till QuizView 
 * @author herman
 */
public interface QuizTimerListener {
    
    // TODO
    // Callback for TimerTask 
	
	public void timerEvent(String event);
    
}
