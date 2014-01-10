package backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.*;

/*
 Implementation of the WordDao interface
 * Using properties files as storage. 
 */
class PropWordDaoImpl extends PropDaoImpl implements WordDao {

    //Constants
    private static final String WORD_FILE_PREFIX = "word_";
    private static final String WORD_FILE_SUFFIX = ".properties";
    //End of constants

    /**
     * Creates a new Word object.
     * @param aWord
     * @return aWord 
     */
    public Word create(Word aWord) {
        String id = null;
        Properties prop = new Properties();

        prop = load(WORD_FILE_PREFIX + aWord.getLanguage() + WORD_FILE_SUFFIX);
        prop.setProperty(aWord.getOrginal(), aWord.getTranslation());
        store(WORD_FILE_PREFIX + aWord.getLanguage() + WORD_FILE_SUFFIX, prop, true);
        id = aWord.getOrginal();
        return aWord;
    }

     /**
     * Reads a Word object.
     * @param aWord
     * @return w
     */
    public Word read(Word aWord) {

        Word w = null;

        Properties prop = new Properties();
        String id = aWord.getOrginal();
        prop = load(WORD_FILE_PREFIX + aWord.getLanguage() + WORD_FILE_SUFFIX);
        String trans = (String) prop.get(id);
        w = new Word(id, trans, aWord.getLanguage());

        return w;
    }

    //Not in use
    public void update(Word aWord) {
        
    }

    public void delete(Word aWord) {
      
    }
    //
    
     /**
     * Finds a Word object.
     * @param criteria
     * @return matches
     */
    public Word[] find(Word criteria) {

        Word[] matches = new Word[0];
        if (criteria.getLanguage() != null) {
            if (!criteria.getLanguage().equals("")) {
                matches = findWordsForLanguage(criteria.getLanguage());
            } else if (criteria.getLanguage().equals("")) {
                matches = findAllGlossaries();
            }
        }

        return matches;
    }

     /**
     * Finds Word objects to put in a list.
     * @param language
     * @return matchwords
     */
    private Word[] findWordsForLanguage(String language) {

        ArrayList<Word> matches = new ArrayList<>();

        Properties prop = load(WORD_FILE_PREFIX + language + WORD_FILE_SUFFIX);

        Set<Map.Entry<Object, Object>> words;
        words = prop.entrySet();
        Iterator iter = words.iterator();

        while (iter.hasNext()) {
            Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) iter.next();
            Word w = new Word((String) e.getKey(), (String) e.getValue(), language);
            matches.add(w);
        }

        Word[] matchwords = new Word[matches.size()];
        matchwords = matches.toArray(matchwords);

        return matchwords;

    }

     /**
      * Finds all Word objects in a list.
     * Creates a new Word object.
     * @return matchwords 
     */
    private Word[] findAllGlossaries() {

        ArrayList<Word> matches = new ArrayList<>();

        File dir = new File(".");
        String[] glossaries = dir.list();
        Scanner scan = null;
        String glossaryName = "";

        for (String s : glossaries) {
            if (s.startsWith(WORD_FILE_PREFIX)) {

                scan = new Scanner(s.substring(WORD_FILE_PREFIX.length()));
                scan.useDelimiter("\\.");
                glossaryName = scan.next();
                matches.add(new Word("", "", glossaryName));
            }
        }

        Word[] matchwords = new Word[matches.size()];
        matchwords = matches.toArray(matchwords);
        return matchwords;

    }

   
}
