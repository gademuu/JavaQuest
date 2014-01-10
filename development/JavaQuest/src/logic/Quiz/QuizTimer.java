package logic.Quiz;

import client2.Quizz.QuizTimerListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

/**
 *  Initializes the timer in the quiz session.
 * @author herman
 */
public class QuizTimer extends Timer {
    
    //variables
    QuizTimerTask timerTask;
    private long duration;

    /**
     * Initializes the timer in the quiz session.
     * @param listener
     * @param interval
     * @param duration
     */
    public void initialize(QuizTimerListener listener, long interval, long duration) {
	
		timerTask = new QuizTimerTask(listener, interval, duration, this);
		Date firstTime = new Date();
		scheduleAtFixedRate(timerTask, firstTime, interval);
		
	}
    
    
}

