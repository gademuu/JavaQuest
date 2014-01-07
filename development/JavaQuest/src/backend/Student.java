
package backend;

/**
 * The Student class represents a user with the persisitent data, name and password.
 * @author herman
 */
public class Student {
    
    //Variables
    private String name;
    private String password;
    //End of variables
    
    public Student(String name, String password){
    
        this.name = name;
        this.password = password;
    
    }
    
    public String getName(){
        return name;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public boolean isCorrect(String password){
       return this.password.equals(password);
        
    }
    
    public String getPassword(){
        return password;
    }
    
    public String toString() {
        return name;
    }
}
