
package client2.Quizz;

/**
 * Setter interface for the QuiztextView.
 * Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface QuizTextViewSetter extends QuizSessionSetter {
    
    /**
     *
     * @param listener
     */
    public void setQuizTextViewListener(QuizTextListener listener);

    /**
     *
     * @param word
     */
    public void setWord(String word);
    
}
