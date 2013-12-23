

package logic.Common;

/**
 *
 * @author herman
 * hantera hur programmet ska avbrytas väl inne i programmet. 
 */
public class QuitException extends Exception{
    
       public QuitException(String message){
           super(message);
       }
    
}
