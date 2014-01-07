

package backend;

/**
 * StudentDao is an interface for the class ProStudentDaoImpl.
 * @author herman
 */
public interface StudentDao {
    
    public Student create(Student aStudent);
   
    public Student read(Student aStudent);
    
    public void update(Student aStudent);
    
    public void delete(Student aStudent);
    
    public Student[] find(Student criteria);
    
}
