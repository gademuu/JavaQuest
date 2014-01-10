
package client2.student;

import client2.MainFrameListener;

/**
 * Setter interface for the class NewUserFrame.
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
