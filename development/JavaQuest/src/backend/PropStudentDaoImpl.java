

package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author herman
 */
class PropStudentDaoImpl extends PropDaoImpl implements StudentDao {
    
    
    private static final String STUDENT_FILE_PREFIX = "student_";
    private static final String STUDENT_FILE_SUFFIX= ".properties";
    
    public Student create(Student aStudent){
        
        String id = null;       
        Properties prop = new Properties();
        prop = load(STUDENT_FILE_PREFIX + aStudent.getName() + STUDENT_FILE_SUFFIX);
          
        
        prop.setProperty(aStudent.getName(), aStudent.getPassword());
        store(STUDENT_FILE_PREFIX + aStudent.getName() + STUDENT_FILE_SUFFIX, prop, true);
        id = aStudent.getName();
           
        return aStudent;
    
    }

    public Student read(Student aStudent){
    
        Student s = null;
        Properties prop = new Properties();
        String id = aStudent.getName();
        prop = load(STUDENT_FILE_PREFIX + aStudent.getName() + STUDENT_FILE_SUFFIX);
        String name = (String)prop.get(id);
        s = new Student(name, aStudent.getName());
        
        return s;
    
    }

    
 public void update(Student aStudent) {
 // TODO
 }
    
    public void delete(String aStudent) {
    // TODO
    }
    
    public Student[] find(Student criteria) {
        
        ArrayList<Student> matches = new ArrayList<>();
        Properties prop = load(STUDENT_FILE_PREFIX + criteria.getPassword() + STUDENT_FILE_SUFFIX);
        
        Set<Map.Entry<Object, Object>> students;
        students = prop.entrySet();
        Iterator it = students.iterator();
        
        while(it.hasNext()){
            Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) it.next();
            Student s = new Student((String)e.getKey(), criteria.getPassword());
            matches.add(s);
        }
        return null;
    }
    
}
