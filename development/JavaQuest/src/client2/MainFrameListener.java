package client2;

/**
 * Listeners are used by the client classes to signal updates and events occuring in the user interface.
 * Each Listener is associated with a specific View (JPanel or JFrame) 
 * and should normally be implemented by classes in the Logic package.
 * @author herman
 */
public interface MainFrameListener {

    
    public void mainFrameCreate();

    public void newUserFrameCreate();
    
}
