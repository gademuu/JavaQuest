/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/**
 *
 * @author herman
 */
public class PropStudentStatsDaoImpl extends PropDaoImpl implements StudentStatsDao {
 
     
     private static final String FILE = ".properties";
     
    
    public StudentStats create(StudentStats aStudentStats){
        
       
        
        Properties prop = new Properties();
        prop = load(aStudentStats.getName()+FILE);
       
 
        
        prop.setProperty(aStudentStats.getQuizName(), aStudentStats.getStats());
        store(aStudentStats.getName()+FILE, prop, true);

       
           
       
        return aStudentStats ;
    
    }

    public StudentStats read(StudentStats aStudentStats){
    Properties prop = new Properties();
        prop = load(aStudentStats.getName()+FILE);
        StudentStats s = null;
        
        s = new StudentStats(aStudentStats.getName(), aStudentStats.getQuizName(), prop.getProperty(aStudentStats.getQuizName()));
    
    return s;
    }

    
 public void update(StudentStats aStudentStats) {
 // TODO
 }
    
    public void delete(StudentStats aStudentStats) {
    // TODO
    }
    
    public StudentStats[] find(StudentStats criteria) {
        
    // TODO    
        return null;
    }
    
}
