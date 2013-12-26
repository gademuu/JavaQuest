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
             
    }
   
   public static void main(String[] args){
       GlossaryListAlternatives myGLA = new GlossaryListAlternatives();
       myGLA.initialize("herman", "english", 2);
       
       
        String w = myGLA.nextWord();
        while(!w.equals("")) {
            System.out.println(w.toString());
        }
   }
    
}
