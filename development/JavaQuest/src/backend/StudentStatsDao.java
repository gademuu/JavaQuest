/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 * Interface for an application to store and load persistent StudentStats
 * objects.
 *
 * @author herman
 */
public interface StudentStatsDao {

    /**
     *
     * @param aStudentStats
     * 
     */
    public StudentStats create(StudentStats aStudentStats);

    /**
     *
     * @param aStudentStats
     * 
     */
    public StudentStats read(StudentStats aStudentStats);

    /**
     *
     * @param aStudentStats
     */
    public void update(StudentStats aStudentStats);

    /**
     *
     * @param aStudentStats
     */
    public void delete(StudentStats aStudentStats);

    /**
     *
     * @param criteria
     * 
     */
    public StudentStats[] find(StudentStats criteria);

}
