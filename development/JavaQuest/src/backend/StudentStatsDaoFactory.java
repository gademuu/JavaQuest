/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 * StudentStatsDaoFactory uses it's create method to enable the StudentStatsDao
 * to be instanced outside the backend package. It supports keeping the
 * studentStatsDao as a singleton.
 *
 * @author herman
 */
public class StudentStatsDaoFactory {

    private static StudentStatsDao theStudentStatsDao = null;

    /**
     * Creates a StudentStatsDao object.
     * @param singleton
     * @return aStudentStatsDao
     */
    public static StudentStatsDao create(boolean singleton) {
        StudentStatsDao aStudentStatsDao = null;

        if (singleton && theStudentStatsDao != null) {
            aStudentStatsDao = theStudentStatsDao;
        } else {
            theStudentStatsDao = new PropStudentStatsDaoImpl();
            aStudentStatsDao = theStudentStatsDao;
        }

        return aStudentStatsDao;

    }

}
