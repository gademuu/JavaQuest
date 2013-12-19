package logic.Quiz;

import backend.StudentStats;
import backend.Word;
import java.util.ArrayList;
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
    
    public void initialize(String studentName, String language, int numberOfWords) {
        
        // TODO
        // 1. create WordDao using Factory
        // 2. Use find(word.language = language) to retrieve the total glossary for the language
        // 3. shuffle the list using Collections.shuffle()
        // 4. Create a studentStats object with todays date and the provided studentName
        // 5. Cut off the list at the desired length
        // 6. Subclass decides whether WordAlternative is to be used
        
    }
    
    public String nextWord() {
        String theWord = "";
        
        if(iterator == null) {
            iterator = glossary.iterator();
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
    
    public float getPercentage() {
        float p = 0;
    // TODO calculate percentage of correct answers
    
        return p;
    }
    
    public void saveStats() {
        // TODO
        // Create a StudentStatsDao and use create() to store the stats from this session
    }
    
}
