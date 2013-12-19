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
public interface StudentStatsDao {
    
     public String create(StudentStats aStudentStats);
   
    public StudentStats read(String id, String quizName);
    
    public void update(StudentStats aStudentStats);
    
    public void delete(String id, String quizName);
    
    public StudentStats[] find(StudentStats criteria);
    
}
