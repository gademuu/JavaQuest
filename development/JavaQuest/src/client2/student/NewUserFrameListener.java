

package client2.student;

/**
 * Listeners are used by the client classes to signal updates and events occuring in the user interface.
 * Each Listener is associated with a specific View (JPanel or JFrame) 
 * and should normally be implemented by classes in the Logic package.
 * @author herman
 */
public interface NewUserFrameListener {
    
    /**
     *
     * @param name
     * @param password
     */
    public void newUser(String name, String password);
    
}
