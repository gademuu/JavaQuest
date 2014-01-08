

package logic.Glossary;

import backend.Word;
import backend.WordDao;
import backend.WordDaoFactory;
import client2.glossary.GlossaryViewListener;
import client2.glossary.GlossaryViewSetter;
import logic.Common.QuitException;

/**
 * Ska skapa nya ord och lägga in i propertiesfilen. Använd Create() från sitt DAO.
 * @author herman
 */
public class GlossaryManager implements GlossaryViewListener  {
    
    private GlossaryViewSetter ui;
    
    public GlossaryManager(GlossaryViewSetter setter){
        this.ui = setter;
        ui.setGlossaryViewListener(this);
        
    }
    
   
     public void listMenu(){
        Word[]glossaries = WordDaoFactory.create(true).find(new Word("","",""));
        String[] languages = new String[glossaries.length];
        for (int i = 0 ; i < glossaries.length; i++) {
            languages[i] = glossaries[i].getLanguage();
        }
        ui.setLanguages(languages);
        
    }
    
    public void langSelected(String lang){
        WordDao wd = WordDaoFactory.create(true); 
        Word[] wlist = wd.find(new Word("","",lang));
        ui.setGlossaryList(wlist);
    }
    
    public void newWord(String original, String translation, String language){
         WordDao wd = WordDaoFactory.create(true); 
         wd.create(new Word(original, translation, language));
         Word[] wlist2 = wd.find(new Word("","",language));
         ui.setGlossaryList(wlist2);
        
    }
    
    
    
    
    
    
    
}
