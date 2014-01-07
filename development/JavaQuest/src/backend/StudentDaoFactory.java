

package backend;

/**
 * StudentDaoFactory uses it's create method to enable the StudentDao to be instanced outside the backend package.
 * @author herman
 */
public class StudentDaoFactory {
    
    
    private static StudentDao theStudentDao = null;
    
    public static StudentDao create(boolean singleton){
    StudentDao aStudentDao = null;
        
        if(singleton && theStudentDao != null) {
            aStudentDao = theStudentDao; 
        } else {
            theStudentDao = new PropStudentDaoImpl();
           aStudentDao = theStudentDao;
        }
        
        return aStudentDao;
    
    }
    
}

    

