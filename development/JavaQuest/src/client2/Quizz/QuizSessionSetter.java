
package client2.Quizz;

/**
 * Setter interface for the QuizSession.
 *  Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface QuizSessionSetter {

    /**
     *
     * @param numberOfCorrectAnswers
     */
    public void setIsCorrect(int numberOfCorrectAnswers);
    
    /**
     *
     */
    public void setIsInCorrect();

    /**
     *
     * @param message
     */
    public void setStatsDialog(String message);

    /**
     *
     * @param time
     */
    public void setTime(String time);

  
    
}
