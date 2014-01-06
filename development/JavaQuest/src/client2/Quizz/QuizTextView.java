/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client2.Quizz;

import java.awt.Color;
/**
 *
 * @author pierrezarebski
 */
public class QuizTextView extends javax.swing.JPanel implements QuizTextViewSetter {
    
    private QuizTextListener listener;
    /**
     * Creates new form QuizTextView
     */
    public QuizTextView() {
        initComponents();
    }
    
    public QuizTextView(QuizTextListener listener) {
        initComponents();
        this.listener = listener;
    }
    
    public void setStatsDialog(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }
    
    public void setIsCorrect(int numberOfCorrectAnswers){
        progressBar.setValue(progressBar.getValue() + 10);
        label_activeWord.setForeground(new java.awt.Color(0, 200, 0));       
    }
    
    public void setIsInCorrect(){
        label_activeWord.setForeground(Color.RED);    
    }
    
    public void setQuizTextViewListener(QuizTextListener listener){
        this.listener = listener;
    }
    
    public void setWord(String word){
        label_activeWord.setText(word);
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

        jLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        btn_nextWord = new javax.swing.JButton();
        label_activeWord = new javax.swing.JLabel();
        txtfield_word = new javax.swing.JTextField();
        btn_confirm = new javax.swing.JButton();
        progressBar1 = new javax.swing.JProgressBar();

        jLabel1.setText("Time");

        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        progressBar.setMinimumSize(new java.awt.Dimension(300, 20));
        progressBar.setPreferredSize(new java.awt.Dimension(300, 20));

        btn_nextWord.setText("Nästa");
        btn_nextWord.setEnabled(false);
        btn_nextWord.setMaximumSize(new java.awt.Dimension(100, 29));
        btn_nextWord.setMinimumSize(new java.awt.Dimension(100, 29));
        btn_nextWord.setPreferredSize(new java.awt.Dimension(100, 29));
        btn_nextWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextWordActionPerformed(evt);
            }
        });

        label_activeWord.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        label_activeWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_activeWord.setText("GLOSORD");

        txtfield_word.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfield_word.setMinimumSize(new java.awt.Dimension(200, 28));
        txtfield_word.setPreferredSize(new java.awt.Dimension(200, 28));
        txtfield_word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_wordActionPerformed(evt);
            }
        });
        txtfield_word.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfield_wordKeyPressed(evt);
            }
        });

        btn_confirm.setText("Ok");
        btn_confirm.setMaximumSize(new java.awt.Dimension(100, 29));
        btn_confirm.setMinimumSize(new java.awt.Dimension(100, 29));
        btn_confirm.setPreferredSize(new java.awt.Dimension(100, 29));
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        progressBar1.setMaximum(200);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nextWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtfield_word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_activeWord)
                .addGap(30, 30, 30)
                .addComponent(txtfield_word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_nextWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(progressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfield_wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_wordActionPerformed
      
    }//GEN-LAST:event_txtfield_wordActionPerformed

    private void btn_nextWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextWordActionPerformed
        listener.nextWord();
        
        progressBar1.setValue(190);
        btn_nextWord.setEnabled(false);
        txtfield_word.setText("");
        txtfield_word.setEnabled(true);
        label_activeWord.setForeground(Color.BLACK); 
    }//GEN-LAST:event_btn_nextWordActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        listener.okButton(txtfield_word.getText());
        
        txtfield_word.setEnabled(false);
        btn_nextWord.setEnabled(true);
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void txtfield_wordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_wordKeyPressed
        if(evt.getKeyCode() == 10 || evt.getKeyCode() == 13){
            listener.okButton(txtfield_word.getText());
            txtfield_word.setEnabled(false);
            btn_nextWord.setEnabled(true);
        }
    }//GEN-LAST:event_txtfield_wordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_nextWord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_activeWord;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JProgressBar progressBar1;
    private javax.swing.JTextField txtfield_word;
    // End of variables declaration//GEN-END:variables
}
