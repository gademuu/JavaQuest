package backend;

/*
 Interface for an application to store and load persistent word objects.
 */
/**
 *
 * @author herman
 */
public interface WordDao {

    /**
     *
     * @param aWord
     * 
     */
    public Word create(Word aWord);

    /**
     *
     * @param aWord
     * 
     */
    public Word read(Word aWord);

    /**
     *
     * @param aWord
     */
    public void update(Word aWord);

    /**
     *
     * @param aWord
     */
    public void delete(Word aWord);

    /**
     *
     * @param criteria
     * 
     */
    public Word[] find(Word criteria);
}
