package logic.Quiz;

import backend.Word;
import backend.WordDao;
import backend.WordDaoFactory;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author herman
 */
public class GlossaryListAlternatives extends GlossaryList {
    
    @Override
   public void initialize(String studentName, String language, int numberOfWords) {
        super.initialize(studentName, language, numberOfWords);
        // TODO
       
        // 6. Subclass decides whether WordAlternative is to be used
        
        
        WordDao wd = WordDaoFactory.create(true);
        Word[] words = wd.find(new Word("","","english"));
        glossary = new ArrayList<Word>(Arrays.asList(words));
        
    }
    
}
