package logic.Login;

import client2.login.LoginListener;
import backend.*;
import client2.login.LoginFrameSetter;
import client2.login.*;

/**
 *
 * @author Herman
 */
public class LoginManager implements LoginListener {
    
    private Student student;
    private LoginFrameSetter ui;
    
    public LoginManager(LoginFrameSetter setter){
        ui = setter;
        setter.setLoginListener(this);
        
    }
    
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
    
      public void setStudent(Student student) {
        this.student = student;
    }
    public void registerBtnPressed(){}
    
    public String getStudentName(){
        return student.getName();
    } 
    
    
    
}
