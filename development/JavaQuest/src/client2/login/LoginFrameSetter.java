
package client2.login;

/**
 * Setter interface for the Class LoginFrame.
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
