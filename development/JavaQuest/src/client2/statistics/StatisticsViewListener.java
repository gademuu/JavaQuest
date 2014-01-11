
package client2.statistics;

import backend.StudentStats;

/**
 * Listeners are used by the client classes to signal updates and events occuring in the user interface.
 * Each Listener is associated with a specific View (JPanel or JFrame) 
 * and should normally be implemented by classes in the Logic package.
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
