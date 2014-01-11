
package client2.login;

/**
 * Setter interface for the Class LoginFrame.
 * Setters are used by the logic classes to update the state in the UI. 
 * Each Setter is associated with a specific View (JFrame or JPanel).
 * @author herman
 */
public interface LoginFrameSetter {
    
    /**
     *
     * @param listener
     */
    public void setLoginListener(LoginListener listener);

    /**
     *
     * @param message
     */
    public void wrongUser(String message);

    /**
     *
     */
    public void setLoginOk();
    
}
