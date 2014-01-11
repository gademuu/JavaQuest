
package client2.login;

import client2.MainFrame;

/**
 *Listeners are used by the client classes to signal updates and events occuring in the user interface.
 * Each Listener is associated with a specific View (JPanel or JFrame) 
 * and should normally be implemented by classes in the Logic package.
 * @author pierrezarebski
 */
public interface LoginListener {
    
    /**
     *
     * @param name
     * @param password
     */
    public void loginBtnPressed(String name, String password);

    /**
     *
     */
    public void registerBtnPressed();
 
    
}
