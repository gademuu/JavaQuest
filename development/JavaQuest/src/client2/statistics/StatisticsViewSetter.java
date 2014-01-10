package client2.statistics;

import backend.Student;
import backend.StudentStats;

/**
 *  Setter interface for the StasticsView class.
 * @author herman
 */
public interface StatisticsViewSetter {
    
    /**
     *
     * @param listener
     */
    public void setStatisticsViewListener(StatisticsViewListener listener);

    /**
     *
     * @param ss
     */
    public void setStatisticsList(StudentStats[] ss);

    /**
     *
     * @param students
     */
    public void setStudentNames(Student[]students);
    
}
