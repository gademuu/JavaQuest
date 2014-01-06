
package client2.glossary;

/**
 *
 * @author pierrezarebski
 */
public interface GlossaryViewListener {
    
    public void langSelected(String lang);
    public void newWord(String original, String translation, String language);
   
    
}
