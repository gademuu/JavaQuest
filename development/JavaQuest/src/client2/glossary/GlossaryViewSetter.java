
package client2.glossary;

import backend.Word;

/**
 * Setter interface for the GlossaryView class.
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
