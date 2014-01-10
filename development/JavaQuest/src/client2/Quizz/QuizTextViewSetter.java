
package client2.Quizz;

/**
 * Setter interface for the QuiztextView.
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
