

package backend;

/**
 *
 * @author herman
 */
public interface StudentDao {
    
    public String create(Student aStudent);
   
    public Student read(String id);
    
    public void update(Student aStudent);
    
    public void delete(String id);
    
    public Student[] find(Student criteria);
    
}
