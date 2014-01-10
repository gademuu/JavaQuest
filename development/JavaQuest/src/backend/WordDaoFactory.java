package backend;

/*
 WordDaoFactory uses it's create method to enable the WordDao to be instanced outside the backend package.
 * It supports keeping the WordDao as a singleton. 
 */

/**
 *
 * @author herman
 */

public class WordDaoFactory {

    private static WordDao theWordDao = null;

    /**
     * Creates a WordDao object.
     * @param singleton
     * @return aWord
     */
    public static WordDao create(boolean singleton) {
        WordDao aWord = null;

        if (singleton && theWordDao != null) {
            aWord = theWordDao;
        } else {
            theWordDao = new PropWordDaoImpl();
            aWord = theWordDao;
        }

        return aWord;

    }

}
