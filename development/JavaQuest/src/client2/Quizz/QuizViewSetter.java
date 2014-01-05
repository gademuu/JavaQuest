

package client2.Quizz;

/**
 *
 * @author herman
 */
public interface QuizViewSetter {
    
    public void setQuizViewListener(QuizViewListener qvl);
    
    public void setLanguages(String[] languages);
    
    public void setGlossaryLists(String[] lists);
    
    public QuizAlternativesViewSetter getQuizAlternativesViewSetter();
            
    public QuizTextViewSetter getQuizTextViewSetter();        
    
    
    
}
