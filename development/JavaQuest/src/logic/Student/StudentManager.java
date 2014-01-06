
package logic.Student;

import backend.*;
import client2.student.NewUserFrameListener;
import client2.student.NewUserFrameSetter;

/**
 *  (ska använda studentdao, skapa en ny student. Ta imot password och namn.)
 * @author herman
 */
public class StudentManager implements NewUserFrameListener{
    
    NewUserFrameSetter ui;
   
    
    
    public StudentManager(NewUserFrameSetter setter){
       this.ui = setter;
       ui.setUserFrameListener(this);
      
       
    }
    
     public void newUser(String name, String password){
         Student s = new Student(name,password);
         StudentDao sd = StudentDaoFactory.create(true);
         sd.create(s);
         ui.setRegisterOk();
     }
    
  
}
