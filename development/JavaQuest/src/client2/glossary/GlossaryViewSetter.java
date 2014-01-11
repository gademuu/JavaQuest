
package client2.glossary;

import backend.Word;

/**
 * Setter interface for the GlossaryView class.
 * Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface GlossaryViewSetter {
    
    /**
     *
     * @param list
     */
    public void  setGlossaryList(Word[] list);

    /**
     *
     * @param listener
     */
    public void setGlossaryViewListener(GlossaryViewListener listener);

    /**
     *
     * @param languages
     */
    public void setLanguages(String[] languages);
    
}
