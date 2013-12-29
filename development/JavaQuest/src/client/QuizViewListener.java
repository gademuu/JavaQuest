
package client;

/**
 *
 * @author herman
 */
public interface QuizViewListener {
    
    
    public void language2Selected(String language);
    public void language1Selected(String language);
    public void studentName(String name);
    public void numberOfWordsSelected(int numberOfWords);
     public void threeAlternativesButtonToggled();
     public void startQuizButton();
    
    
}
