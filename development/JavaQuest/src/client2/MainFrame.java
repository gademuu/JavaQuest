package client2;



import backend.Student;
import backend.StudentStats;
import backend.Word;
import client2.login.LoginFrame;
import client2.statistics.StatisticsView;
import client2.Quizz.QuizTextView;
import client2.Quizz.QuizView;
import client2.Quizz.QuizAlternativesView;
import client2.Quizz.QuizAlternativesViewSetter;
import client2.Quizz.QuizTextViewSetter;
import client2.Quizz.QuizViewListener;
import client2.Quizz.QuizViewSetter;
import client2.glossary.GlossaryView;
import client2.glossary.GlossaryViewListener;
import client2.glossary.GlossaryViewSetter;
import client2.statistics.StatisticsViewListener;
import client2.statistics.StatisticsViewSetter;
import javax.swing.JPanel;

/**
 * The panel for the main frame.
 * @author pierrezarebski
 */
public class MainFrame extends javax.swing.JFrame implements StatisticsViewSetter, QuizViewSetter, GlossaryViewSetter{

    //Variabless
    private StatisticsViewListener svListener;
    private QuizViewListener qvListener;
    GlossaryViewListener glListener;
    //End of variables
    
    //Should never be called
    public void setLanguages(String[] languages){}
    public void setGlossaryLists(String[] lists){}
    public QuizAlternativesViewSetter getQuizAlternativesViewSetter(){return null;}     
    public QuizTextViewSetter getQuizTextViewSetter(){return null;}   
    public void setStatisticsList(StudentStats[] ss) {}
    public void setStudentNames(Student[] students) {}
    public void  setGlossaryList(Word[] list){}
    
    
    /**
     *
     * @param svListener
     */
    public void setStatisticsViewListener(StatisticsViewListener svListener) {
        this.svListener = svListener;
    }

    /**
     *
     * @param qvListener
     */
    public void setQuizViewListener(QuizViewListener qvListener) {
        this.qvListener = qvListener;
    }

    /**
     *
     * @param glListener
     */
    public void setGlossaryViewListener(GlossaryViewListener glListener){
         this.glListener = glListener;
     }
 
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    /**
     *
     * @return quizPanel
     */
    public QuizView getQuizView(){
        return quizPanel;
    }
    
    /**
     *
     * @return glossaryPanel
     */
    public GlossaryView getGlossaryView(){
         return glossaryPanel;
    }
    
    /**
     *
     * @return statisticsPanel
     */
    public StatisticsView getStatisticsView(){
        return statisticsPanel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFramePanel = new javax.swing.JPanel();
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
        helpPanel = new client2.HelpView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Pear");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        mainFramePanel.setMaximumSize(new java.awt.Dimension(800, 600));
        mainFramePanel.setMinimumSize(new java.awt.Dimension(800, 600));
        mainFramePanel.setPreferredSize(new java.awt.Dimension(800, 600));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuPanel.setMinimumSize(new java.awt.Dimension(800, 100));
        menuPanel.setPreferredSize(new java.awt.Dimension(800, 100));

        toggleBtn_menu1.setBackground(new java.awt.Color(51, 153, 255));
        toggleBtn_menu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toggleBtn_menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/quiz.png"))); // NOI18N
        toggleBtn_menu1.setText("Quiz");
        toggleBtn_menu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleBtn_menu1.setMaximumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu1.setMinimumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu1.setPreferredSize(new java.awt.Dimension(180, 80));
        toggleBtn_menu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleBtn_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu1ActionPerformed(evt);
            }
        });

        toggleBtn_menu2.setBackground(new java.awt.Color(51, 153, 255));
        toggleBtn_menu2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toggleBtn_menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        toggleBtn_menu2.setText("Ny Gloslista");
        toggleBtn_menu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleBtn_menu2.setMaximumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu2.setMinimumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu2.setPreferredSize(new java.awt.Dimension(180, 80));
        toggleBtn_menu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleBtn_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu2ActionPerformed(evt);
            }
        });

        toggleBtn_menu3.setBackground(new java.awt.Color(51, 153, 255));
        toggleBtn_menu3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toggleBtn_menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stat.png"))); // NOI18N
        toggleBtn_menu3.setText("Statistik");
        toggleBtn_menu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleBtn_menu3.setMaximumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu3.setMinimumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu3.setPreferredSize(new java.awt.Dimension(180, 80));
        toggleBtn_menu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleBtn_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_menu3ActionPerformed(evt);
            }
        });

        toggleBtn_menu4.setBackground(new java.awt.Color(51, 153, 255));
        toggleBtn_menu4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toggleBtn_menu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help.png"))); // NOI18N
        toggleBtn_menu4.setText("Hjälp");
        toggleBtn_menu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleBtn_menu4.setMaximumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu4.setMinimumSize(new java.awt.Dimension(180, 29));
        toggleBtn_menu4.setPreferredSize(new java.awt.Dimension(180, 80));
        toggleBtn_menu4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
                .addContainerGap()
                .addComponent(toggleBtn_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toggleBtn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(toggleBtn_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(toggleBtn_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toggleBtn_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toggleBtn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleBtn_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleBtn_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayoutPanel.setAlignmentY(1.0F);
        cardLayoutPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        cardLayoutPanel.setLayout(new java.awt.CardLayout());

        startPanel.setBackground(new java.awt.Color(255, 255, 255));
        startPanel.setMinimumSize(new java.awt.Dimension(800, 500));
        startPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        cardLayoutPanel.add(startPanel, "card8");
        cardLayoutPanel.add(quizPanel, "card7");
        cardLayoutPanel.add(quizAlternativesPanel, "card7");
        cardLayoutPanel.add(quizTextPanel, "card8");
        cardLayoutPanel.add(glossaryPanel, "card7");
        cardLayoutPanel.add(statisticsPanel, "card7");
        cardLayoutPanel.add(helpPanel, "card8");

        javax.swing.GroupLayout mainFramePanelLayout = new javax.swing.GroupLayout(mainFramePanel);
        mainFramePanel.setLayout(mainFramePanelLayout);
        mainFramePanelLayout.setHorizontalGroup(
            mainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(mainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFramePanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(cardLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFramePanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        mainFramePanelLayout.setVerticalGroup(
            mainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(mainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFramePanelLayout.createSequentialGroup()
                    .addContainerGap(100, Short.MAX_VALUE)
                    .addComponent(cardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
            .addGroup(mainFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFramePanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(500, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainFramePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainFramePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void toggleBtn_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_menu2ActionPerformed
        changePanel(glossaryPanel);
        
        toggleBtn_menu1.setSelected(false);
        toggleBtn_menu3.setSelected(false);
        toggleBtn_menu4.setSelected(false);
        glListener.listMenu();
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
        changePanel(helpPanel);
        
        toggleBtn_menu1.setSelected(false);
        toggleBtn_menu2.setSelected(false);
        toggleBtn_menu3.setSelected(false);
    }//GEN-LAST:event_toggleBtn_menu4ActionPerformed

    /**
     * Changes the panels
     * @param panel
     */
    public void changePanel(javax.swing.JPanel panel) {
        cardLayoutPanel.removeAll();
        cardLayoutPanel.add(panel);
        cardLayoutPanel.repaint();
        cardLayoutPanel.revalidate();
    }
    
    /**
     *
     */
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
    private client2.HelpView helpPanel;
    private javax.swing.JPanel mainFramePanel;
    private javax.swing.JPanel menuPanel;
    private client2.Quizz.QuizAlternativesView quizAlternativesPanel;
    private client2.Quizz.QuizView quizPanel;
    private client2.Quizz.QuizTextView quizTextPanel;
    private client2.StartView startPanel;
    private client2.statistics.StatisticsView statisticsPanel;
    private javax.swing.JToggleButton toggleBtn_menu1;
    private javax.swing.JToggleButton toggleBtn_menu2;
    private javax.swing.JToggleButton toggleBtn_menu3;
    private javax.swing.JToggleButton toggleBtn_menu4;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @return cardLayoutPanel
     */
    public JPanel getCardLayoutPanel() {
        return cardLayoutPanel;
    }

    /**
     *
     * @return quizAlternativesPanel
     */
    public QuizAlternativesView getQuizAlternativesPanel() {
        return quizAlternativesPanel;
    }

    /**
     *
     * @return quizTextPanel
     */
    public QuizTextView getQuizTextPanel() {
        return quizTextPanel;
    }
}

