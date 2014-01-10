
package client2.Quizz;

/**
 * Setter interface for the QuizSession.
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
