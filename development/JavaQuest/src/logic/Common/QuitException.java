

package logic.Common;

/**
 * Handles how the application shall quit while running. 
 * @author herman
 * 
 */
public class QuitException extends Exception{

    /**
     * Constructor of QuizException.
     * @param message
     */
    public QuitException(String message){
           super(message);
       }
    
}
