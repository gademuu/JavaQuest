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
import java.util.ListIterator;

/**
 * Super class to the two classes GlossaryListAlternatives and GLossaryListTextfield.
 * Handles the glossary lists.
 * @author herman
 */
public abstract class GlossaryList {
    
    //Variables
    protected ArrayList<Word> glossary = new ArrayList<>();
    protected ListIterator iterator;
    protected int numberOfWords;
    protected int numberOfCorrectAnswers;
    protected int numberOfQuestionsAnswered;
    protected Word currentWord;
    protected StudentStats studentStats;
    protected ArrayList<Word> quizGlossary = new ArrayList<>();
    protected boolean respondInSwedish = false;
    //End of variables

    /**
     * Initializes a glossary.
     * @param studentName
     * @param language
     * @param numberOfWords
     * @param respondInSwedish
     */
    public void initialize(String studentName, String language, int numberOfWords, boolean respondInSwedish) {
        this.numberOfWords = numberOfWords;
        WordDao wd = WordDaoFactory.create(true);
        Word[] words = wd.find(new Word("","",language));
        
        if(respondInSwedish) {
            String o;
            String t;
            
            for(Word w : words) {
                o = w.getOrginal();
                t = w.getTranslation();
                w.setOrginal(t);
                w.setTranslation(o);
            }
            
        }
        
        glossary = new ArrayList<Word>(Arrays.asList(words));
        Collections.shuffle(glossary);
        for(int i = 0 ; i < numberOfWords; i++) {
            glossary.get(i);
            quizGlossary.add(glossary.get(i));
            
        }
        
        this.respondInSwedish = respondInSwedish;
       
        studentStats = new StudentStats(studentName, new Date().toString(), "");
        
    }

    /**
     * Adds a wrong answered word back in the list. 
     */
    public void repeatWord(){
        int i;
        for(i = 0; iterator.hasNext(); i++) iterator.next();
        iterator.add(currentWord);
        for(int j = i; j>= 0; j--) iterator.previous();
        numberOfWords++;
        }
    
    /**
     * Returns the next word in the glossary.
     * @return theWord
     */
    public String nextWord() {
        String theWord = "";
        
        if(iterator == null) {
            iterator = quizGlossary.listIterator();
        }
        
        if(iterator.hasNext()) {
            currentWord = (Word) iterator.next();
            theWord = currentWord.getOrginal();
        }
        
        
        return theWord;
    }
    
    /**
     * Checks if the answer is correct.
     * @param answer
     * @return correct
     */
    public boolean isCorrect(String answer) {
        boolean correct = false;
        numberOfQuestionsAnswered++;
        
        correct = currentWord.isCorrect(answer);
        if(correct) {
            numberOfCorrectAnswers++;
        } 
        
        return correct;    
    }
    
    /**
     * @return the percentage as a string with 1 decimal followed by the % sign
     */
    private String getPercentage(int n, int total) {
        float proportion = ((float) n) / ((float) total);
        return String.format("%.1f", new Float(proportion * 100)) + "%";
        
    }
    
    /**
     * Saves the percentage of the user.
     */
    public void saveStats() {
       studentStats.setStats(getPercentage(numberOfCorrectAnswers, numberOfWords));
       StudentStatsDaoFactory.create(true);
       
       StudentStatsDao ssDao = StudentStatsDaoFactory.create(true);

        ssDao.create(studentStats);
    }

    /**
     *
     * @returns getPercentage
     */
    public String getStats() {
      return getPercentage(numberOfCorrectAnswers, numberOfWords);
  }
     
    
  
    
}
