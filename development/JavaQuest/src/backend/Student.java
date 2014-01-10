package backend;

/**
 * The Student class represents a user with the persistent data, name and
 * password.
 *
 * @author herman
 */
public class Student {

    //Variables
    private String name;
    private String password;
    //End of variables

    /**
     *
     * @param name
     * @param password
     */
    public Student(String name, String password) {

        this.name = name;
        this.password = password;

    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param password
     * @return false
     */
    public boolean isCorrect(String password) {
        if (this.password != null) {
            return this.password.equals(password);
        }

        return false;

    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return name
     */
    public String toString() {
        return name;
    }
}
