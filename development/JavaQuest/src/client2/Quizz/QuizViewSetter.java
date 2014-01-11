

package client2.Quizz;

/**
 * Setter interface for the QuizView class.
 * Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface QuizViewSetter {
    
    /**
     *
     * @param qvl
     */
    public void setQuizViewListener(QuizViewListener qvl);
    
    /**
     *
     * @param languages
     */
    public void setLanguages(String[] languages);
    
    /**
     *
     * @param lists
     */
    public void setGlossaryLists(String[] lists);
    
    /**
     *
     * @return
     */
    public QuizAlternativesViewSetter getQuizAlternativesViewSetter();
            
    /**
     *
     * @return
     */
    public QuizTextViewSetter getQuizTextViewSetter();        
    
    
    
}
