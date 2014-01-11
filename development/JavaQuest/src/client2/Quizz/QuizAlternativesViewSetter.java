
package client2.Quizz;

/**
 * Setter interface for the QuizAlternativesView.
 *  Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface QuizAlternativesViewSetter extends QuizSessionSetter {
    
    /**
     *
     * @param listener
     */
    public void setQuizAlternativesViewListener(QuizAlternativesListener listener);

    /**
     *
     * @param word
     */
    public void setWord(String word);
    
    /**
     *
     * @param word
     */
    public void setAlt1(String word);
    
    /**
     *
     * @param word
     */
    public void setAlt2(String word);
    
    /**
     *
     * @param word
     */
    public void setAlt3(String word);
    
  
    
    
    
}
