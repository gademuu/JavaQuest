
package client2.login;

/**
 *
 * @author herman
 */
public interface LoginFrameSetter {
    
    public void setLoginListener(LoginListener listener);
    public void wrongUser(String message);
     public void setLoginOk();
    
}
