package backend;

/**
 * The Word class represents a word with the persistent data, orginal,
 * translation and language.
 *
 * @author herman
 */
public class Word {

    private String orginal;
    private String translation;
    private String language;

    /**
     *
     * @param orginal
     * @param translation
     * @param language
     */
    public Word(String orginal, String translation, String language) {

        this.orginal = orginal;
        this.translation = translation;
        this.language = language;

    }

    /**
     *
     * @param orginal
     */
    public void setOrginal(String orginal) {
        this.orginal = orginal;
    }

    /**
     *
     * @param translation
     */
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     *
     * @return orginal
     */
    public String getOrginal() {

        return orginal;
    }

    /**
     *
     * @return translation
     */
    public String getTranslation() {

        return translation;
    }

    /**
     * Method isCorrect. Validates the provided answer. Validation is not case
     * sensitive.
     *
     * @param translation the answer given by the user
     * @return true if the answer is correct
     */
    public boolean isCorrect(String translation) {
        return this.translation.equals(translation.toLowerCase());
    }

    /**
     *
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public String toString() {

        return orginal + ":" + translation + ":" + language;
    }

}
