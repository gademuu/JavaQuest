

package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author herman
 */
class PropStudentDaoImpl extends PropDaoImpl implements StudentDao {
    
    private static final String FILE = "student.properties";
    
    public String create(Student aStudent){
        
        String id = null;       
        Properties prop = new Properties();
        prop = load(FILE);
           // prop.list(System.out);
        
        prop.setProperty(aStudent.getName(), aStudent.getPassword());
        store(FILE, prop, true);
        id = aStudent.getName();
           
        return id;
    
    }

    public Student read(String id){
    
        Student s = null;
        Properties prop = new Properties();
        
        prop = load(FILE);
        prop.get(id);
        s = new Student(id, prop.getProperty(id));
        
        return s;
    
    }

    
 public void update(Student aStudent) {
 // TODO
 }
    
    public void delete(String id) {
    // TODO
    }
    
    public Student[] find(Student criteria) {
        // TODO
        return null;
    }
    
}
