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
 * Runs the timer in the quiz session.
 * @author herman
 */
public class QuizTimerTask extends TimerTask {
    
    private QuizTimerListener listener;
    private long interval;
    private long timeRemaining;
    private Timer timer;
    
    /**
     * Constructor of the QuiztimerTask.
     * @param listener
     * @param interval
     * @param duration
     * @param timer
     */
    public QuizTimerTask(QuizTimerListener listener, long interval, long duration, Timer timer) {
        
        this.listener = listener;
        this.interval = interval;
        this.timeRemaining = duration;
		this.timer = timer;
        
    }
    
    /*
    Decrements the remaining time by interval
    sends a timer event to the listener in order to update the UI
    cancels the timer if remaining time is 0.
    */
    public void run() {
        timeRemaining -= interval; 
        if (timeRemaining <= 0) timer.cancel();
        listener.timerEvent(""+timeRemaining/1000);
    }

}
