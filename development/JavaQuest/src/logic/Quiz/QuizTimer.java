package logic.Quiz;

import client2.Quizz.QuizTimerListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

/**
 * håller reda på hur länge spelet ska köras
 * @author herman
 */
public class QuizTimer extends Timer {
    
    //variables
    QuizTimerTask timerTask;
    
    // private QuizTimerTask timerTask;
    private long duration;
   
	public void initialize(QuizTimerListener listener, long interval, long duration) {
		
		 // TODO
		// initialize timertask with listener, duration and intervals
		timerTask = new QuizTimerTask(listener, interval, duration, this);
		Date firstTime = new Date();
		scheduleAtFixedRate(timerTask, firstTime, interval);
		
	}
    
    
}

