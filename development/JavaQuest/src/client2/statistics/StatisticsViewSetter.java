package client2.statistics;

import backend.Student;
import backend.StudentStats;

/**
 *
 * @author herman
 */
public interface StatisticsViewSetter {
    
    public void setStatisticsViewListener(StatisticsViewListener listener);
    public void setStatisticsList(StudentStats[] ss);
    public void setStudentNames(Student[]students);
    
}
