package logic.Login;

import client2.login.LoginListener;
import backend.*;
import client2.login.LoginFrameSetter;
import client2.login.*;

/**
 * Handles the events when a user login in. 
 * @author Herman
 */
public class LoginManager implements LoginListener {
    
    private Student student;
    private LoginFrameSetter ui;
    
    /**
     * Constructor for the LoginManager.
     * @param setter
     */
    public LoginManager(LoginFrameSetter setter){
        ui = setter;
        setter.setLoginListener(this);
        
    }
    
    /**
     * Uses the StudenDao method read to see if the user exists and verifies the password. 
     * @param name
     * @param password
     */
    public void loginBtnPressed(String name, String password){
        student = new Student(name, password);
        StudentDao sd = StudentDaoFactory.create(true);
        Student s = sd.read(student);
        
        if(s.isCorrect(password)){
            student = s;
            ui.setLoginOk();
        }else{
            student = null;
            ui.wrongUser("Wrong username or password");
        }
        
    }
    
    /**
     * The student that has logged in. 
     * @param student
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    //Not in use
    public void registerBtnPressed(){}
    
    /**
     *
     * @return student.getName()
     */
    public String getStudentName(){
        return student.getName();
    } 
    
    
    
}
