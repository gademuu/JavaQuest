/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 * The StudentStats class represents the statistics of an user with the
 * persistent data, name quizName and stats.
 *
 * @author herman
 */
public class StudentStats {

    private String name;
    private String quizName;
    private String stats;

    /**
     *
     * @param name
     * @param quizName
     * @param stats
     */
    public StudentStats(String name, String quizName, String stats) {
        this.name = name;
        this.quizName = quizName;
        this.stats = stats;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return quizName
     */
    public String getQuizName() {
        return quizName;
    }

    /**
     *
     * @param quizName
     */
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    /**
     *
     * @return stats
     */
    public String getStats() {
        return stats;
    }

    /**
     *
     * @param stats
     */
    public void setStats(String stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "StudentStats{" + "name=" + name + ", quizName=" + quizName + ", stats=" + stats + '}';
    }

}
