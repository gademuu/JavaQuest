

package client;

/**
 *
 * @author herman
 */
public abstract class QuizSessionView extends View implements QuizTimerListener {
    
    // TODO
    // Base View for running a quiz
	
	@Override
	public void timerEvent(String event) {
		// TODO
		// Callback for TimerTask
		// event contains remaining time
	}
    
}
