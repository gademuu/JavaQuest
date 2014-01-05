package logic.Quiz;

import backend.StudentStats;
import backend.StudentStatsDao;
import backend.StudentStatsDaoFactory;
import backend.Word;
import backend.WordDao;
import backend.WordDaoFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author herman
 */
public class GlossaryListAlternatives extends GlossaryList {
    
    @Override
  public void initialize(String studentName, String language, int numberOfWords) {
        super.initialize(studentName, language, numberOfWords);
        
        Word alt1 = null;
        Word alt2 = null;
        
        System.out.println(language);
        
        Collections.shuffle(glossary);
        for(int i = 0 ; i < quizGlossary.size(); i++) {
            Word w = quizGlossary.get(i);
        
            
               boolean finished = false;
            for(int j = 0; !finished && j < glossary.size(); j++) {
                alt1 = glossary.get(j);
                if(! w.getOrginal().equals(alt1.getOrginal())){
                
                    finished = true;
                }
            }
                   
            if(!finished) {
                alt1 = new Word("","dublett",w.getLanguage());
            }
            
                 Collections.shuffle(glossary);
            
            finished = false;
            for(int j = 0; !finished && j < glossary.size(); j++) {
                alt2 = glossary.get(j);
                  if(! w.getOrginal().equals(alt2.getOrginal()) &&
                    ! alt1.getOrginal().equals(alt2.getOrginal())) {
                        finished = true;
                    }
            }
                   
            if(!finished) {
                alt2 = new Word("","dublett",w.getLanguage());
            }
          
            
         
        WordAlternative wa = new WordAlternative(alt1.getTranslation(), alt2.getTranslation(),w.getOrginal(),w.getTranslation(),w.getLanguage());
         quizGlossary.set(i, wa);
        }
             
   }
  
   public WordAlternative nextWordAlternative(){
       WordAlternative theWordAlternative = null;
        if(iterator == null) {
            iterator = quizGlossary.listIterator();
        }
        
        if(iterator.hasNext()) {
            currentWord = (Word) iterator.next();
            theWordAlternative = (WordAlternative) currentWord;
        }
          return theWordAlternative;
   
   }
   
   
       public static void main(String[] args){
       GlossaryListAlternatives myGLA = new GlossaryListAlternatives();
       /*myGLA.initialize("herman", "english",5);
     
       WordAlternative w = myGLA.nextWordAlternative();
myGLA.repeatWord();
        while(w != null) {
            System.out.println(w.toString());
             w = myGLA.nextWordAlternative();*/
            
             
        }
         
         
        
                 }
        
      
            
    

