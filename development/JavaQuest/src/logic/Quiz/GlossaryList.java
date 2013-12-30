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
import java.util.Iterator;

/**
 * Hanterar ordlistan. 
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
        for(int i = 0 ; i < numberOfWords; i++) {
            glossary.get(i);
            quizGlossary.add(glossary.get(i));
            
        }
        
        
        
       // quizGlossary = (ArrayList<Word>) glossary.subList(0, numberOfWords);
        
        studentStats = new StudentStats(studentName, new Date().toString(), "");
        
        
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
    private String getPercentage(int n, int total) {
        float proportion = ((float) n) / ((float) total);
        return String.format("%.1f", new Float(proportion * 100)) + "%";
    }
    
    public void saveStats() {
       studentStats.setStats(getPercentage(numberOfCorrectAnswers, numberOfWords));
       StudentStatsDaoFactory.create(true);
       
       StudentStatsDao ssDao = StudentStatsDaoFactory.create(true);

        ssDao.create(studentStats);
    }
    
  
    
}
