package logic.Quiz;

import client.QuizSessionView;
import client.QuizView;
import logic.Common.QuitException;

/**
 *
 * @author herman
 */
public abstract class QuizSession {
    
    private QuizSessionView ui;
    private GlossaryList glossaryList;
    private QuizTimer timer;
    
    
    public boolean play() throws QuitException {
        
        boolean finished = false;
        
        while (!finished) {
        
            // TODO
        
            // 1. Collect quiz parameters: language, number of questions etc
            // 2. Create GlossaryList
            // 3. Start the Timer
			// timer.initialize(ui, interval, duration);
            // 4. Iterate through the Words using GlossaryList.nextWord
			// In case the user wants to quit a QuitException is thrown 
            
        }
        
        return finished;
        
    }
    
    
}
