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
 
     
     private static final String FILE = "StudentStats.getName() + \".properties\"";
     
    
    public String create(StudentStats aStudentStats){
        
        String id = null;
        
        Properties prop = new Properties();
        prop = load(aStudentStats.getName()+FILE);
        //prop.list(System.out);
 
        
        prop.setProperty(aStudentStats.getQuizName(), aStudentStats.getStats());
        store(aStudentStats.getName()+FILE, prop, true);

        id = aStudentStats.getName();
            //prop.list(System.out);
       
        return id;
    
    }

    public StudentStats read(String id, String quizName){
    
        StudentStats s = null;
        Properties prop = new Properties();
     
        prop = load(id+FILE);
        prop.get(quizName);
        s = new StudentStats(id, quizName, prop.getProperty(quizName));        
        return s;
    }

    
 public void update(StudentStats aStudentStats) {
 // TODO
 }
    
    public void delete(String id, String quizName) {
    // TODO
    }
    
    public StudentStats[] find(StudentStats criteria) {
        
    // TODO    
        return null;
    }
    
}
