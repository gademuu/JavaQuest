
package client2.student;

import client2.MainFrameListener;

/**
 * Setter interface for the class NewUserFrame.
 * Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface NewUserFrameSetter {
    
   
    public void setRegisterOk();

    /**
     *
     * @param newListener
     */
    public void setUserFrameListener(NewUserFrameListener newListener);

    /**
     *
     * @param listener
     */
    public void setMainFrameListener(MainFrameListener listener);
    
    
}
