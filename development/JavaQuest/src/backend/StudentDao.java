package backend;

/**
 * Interface for an application to store and load persistent student objects.
 *
 * @author herman
 */
public interface StudentDao {

    /**
     *
     * @param aStudent
     * 
     */
    public Student create(Student aStudent);

    /**
     *
     * @param aStudent
     * 
     */
    public Student read(Student aStudent);

    /**
     *
     * @param aStudent
     */
    public void update(Student aStudent);

    /**
     *
     * @param aStudent
     */
    public void delete(Student aStudent);

    /**
     *
     * @param criteria
     * 
     */
    public Student[] find(Student criteria);

}
