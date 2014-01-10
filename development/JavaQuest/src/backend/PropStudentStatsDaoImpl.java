package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Implementation of the StudentStatsDao interface Using properties files as
 * storage.
 *
 * @author herman
 */
public class PropStudentStatsDaoImpl extends PropDaoImpl implements StudentStatsDao {

    private static final String FILE = ".properties";

    /**
     * Creates a new StudentStats object.
     * @param aStudentStats
     * @return aStudentStats
     */
    public StudentStats create(StudentStats aStudentStats) {

        Properties prop = new Properties();
        prop = load(aStudentStats.getName() + FILE);

        prop.setProperty(aStudentStats.getQuizName(), aStudentStats.getStats());
        store(aStudentStats.getName() + FILE, prop, true);

        return aStudentStats;

    }

    /**
     * Reads a new StudentsStats object
     * @param aStudentStats
     * @return s
     */
    public StudentStats read(StudentStats aStudentStats) {
        Properties prop = new Properties();
        prop = load(aStudentStats.getName() + FILE);
        StudentStats s = null;

        s = new StudentStats(aStudentStats.getName(), aStudentStats.getQuizName(), prop.getProperty(aStudentStats.getQuizName()));

        return s;
    }

    // Not in use
    public void update(StudentStats aStudentStats) { 
    }

    public void delete(StudentStats aStudentStats) {
    }
    //

    /**
     * Finds a StudentStats object.
     * @param criteria
     * @return matchstats
     */
    public StudentStats[] find(StudentStats criteria) {
        ArrayList<StudentStats> matches = new ArrayList<>();

        Properties prop = load(criteria.getName() + FILE);

        Set<Map.Entry<Object, Object>> statistics;
        statistics = prop.entrySet();
        Iterator iter = statistics.iterator();

        while (iter.hasNext()) {
            Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) iter.next();
            StudentStats ss = new StudentStats(criteria.getName(), (String) e.getKey(), (String) e.getValue());
            matches.add(ss);
        }

        StudentStats[] matchstats = new StudentStats[matches.size()];
        matchstats = matches.toArray(matchstats);
        return matchstats;

    }

   
    }


