/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client2.Quizz;

import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author pierrezarebski
 */
public class QuizAlternativesView extends javax.swing.JPanel implements QuizAlternativesViewSetter {

    private QuizAlternativesListener listener;
    /**
     * Creates new form QuizAlternativesView
     */
    public QuizAlternativesView() {
        initComponents();
    }
    
     public void setStatsDialog(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }
    
    public void setQuizAlternativesViewListener(QuizAlternativesListener listener){
           this.listener = listener;
    }
    
    public void setIsCorrect(int numberOfCorrectAnswers){
        
        progressBar.setValue(progressBar.getValue() + 10);
        
        label_activeWord.setForeground(new java.awt.Color(0, 200, 0)); 
    }
    
    public void setIsInCorrect(){
        label_activeWord.setForeground(Color.RED);    
    }
    
    public void setWord(String word){
         label_activeWord.setText(word);
    }
    
    public void setAlt1(String word){
        toggleBtn_wordOne.setText(word);
    }
    
    public void setAlt2(String word){
        toggleBtn_wordTwo.setText(word);
    }
    
    public void setAlt3(String word){
        toggleBtn_wordThree.setText(word);
    }
    
    public void setTime(String time){
        jLabel1.setText(time);
        progressBar1.setValue(progressBar1.getValue() - 1);
        if(time.equals("0")){
            progressBar1.setValue(190);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog4 = new javax.swing.JDialog();
        progressBar = new javax.swing.JProgressBar();
        label_activeWord = new javax.swing.JLabel();
        toggleBtn_wordOne = new javax.swing.JToggleButton();
        toggleBtn_wordTwo = new javax.swing.JToggleButton();
        toggleBtn_wordThree = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btn_nextWord = new javax.swing.JButton();
        progressBar1 = new javax.swing.JProgressBar();

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        progressBar.setMinimumSize(new java.awt.Dimension(300, 20));
        progressBar.setPreferredSize(new java.awt.Dimension(300, 20));

        label_activeWord.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        label_activeWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_activeWord.setText("GLOSORD");

        toggleBtn_wordOne.setText("Ord1");
        toggleBtn_wordOne.setMaximumSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordOne.setMinimumSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordOne.setPreferredSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_wordOneActionPerformed(evt);
            }
        });

        toggleBtn_wordTwo.setText("Ord2");
        toggleBtn_wordTwo.setMaximumSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordTwo.setMinimumSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordTwo.setPreferredSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_wordTwoActionPerformed(evt);
            }
        });

        toggleBtn_wordThree.setText("Ord3");
        toggleBtn_wordThree.setMaximumSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordThree.setMinimumSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordThree.setPreferredSize(new java.awt.Dimension(100, 23));
        toggleBtn_wordThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtn_wordThreeActionPerformed(evt);
            }
        });

        jLabel1.setText("Time");

        btn_nextWord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_nextWord.setText("Nästa ");
        btn_nextWord.setEnabled(false);
        btn_nextWord.setMaximumSize(new java.awt.Dimension(100, 34));
        btn_nextWord.setMinimumSize(new java.awt.Dimension(100, 34));
        btn_nextWord.setPreferredSize(new java.awt.Dimension(100, 34));
        btn_nextWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextWordActionPerformed(evt);
            }
        });

        progressBar1.setMaximum(200);
        progressBar1.setToolTipText("");
        progressBar1.setValue(200);
        progressBar1.setMinimumSize(new java.awt.Dimension(300, 20));
        progressBar1.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_activeWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toggleBtn_wordOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_nextWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toggleBtn_wordTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(toggleBtn_wordThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addComponent(progressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(label_activeWord)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toggleBtn_wordOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleBtn_wordTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleBtn_wordThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_nextWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextWordActionPerformed
        listener.nextWord();

        progressBar1.setValue(190);
        btn_nextWord.setEnabled(false);
        toggleBtn_wordOne.setSelected(false);
        toggleBtn_wordOne.setEnabled(true);  
        toggleBtn_wordTwo.setSelected(false);
        toggleBtn_wordTwo.setEnabled(true);  
        toggleBtn_wordThree.setSelected(false);
        toggleBtn_wordThree.setEnabled(true);
        
        label_activeWord.setForeground(Color.BLACK);    
    }//GEN-LAST:event_btn_nextWordActionPerformed

    private void toggleBtn_wordOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_wordOneActionPerformed
        listener.wordOneBtnPressed(toggleBtn_wordOne.getText());
        
        lockWordBtns();
        btn_nextWord.setEnabled(true);
        toggleBtn_wordTwo.setSelected(false);
        toggleBtn_wordThree.setSelected(false);
    }//GEN-LAST:event_toggleBtn_wordOneActionPerformed

    private void toggleBtn_wordTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_wordTwoActionPerformed
        listener.wordTwoBtnPressed(toggleBtn_wordTwo.getText());
        
        lockWordBtns();
        btn_nextWord.setEnabled(true);
        toggleBtn_wordOne.setSelected(false);
        toggleBtn_wordThree.setSelected(false);
    }//GEN-LAST:event_toggleBtn_wordTwoActionPerformed

    private void toggleBtn_wordThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtn_wordThreeActionPerformed
        listener.wordThreeBtnPressed(toggleBtn_wordThree.getText());

        lockWordBtns();
        btn_nextWord.setEnabled(true);
        toggleBtn_wordOne.setSelected(false);
        toggleBtn_wordTwo.setSelected(false);
    }//GEN-LAST:event_toggleBtn_wordThreeActionPerformed

    private void lockWordBtns(){
        toggleBtn_wordOne.setEnabled(false);
        toggleBtn_wordTwo.setEnabled(false);
        toggleBtn_wordThree.setEnabled(false);
    }
    private javax.swing.JOptionPane statsDialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nextWord;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_activeWord;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JProgressBar progressBar1;
    private javax.swing.JToggleButton toggleBtn_wordOne;
    private javax.swing.JToggleButton toggleBtn_wordThree;
    private javax.swing.JToggleButton toggleBtn_wordTwo;
    // End of variables declaration//GEN-END:variables
}
