package client2;

/**
 *
 * @author pierrezarebski
 */
public interface QuizViewListener {
    /*
    Här bör vi väl ha med vilken typ av språk som har valts genom en sträng
    */
    public void languageOneSelected();
    public void languageTwoSelected();
    
    /**
     * Tanken är att ifall man väljer 1 gloslista, oavsett ifall det är i
     * "mina listor" eller "andras" så låser vi den andra combo boxen och
     * metoden bearbetar det valda
     * 
     * Likadant här
     */
    public void glossaryListSelected();
    
    public void respondLanguageOneBtnToggled();
    public void respondLanguageMixBtnToggled();
    public void respondLanguageTwoBtnToggled();
    
    public void alternativesQuizBtnToggled();
    public void textQuizBtnToggled();
    
}
