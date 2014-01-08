
package client2.Quizz;

import client2.MainFrame;


/**
 *
 * @author pierrezarebski
 */
public class QuizView extends javax.swing.JPanel implements QuizViewSetter {

    private QuizViewListener listener;
    private QuizAlternativesViewSetter alternativesSetter;
    private MainFrame mf;
            
    public MainFrame getMainFrame() {
        return mf;
    }

    public void setMainFrame(MainFrame mf) {
        this.mf = mf;
    }

     public QuizView() {
        initComponents();
    }
    
    public void setAlternativesSetter(QuizAlternativesViewSetter alternativesSetter) {
        this.alternativesSetter = alternativesSetter;
    }

    public void setTextSetter(QuizTextViewSetter textSetter) {
        this.textSetter = textSetter;
    }
    private QuizTextViewSetter  textSetter;       
    /**
     * Creates new form QuizView
     */
   
    
    public QuizAlternativesViewSetter getQuizAlternativesViewSetter(){
        return alternativesSetter;
    }
            
    public QuizTextViewSetter getQuizTextViewSetter(){
        return textSetter;
    }    
    
    public void setQuizViewListener(QuizViewListener qvl){
         this.listener = qvl;
}
    
    /*
       Fills the cBox_language with aviable Glossary lists
    */
    public void setLanguages(String[] languages){
        cBox_language.removeAllItems();
        if(languages != null) {
            for(String s : languages){
                cBox_language.addItem(s);    
            }          
        } 
    }
    
    
    
    public void setGlossaryLists(String[] lists){}
        
         public  void initialize(){
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
           // java.util.logging.Logger.getLogger(client.QuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(client.QuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           // java.util.logging.Logger.getLogger(client.QuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(client.QuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_glossaryList = new javax.swing.JLabel();
        label_responseLanguage = new javax.swing.JLabel();
        label_difficulty = new javax.swing.JLabel();
        cBox_language = new javax.swing.JComboBox();
        toggleBtn_language1 = new javax.swing.JToggleButton();
        toggleBtn_language2 = new javax.swing.JToggleButton();
        toggleBtn_textQuiz = new javax.swing.JToggleButton();
        toggleBtn_alternativesQuiz = new javax.swing.JToggleButton();
        btn_startQuiz = new javax.swing.JButton();
        label_3tries = new javax.swing.JLabel();
        toggleBtn_3tries = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        label_glossaryList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_glossaryList.setText("Välj en gloslista");

        label_responseLanguage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_responseLanguage.setText("Vilket språk vill du svara i?");

        label_difficulty.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_difficulty.setText("Hur vill du svara?");

        cBox_language.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cBox_language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Lista-" }));
        cBox_language.setMaximumSize(new java.awt.Dimension(300, 40));
        cBox_language.setMinimumSize(new java.awt.Dimension(300, 40));
        cBox_language.setPreferredSize(new java.awt.Dimension(300, 40));
        cBox_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox_languageActionPerformed(evt);
            }
        });

        toggleBtn_language1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toggleBtn_language1.setText("Svenska");
        toggleBtn_language1.setMaximumSize(new java.awt.Dimension(100, 29));
        toggleBtn_language1.setMinimumSize(new java.awt.Dimension(100, 29));
        toggleBtn_language1.setPreferredSize(new java.awt.Dimension(140, 40));
        toggleBtn_language1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_language1ActionPerformed(evt);
            }
        });

        toggleBtn_language2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toggleBtn_language2.setText("Språk 2");
        toggleBtn_language2.setMaximumSize(new java.awt.Dimension(140, 40));
        toggleBtn_language2.setMinimumSize(new java.awt.Dimension(140, 40));
        toggleBtn_language2.setPreferredSize(new java.awt.Dimension(140, 40));
        toggleBtn_language2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_language2ActionPerformed(evt);
            }
        });

        toggleBtn_textQuiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toggleBtn_textQuiz.setText("Fritext");
        toggleBtn_textQuiz.setMaximumSize(new java.awt.Dimension(100, 29));
        toggleBtn_textQuiz.setMinimumSize(new java.awt.Dimension(100, 29));
        toggleBtn_textQuiz.setPreferredSize(new java.awt.Dimension(140, 40));
        toggleBtn_textQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_textQuizActionPerformed(evt);
            }
        });

        toggleBtn_alternativesQuiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toggleBtn_alternativesQuiz.setText("3 Alternativ");
        toggleBtn_alternativesQuiz.setMaximumSize(new java.awt.Dimension(100, 29));
        toggleBtn_alternativesQuiz.setMinimumSize(new java.awt.Dimension(100, 29));
        toggleBtn_alternativesQuiz.setPreferredSize(new java.awt.Dimension(140, 40));
        toggleBtn_alternativesQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_alternativesQuizActionPerformed(evt);
            }
        });

        btn_startQuiz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_startQuiz.setText("Starta Quizen!");
        btn_startQuiz.setEnabled(false);
        btn_startQuiz.setMaximumSize(new java.awt.Dimension(300, 50));
        btn_startQuiz.setMinimumSize(new java.awt.Dimension(300, 50));
        btn_startQuiz.setPreferredSize(new java.awt.Dimension(300, 50));
        btn_startQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startQuizActionPerformed(evt);
            }
        });

        label_3tries.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_3tries.setText("Vill du ha 3 försök på varje glosa?");

        toggleBtn_3tries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toggleBtn_3tries.setText("Ja");
        toggleBtn_3tries.setMaximumSize(new java.awt.Dimension(140, 40));
        toggleBtn_3tries.setMinimumSize(new java.awt.Dimension(140, 40));
        toggleBtn_3tries.setPreferredSize(new java.awt.Dimension(140, 40));
        toggleBtn_3tries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_3triesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_glossaryList)
                    .addComponent(toggleBtn_3tries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_3tries)
                    .addComponent(label_difficulty)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toggleBtn_language1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(toggleBtn_language2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_responseLanguage)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toggleBtn_alternativesQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(toggleBtn_textQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_startQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cBox_language, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_glossaryList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBox_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(label_responseLanguage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toggleBtn_language1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleBtn_language2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(label_3tries)
                .addGap(4, 4, 4)
                .addComponent(toggleBtn_3tries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_difficulty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toggleBtn_alternativesQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleBtn_textQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_startQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

  
    private void toggleBtn_language1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_language1ActionPerformed
        listener.language1("");
        toggleBtn_language2.setSelected(false);
        toggleStateCheck();
    }//GEN-LAST:event_toggleBtn_language1ActionPerformed

    private void toggleBtn_language2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_language2ActionPerformed
        listener.language2((String) cBox_language.getSelectedItem());
        toggleBtn_language1.setSelected(false);
        toggleStateCheck();
    }//GEN-LAST:event_toggleBtn_language2ActionPerformed

    private void toggleBtn_textQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_textQuizActionPerformed
        listener.textQuizToggled();
        toggleBtn_alternativesQuiz.setSelected(false);
        toggleStateCheck();
    }//GEN-LAST:event_toggleBtn_textQuizActionPerformed

    private void toggleBtn_alternativesQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_alternativesQuizActionPerformed
        listener.alternativesQuizToggled();
        toggleBtn_textQuiz.setSelected(false);
        toggleStateCheck();
    }//GEN-LAST:event_toggleBtn_alternativesQuizActionPerformed

    private void btn_startQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startQuizActionPerformed
        listener.startQuizButton();
        
        if(toggleBtn_alternativesQuiz.isSelected()) {
            changePanel(mf.getQuizAlternativesPanel());
        } else if (toggleBtn_textQuiz.isSelected()){
            changePanel(mf.getQuizTextPanel());
        }
    }//GEN-LAST:event_btn_startQuizActionPerformed

    private void toggleBtn_3triesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_3triesActionPerformed
        listener.threeAttemptsBtnToggle();
    }//GEN-LAST:event_toggleBtn_3triesActionPerformed

    private void cBox_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBox_languageActionPerformed
        listener.languageMenu((String) cBox_language.getSelectedItem());
        toggleBtn_language2.setText((String) cBox_language.getSelectedItem());
    }//GEN-LAST:event_cBox_languageActionPerformed

    public void changePanel(javax.swing.JPanel panel) {
        mf.getCardLayoutPanel().removeAll();
        mf.getCardLayoutPanel().add(panel);
        mf.getCardLayoutPanel().repaint();
        mf.getCardLayoutPanel().revalidate();
    }
    
    public void toggleStateCheck(){
        boolean lang1 = toggleBtn_language1.isSelected();
        boolean lang2 = toggleBtn_language2.isSelected();
        boolean quiz1 = toggleBtn_alternativesQuiz.isSelected();
        boolean quiz2 = toggleBtn_textQuiz.isSelected();
        
        if (lang1 ^ lang2 && quiz1 ^ quiz2){
            btn_startQuiz.setEnabled(true);
        } else {
            btn_startQuiz.setEnabled(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_startQuiz;
    private javax.swing.JComboBox cBox_language;
    private javax.swing.JLabel label_3tries;
    private javax.swing.JLabel label_difficulty;
    private javax.swing.JLabel label_glossaryList;
    private javax.swing.JLabel label_responseLanguage;
    private javax.swing.JToggleButton toggleBtn_3tries;
    private javax.swing.JToggleButton toggleBtn_alternativesQuiz;
    private javax.swing.JToggleButton toggleBtn_language1;
    private javax.swing.JToggleButton toggleBtn_language2;
    private javax.swing.JToggleButton toggleBtn_textQuiz;
    // End of variables declaration//GEN-END:variables
}


