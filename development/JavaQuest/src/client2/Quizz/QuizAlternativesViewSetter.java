
package client2.Quizz;

/**
 *
 * @author herman
 */
public interface QuizAlternativesViewSetter extends QuizSessionSetter {
    
    public void setQuizAlternativesViewListener(QuizAlternativesListener listener);  
    
    
   
    public void setWord(String word);
    
    public void setAlt1(String word);
    
    public void setAlt2(String word);
    
    public void setAlt3(String word);
    
  
    
    
    
}
