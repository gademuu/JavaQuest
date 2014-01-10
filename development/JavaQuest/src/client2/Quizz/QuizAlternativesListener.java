
package client2.Quizz;

/**
 * Listener interface for the QuizAlternatives class.
 * @author pierrezarebski
 */
public interface QuizAlternativesListener {
    
    /**
     *
     * @param answer
     */
    public void wordOneBtnPressed(String answer);

    /**
     *
     * @param answer
     */
    public void wordTwoBtnPressed(String answer);

    /**
     *
     * @param answer
     */
    public void wordThreeBtnPressed(String answer);

    /**
     *
     */
    public void nextWord();
    
}
