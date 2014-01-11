
package client2.glossary;

/**
   Listeners are used by the client classes to signal updates and events occuring in the user interface.
 * Each Listener is associated with a specific View (JPanel or JFrame) 
 * and should normally be implemented by classes in the Logic package.
 * @author pierrezarebski
 */
public interface GlossaryViewListener {
    
    /**
     *
     * @param lang
     */
    public void langSelected(String lang);

    /**
     *
     * @param original
     * @param translation
     * @param language
     */
    public void newWord(String original, String translation, String language);

    /**
     *
     */
    public void listMenu();
   
    
}
