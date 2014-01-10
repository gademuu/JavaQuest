
package logic.Student;

import backend.*;
import client2.student.NewUserFrameListener;
import client2.student.NewUserFrameSetter;
import logic.Login.LoginManager;

/**
 * Uses the StudentDao to create new students. 
 * @author herman
 */
public class StudentManager implements NewUserFrameListener{
    
    NewUserFrameSetter ui;
    LoginManager lm;

    /**
     * Constructor for the StudentManager.
     * @param setter
     * @param lm
     */
    public StudentManager(NewUserFrameSetter setter, LoginManager lm){
       this.ui = setter;
       ui.setUserFrameListener(this);
       this.lm = lm;
       
    }
    
    /**
     * Creates a new Student with the StudentDao method create.
     * @param name
     * @param password
     */
    public void newUser(String name, String password){
         Student s = new Student(name,password);
         StudentDao sd = StudentDaoFactory.create(true);
         sd.create(s);
         ui.setRegisterOk();
         lm.setStudent(s);
     }
    
  
}
