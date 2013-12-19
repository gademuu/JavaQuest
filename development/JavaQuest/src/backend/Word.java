
package backend;

/**
 *
 * @author herman
 */
 public class Word {
    
    private String orginal;
    private String translation;
    private String language;
    
    public Word(String orginal, String translation,String language){
    
        this.orginal = orginal;
        this.translation = translation;
        this.language = language;
    
    }
    
    public String getOrginal(){
    
        return orginal;
    }
    
    public String getTranslation(){
    
        return translation;
    }
    
     
    
        /**
     * Method isCorrect.
     * Validates the provided answer. Validation is not case sensitive.
     *
     * @param translation the answer given by the user
     * @return true if the answer is correct
     */
    public boolean isCorrect(String translation){
        return this.translation.equals(translation.toLowerCase());
    }
    
    public String getLanguage() {
        return language;
            }
    
    public String toString(){
    
        return orginal + ":" + translation + ":" + language;
    }
    
    
}
