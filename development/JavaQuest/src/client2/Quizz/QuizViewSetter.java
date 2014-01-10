

package client2.Quizz;

/**
 * Setter interface for the QuizView class.
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
