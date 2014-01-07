package client2;



import backend.Student;
import backend.StudentStats;
import client2.statistics.StatisticsView;
import client2.Quizz.QuizTextView;
import client2.Quizz.QuizView;
import client2.Quizz.QuizAlternativesView;
import client2.Quizz.QuizAlternativesViewSetter;
import client2.Quizz.QuizTextViewSetter;
import client2.Quizz.QuizViewListener;
import client2.Quizz.QuizViewSetter;
import client2.glossary.GlossaryView;
import client2.statistics.StatisticsViewListener;
import client2.statistics.StatisticsViewSetter;
import javax.swing.JPanel;

/**
 *
 * @author pierrezarebski
 */
public class MainFrame extends javax.swing.JFrame implements StatisticsViewSetter, QuizViewSetter{

    private StatisticsViewListener svListener;
    private QuizViewListener qvListener;
    
    
    //Should never be called
    public void setLanguages(String[] languages){}
    public void setGlossaryLists(String[] lists){}
    public QuizAlternativesViewSetter getQuizAlternativesViewSetter(){return null;}     
    public QuizTextViewSetter getQuizTextViewSetter(){return null;}    
    public void setStatisticsList(StudentStats[] ss) {}
    public void setStudentNames(Student[] students) {}
    //End
    
    public void setStatisticsViewListener(StatisticsViewListener svListener) {
        this.svListener = svListener;
    }
    
     public void setQuizViewListener(QuizViewListener qvListener) {
        this.qvListener = qvListener;
    }
    
     
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    public QuizView getQuizView(){
        return quizPanel;
    }
    
    public GlossaryView getGlossaryView(){
         return glossaryPanel;
    }
    
    public StatisticsView getStatisticsView(){
        return statisticsPanel;
    }
    
    /*public MainFrame(MainFrameListener listener){
        initComponents();
        this.listener = listener;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        toggleBtn_menu1 = new javax.swing.JToggleButton();
        toggleBtn_menu2 = new javax.swing.JToggleButton();
        toggleBtn_menu3 = new javax.swing.JToggleButton();
        toggleBtn_menu4 = new javax.swing.JToggleButton();
        cardLayoutPanel = new javax.swing.JPanel();
        startPanel = new client2.StartView();
        quizPanel = new client2.Quizz.QuizView();
        quizAlternativesPanel = new client2.Quizz.QuizAlternativesView();
        quizTextPanel = new client2.Quizz.QuizTextView();
        glossaryPanel = new client2.glossary.GlossaryView();
        statisticsPanel = new client2.statistics.StatisticsView();
        settingsPanel = new client2.SettingsView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 362));

        menuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        toggleBtn_menu1.setText("Quiz");
        toggleBtn_menu1.setMaximumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu1.setMinimumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu1.setPreferredSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu1ActionPerformed(evt);
            }
        });

        toggleBtn_menu2.setText("Ny Gloslista");
        toggleBtn_menu2.setMaximumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu2.setMinimumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu2.setPreferredSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu2ActionPerformed(evt);
            }
        });

        toggleBtn_menu3.setText("Statistik");
        toggleBtn_menu3.setMaximumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu3.setMinimumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu3.setPreferredSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu3ActionPerformed(evt);
            }
        });

        toggleBtn_menu4.setText("Inställningar");
        toggleBtn_menu4.setMaximumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu4.setMinimumSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu4.setPreferredSize(new java.awt.Dimension(125, 29));
        toggleBtn_menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(toggleBtn_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(toggleBtn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(toggleBtn_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(toggleBtn_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toggleBtn_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toggleBtn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleBtn_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleBtn_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayoutPanel.setLayout(new java.awt.CardLayout());
        cardLayoutPanel.add(startPanel, "card8");
        cardLayoutPanel.add(quizPanel, "card7");
        cardLayoutPanel.add(quizAlternativesPanel, "card7");
        cardLayoutPanel.add(quizTextPanel, "card8");
        cardLayoutPanel.add(glossaryPanel, "card7");
        cardLayoutPanel.add(statisticsPanel, "card7");
        cardLayoutPanel.add(settingsPanel, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cardLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 309, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(cardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void toggleBtn_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_menu2ActionPerformed
        changePanel(glossaryPanel);
        
        toggleBtn_menu1.setSelected(false);
        toggleBtn_menu3.setSelected(false);
        toggleBtn_menu4.setSelected(false);
        
         
     
    }//GEN-LAST:event_toggleBtn_menu2ActionPerformed

    private void toggleBtn_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_menu1ActionPerformed
        changePanel(quizPanel);
        
        toggleBtn_menu2.setSelected(false);
        toggleBtn_menu3.setSelected(false);
        toggleBtn_menu4.setSelected(false);
        qvListener.listMenu();
        
    }//GEN-LAST:event_toggleBtn_menu1ActionPerformed

    private void toggleBtn_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_menu3ActionPerformed
        changePanel(statisticsPanel);
        
        toggleBtn_menu1.setSelected(false);
        toggleBtn_menu2.setSelected(false);
        toggleBtn_menu4.setSelected(false);
        
           svListener.studentNameListSelected();
    }//GEN-LAST:event_toggleBtn_menu3ActionPerformed

    private void toggleBtn_menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_menu4ActionPerformed
        changePanel(settingsPanel);
        
        toggleBtn_menu1.setSelected(false);
        toggleBtn_menu2.setSelected(false);
        toggleBtn_menu3.setSelected(false);
    }//GEN-LAST:event_toggleBtn_menu4ActionPerformed

    public void changePanel(javax.swing.JPanel panel) {
        cardLayoutPanel.removeAll();
        cardLayoutPanel.add(panel);
        cardLayoutPanel.repaint();
        cardLayoutPanel.revalidate();
    }
    
    public void initialize() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainFrameView().setVisible(true);
                setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardLayoutPanel;
    private client2.glossary.GlossaryView glossaryPanel;
    private javax.swing.JPanel menuPanel;
    private client2.Quizz.QuizAlternativesView quizAlternativesPanel;
    private client2.Quizz.QuizView quizPanel;
    private client2.Quizz.QuizTextView quizTextPanel;
    private client2.SettingsView settingsPanel;
    private client2.StartView startPanel;
    private client2.statistics.StatisticsView statisticsPanel;
    private javax.swing.JToggleButton toggleBtn_menu1;
    private javax.swing.JToggleButton toggleBtn_menu2;
    private javax.swing.JToggleButton toggleBtn_menu3;
    private javax.swing.JToggleButton toggleBtn_menu4;
    // End of variables declaration//GEN-END:variables

    public JPanel getCardLayoutPanel() {
        return cardLayoutPanel;
    }

    public QuizAlternativesView getQuizAlternativesPanel() {
        return quizAlternativesPanel;
    }

    public QuizTextView getQuizTextPanel() {
        return quizTextPanel;
    }
}

