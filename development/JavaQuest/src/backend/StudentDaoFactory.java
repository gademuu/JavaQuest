

package backend;

/**
 *
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

    

