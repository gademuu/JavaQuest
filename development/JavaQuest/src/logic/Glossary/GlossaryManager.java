
package logic.Glossary;

import backend.Word;
import backend.WordDao;
import backend.WordDaoFactory;
import client2.glossary.GlossaryViewListener;
import client2.glossary.GlossaryViewSetter;


/**
 * Creates and manages glossaries. 
 * @author herman
 */
public class GlossaryManager implements GlossaryViewListener  {
    
    private GlossaryViewSetter ui;
    
    /**
     * Constructor of GlossaryManager.
     * @param setter
     */
    public GlossaryManager(GlossaryViewSetter setter){
        this.ui = setter;
        ui.setGlossaryViewListener(this);
        
    }

    /**
     * Fills the drop down menu that contains all the glossaries.
     */
    public void listMenu(){
        Word[]glossaries = WordDaoFactory.create(true).find(new Word("","",""));
        String[] languages = new String[glossaries.length];
        for (int i = 0 ; i < glossaries.length; i++) {
            languages[i] = glossaries[i].getLanguage();
        }
        ui.setLanguages(languages);
        
    }
    
    /**
     * Uses the WordDao method find, to find a glossary to read in as a language.
     * 
     * @param lang
     */
    public void langSelected(String lang){
        WordDao wd = WordDaoFactory.create(true); 
        Word[] wlist = wd.find(new Word("","",lang));
        ui.setGlossaryList(wlist);
    }
    
    /**
     * Uses the WordDao method create, to create new words and updates the glossary in the UI.
     * 
     * @param original
     * @param translation
     * @param language
     */
    public void newWord(String original, String translation, String language){
         WordDao wd = WordDaoFactory.create(true); 
         wd.create(new Word(original, translation, language));
         Word[] wlist2 = wd.find(new Word("","",language));
         ui.setGlossaryList(wlist2);
        
    }
    
}
