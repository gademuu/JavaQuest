package client2.Quizz;

/**
 * Listener interface for the QuizView class.
 * @author pierrezarebski
 */
public interface QuizViewListener {
    
    /**
     *
     * @param language
     */
    public void languageMenu(String language);

    /**
     *
     */
    public void listMenu();

    /**
     *
     * @param language
     */
    public void language1(String language);

    /**
     *
     * @param language
     */
    public void language2(String language);

    /**
     *
     */
    public void threeAttemptsBtnToggle();

    /**
     *
     */
    public void alternativesQuizToggled();

    /**
     *
     */
    public void textQuizToggled();

    /**
     *
     */
    public void startQuizButton();
   
   
    
}
