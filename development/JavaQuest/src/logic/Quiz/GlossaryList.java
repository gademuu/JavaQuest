package logic.Quiz;

import backend.StudentStats;
import backend.Word;
import backend.WordDao;
import backend.WordDaoFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author herman
 */
public abstract class GlossaryList {
    
    protected ArrayList<Word> glossary = new ArrayList<>();
    protected Iterator iterator;
    protected int numberOfWords;
    protected int numberOfCorrectAnswers;
    protected int numberOfQuestionsAnswered;
    protected Word currentWord;
    protected StudentStats studentStats;
    protected ArrayList<Word> quizGlossary = new ArrayList<>();
    
    public void initialize(String studentName, String language, int numberOfWords) {
        
        WordDao wd = WordDaoFactory.create(true);
        Word[] words = wd.find(new Word("","",language));
        glossary = new ArrayList<Word>(Arrays.asList(words));
        Collections.shuffle(glossary);
        
        quizGlossary = (ArrayList<Word>) glossary.subList(0, numberOfWords);
        
        // 4. Create a studentStats object with todays date and the provided studentName
        // 5. Cut off the list at the desired length
        
        // 6. Subclass decides whether WordAlternative is to be used
        
    }
    
    public String nextWord() {
        String theWord = "";
        
        if(iterator == null) {
            iterator = quizGlossary.iterator();
        }
        
        if(iterator.hasNext()) {
            currentWord = (Word) iterator.next();
            theWord = currentWord.getOrginal();
        }
        
        
        return theWord;
    }
    
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
    public String getPercentage(int n, int total) {
        float proportion = ((float) n) / ((float) total);
        return String.format("%.1f", new Float(proportion * 100)) + "%";
    }
    
    public void saveStats() {
        // TODO
        // Create a StudentStatsDao and use create() to store the stats from this session
    }
    
  
    
}
