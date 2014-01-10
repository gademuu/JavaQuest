
package client2.glossary;

/**
   Listener interface for the GlossaryView class.
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
