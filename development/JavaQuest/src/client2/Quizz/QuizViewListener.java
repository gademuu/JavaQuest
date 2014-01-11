package client2.Quizz;

/**
 * Listeners are used by the client classes to signal updates and events occuring in the user interface.
 * Each Listener is associated with a specific View (JPanel or JFrame) 
 * and should normally be implemented by classes in the Logic package.
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
