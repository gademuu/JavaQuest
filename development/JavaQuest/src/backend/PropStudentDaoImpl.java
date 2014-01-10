package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Implementation of the StudentDao interface Using properties files as storage.
 *
 * @author herman
 */
class PropStudentDaoImpl extends PropDaoImpl implements StudentDao {

    private static final String FILE = "student.properties";

    
   /**
     * Creates a new student object.
     * @param aStudent 
     * @return aStudent 
     */
    public Student create(Student aStudent) {

        String id = null;
        Properties prop = new Properties();
        prop = load(FILE);

        prop.setProperty(aStudent.getName(), aStudent.getPassword());
        store(FILE, prop, true);
        id = aStudent.getName();

        return aStudent;

    }

    /**
     * Reads a student object.
     * @param aStudent 
     * @return s 
     */
    public Student read(Student aStudent) {

        Student s = null;
        Properties prop = new Properties();
        String id = aStudent.getName();
        prop = load(FILE);
        String password = (String) prop.get(id);
        System.out.println(password);
        s = new Student(id, password);

        return s;

    }
        //Not in use
    public void update(Student aStudent) { }

    public void delete(Student aStudent) { }
        //
    
    /**
     * Finds a student object
     * @param criteria
     * @return matchstudents
     */
    public Student[] find(Student criteria) {

        ArrayList<Student> matches = new ArrayList<>();
        Properties prop = load(FILE);

        Set<Map.Entry<Object, Object>> students;
        students = prop.entrySet();
        Iterator it = students.iterator();

        while (it.hasNext()) {
            Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) it.next();
            Student s = new Student((String) e.getKey(), criteria.getPassword());
            matches.add(s);
        }

        Student[] matchstudents = new Student[students.size()];
        matchstudents = matches.toArray(matchstudents);

        return matchstudents;

    }

}
