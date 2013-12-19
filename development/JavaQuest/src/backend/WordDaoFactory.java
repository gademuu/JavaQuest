

package backend;


public class WordDaoFactory {
    
    private static WordDao theWordDao = null;
    
    public static WordDao create(boolean singleton){
    WordDao aWord = null;
        
        if(singleton && theWordDao != null) {
            aWord = theWordDao; 
        } else {
            theWordDao = new PropWordDaoImpl();
           aWord = theWordDao;
        }
        
        return aWord;
    
    }
    
}
