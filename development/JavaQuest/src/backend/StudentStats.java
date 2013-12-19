/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

/**
 *
 * @author herman
 */
public class StudentStats {
    
    private String name;
    private String quizName;
    private String stats;

    public StudentStats(String name, String quizName, String stats) {
        this.name = name;
        this.quizName = quizName;
        this.stats = stats;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "StudentStats{" + "name=" + name + ", quizName=" + quizName + ", stats=" + stats + '}';
    }
    
   
    
}
