/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic.Quiz;

import client2.Quizz.QuizTimerListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author herman
 */
public class QuizTimerTask extends TimerTask {
    
    private QuizTimerListener listener;
    private long interval;
    private long timeRemaining;
    private Timer timer;
    
    public QuizTimerTask(QuizTimerListener listener, long interval, long duration, Timer timer) {
        
        this.listener = listener;
        this.interval = interval;
        this.timeRemaining = duration;
		this.timer = timer;
        
    }
    
    public void run() {
     
        timeRemaining -= interval; 
        
        // TODO
        // decrement timeRemaining with interval x
        // listener.timerEvent(timeRemaining)
		// if (timeRemaining <= 0) {timer.cancel();}
        
    }

}
