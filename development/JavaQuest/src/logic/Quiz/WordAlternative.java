/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic.Quiz;

import backend.*;

/**
 *
 * @author herman
 */
public class WordAlternative extends Word {
    
    private String incorrectAlternative1;
    private String incorrectAlternative2;

    public WordAlternative(String incorrectAlternative1, String incorrectAlternative2, String orginal, String translation, String language) {
        super(orginal, translation, language);
        this.incorrectAlternative1 = incorrectAlternative1;
        this.incorrectAlternative2 = incorrectAlternative2;
    }

    public String getIncorrectAlternative1() {
        return incorrectAlternative1;
    }

    public void setIncorrectAlternative1(String incorrectAlternative1) {
        this.incorrectAlternative1 = incorrectAlternative1;
    }

    public String getIncorrectAlternative2() {
        return incorrectAlternative2;
    }

    public void setIncorrectAlternative2(String incorrectAlternative2) {
        this.incorrectAlternative2 = incorrectAlternative2;
    }

     @Override
    public String toString() {
        return "WordAlternative{" + super.toString() + "[" + incorrectAlternative1 + "] [" + incorrectAlternative2 + "]}";
    }
 
    
    
    public String[] getAlternativesInRandomOrder() {
        String[] alternativesInRandomOrder = new String[3];
        
       java.util.Random r = new java.util.Random();
       int i1 = r.nextInt(3);
       int i2 = r.nextInt(3);
       
       while(i1 == i2) {
           i2 = r.nextInt(3);
       }
       int i3 = r.nextInt(3);
       while(i3 == i1 || i3 == i2) {
           i3 = r.nextInt(3);
       }
   
        alternativesInRandomOrder[i1] = getTranslation();
        alternativesInRandomOrder[i2] = incorrectAlternative1;
        alternativesInRandomOrder[i3] = incorrectAlternative2;
        
        return alternativesInRandomOrder;
    }
    
    //
}
