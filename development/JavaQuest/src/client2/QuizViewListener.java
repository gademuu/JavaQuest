
package client2;

/**
 *
 * @author pierrezarebski
 */
public interface QuizViewListener {
    
    public void languageOneSelected();
    public void languageTwoSelected();
    
    /**
     * Tanken är att ifall man väljer 1 gloslista, oavsett ifall det är i
     * "mina listor" eller "andras" så låser vi den andra combo boxen och
     * metoden bearbetar det valda
     */
    public void glossaryListSelected();
    
    public void respondLanguageOneBtnToggled();
    public void respondLanguageMixBtnToggled();
    public void respondLanguageTwoBtnToggled();
    
    public void alternativesQuizBtnToggled();
    public void textQuizBtnToggled();
    
}
