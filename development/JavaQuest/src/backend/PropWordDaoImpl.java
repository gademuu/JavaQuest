

package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;



class PropWordDaoImpl extends PropDaoImpl implements WordDao {
    
    private static final String WORD_FILE_PREFIX = "word_";
    private static final String WORD_FILE_SUFFIX = ".properties";
 
    
            
        
    public Word create(Word aWord) {
        String id = null; 
        Properties prop = new Properties();
       
        prop = load(WORD_FILE_PREFIX + aWord.getLanguage() + WORD_FILE_SUFFIX);
        prop.setProperty(aWord.getOrginal(), aWord.getTranslation());
        store(WORD_FILE_PREFIX + aWord.getLanguage() + WORD_FILE_SUFFIX, prop, true);
        id = aWord.getOrginal();
        return aWord;
    }
    
    public Word read(Word aWord){
    
        Word w = null;
        
        Properties prop = new Properties();
        String id = aWord.getOrginal();  
        prop = load(WORD_FILE_PREFIX + aWord.getLanguage() + WORD_FILE_SUFFIX);
        String trans = (String) prop.get(id);
        w = new Word(id, trans, aWord.getLanguage());
            
        return w;
    }
    
    
      public void update(Word aWord) {
      // TODO
      }
    
    public void delete(Word aWord) {
    // TODO
    }
    
    public Word[] find(Word criteria) {
        
        // TODO
        // File to open should depend on criteria.language
        
        ArrayList<Word> matches = new ArrayList<>();
        
        Properties prop = load(WORD_FILE_PREFIX + criteria.getLanguage() + WORD_FILE_SUFFIX);
        
        Set<Map.Entry<Object, Object>> words;
        words = prop.entrySet();
        Iterator iter = words.iterator();
        
        while(iter.hasNext()) {
            Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) iter.next();
            Word w = new Word((String)e.getKey(), (String)e.getValue(), criteria.getLanguage());
            matches.add(w);
        }
        
        Word[] matchwords = new Word[matches.size()];
        matchwords = matches.toArray(matchwords); 
        
        return matchwords;
    }
    
    public static void main(String[] args){
        
        PropWordDaoImpl pwdi = new PropWordDaoImpl();
        Word w1 = new Word("","","english");
        
        Word w2= new Word("german", "","");
        Word[]array = pwdi.find(w1);
      
        
        for(Word w : array){
            System.out.println(w.toString());
        }
        
        
    }
}
