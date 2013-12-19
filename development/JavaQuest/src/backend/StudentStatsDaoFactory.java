/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

/**
 *
 * @author herman
 */
public class StudentStatsDaoFactory {
    
      private static StudentStatsDao theStudentStatsDao = null;
    
    public static StudentStatsDao create(boolean singleton){
    StudentStatsDao aStudentStatsDao = null;
        
        if(singleton && theStudentStatsDao != null) {
            aStudentStatsDao = theStudentStatsDao; 
        } else {
            theStudentStatsDao = new PropStudentStatsDaoImpl();
           aStudentStatsDao = theStudentStatsDao;
        }
        
        return aStudentStatsDao;
    
    }
    
}
