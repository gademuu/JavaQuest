
package logic.statistics;

import backend.Student;
import backend.StudentDaoFactory;
import backend.StudentStats;
import backend.StudentStatsDao;
import backend.StudentStatsDaoFactory;
import client2.statistics.StatisticsViewListener;
import client2.statistics.StatisticsViewSetter;
import logic.Login.LoginManager;

/**
 *
 * @author herman
 */
public class StatisticsManager implements  StatisticsViewListener{
    
    private StatisticsViewSetter ui;
     //String studentName;
     LoginManager lm;
    
    public StatisticsManager(LoginManager lm,StatisticsViewSetter setter){
        this.ui = setter;
        ui.setStatisticsViewListener(this);
         //this.studentName = studentName;
         this.lm = lm;
         
        
    }
    
      public void statsButtonSelected(String studentName){
          //this.studentName = lm.getStudentName();
          System.out.println("StatisticsManager.statsButtonSelected [" + studentName +"]");
         ui.setStatisticsList(StudentStatsDaoFactory.create(true).find(new StudentStats(studentName,null,null)));
         
     }

    public void studentNameListSelected() {
        ui.setStudentNames(StudentDaoFactory.create(true).find(new Student("","")));
    }
    
}
