
package client2.login;

import client2.MainFrame;

/**
 *Listener interface for the class LoginFrame.
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
