package backend;

/**
 * StudentDaoFactory uses it's create method to enable the StudentDao to be
 * instanced outside the backend package. It supports keeping the studentDao as
 * a singleton.
 *
 * @author herman
 */
public class StudentDaoFactory {

    private static StudentDao theStudentDao = null;

    /**
     * Creates a StudentDao object.
     * @param singleton
     * @return a StudentDao
     */
    public static StudentDao create(boolean singleton) {
        StudentDao aStudentDao = null;

        if (singleton && theStudentDao != null) {
            aStudentDao = theStudentDao;
        } else {
            theStudentDao = new PropStudentDaoImpl();
            aStudentDao = theStudentDao;
        }

        return aStudentDao;

    }

}
