
package client2.statistics;

import backend.StudentStats;

/**
 * Listener interface for the StasticsView class.
 * @author pierrezarebski
 */
public interface StatisticsViewListener {
    
    /**
     *
     * @param studentName
     */
    public void statsButtonSelected(String studentName);

    
    public void studentNameListSelected();
    
}
