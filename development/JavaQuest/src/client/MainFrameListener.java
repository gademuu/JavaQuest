package client;

/**
 *
 * @author pierrezarebski
 */
public interface MainFrameListener {
    public void menuBtnQuizToggled();
    public void menuBtnNewListToggled();
    public void menuBtnStatisticsToggled();
    public void menuBtnSettingsToggled();
    
    public void quizBtnLanguage1Toggled();
    public void quizBtnLanguageMixToggled();
    public void quizBtnLanguage2Toggled();
    
    public void quizBtn3AlternativeToggled();
    public void quizBtnFreetextToggled();
    
    public void quizBtnStartToggled();
}
