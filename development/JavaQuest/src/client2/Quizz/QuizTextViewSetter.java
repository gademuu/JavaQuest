
package client2.Quizz;

/**
 *
 * @author herman
 */
public interface QuizTextViewSetter extends QuizSessionSetter {
    
    public void setQuizTextViewListener(QuizTextListener listener);  
   
    public void setWord(String word);
    
}
