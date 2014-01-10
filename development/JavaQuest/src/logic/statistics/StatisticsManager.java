
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
 * Handles the statistics classes.
 * @author herman
 */
public class StatisticsManager implements  StatisticsViewListener{
    
    private StatisticsViewSetter ui;
     //String studentName;
     LoginManager lm;
    
    /**
     * Constructor for the StatisticsManager.
     * @param lm
     * @param setter
     */
    public StatisticsManager(LoginManager lm,StatisticsViewSetter setter){
        this.ui = setter;
        ui.setStatisticsViewListener(this);
        this.lm = lm;   
    }
 

    /**
     * Checks if the statistics button is selected.
     * @param studentName
     */
      public void statsButtonSelected(String studentName){
         ui.setStatisticsList(StudentStatsDaoFactory.create(true).find(new StudentStats(studentName,null,null)));
         
     }

    /**
     * Lists the students with registered statistics.
     */
    public void studentNameListSelected() {
        ui.setStudentNames(StudentDaoFactory.create(true).find(new Student("","")));
    }
    
}
