/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client2;
/**
 * The panel for all the help information.
 * @author pierrezarebski
 */
public class HelpView extends javax.swing.JPanel {
    /**
     * Creates new form SettingsView
     */
    public HelpView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(500, 440));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 440));

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jEditorPane1.setText("<html>\r\n  <head>\r\n\r  <style>\n    body {font-family:\"Segoe UI\";}\n    h1 {margin:0; font-size: 18pt}\n    h2 {margin:0; font-size: 16pt}\n    h3 {margin:0; font-size: 14pt}\n    p {margin-top:0; margin-bottom:10px}\n    ul{margin-left: 10px; padding-left: 5px;}\n  </style>\n  </head>\r\n  <body>\r\n    <h1>Hur används Word Pear?</h1>\n    <h2>1. Skapa en ny/utöka en existerande gloslista</h2>\n      <p>Under knappen \"Ny Gloslista\" i menyn kan du både lägga till en ny samt utöka en tidigare gloslista</p>\n\n      <h3>1.1 Ny gloslista</h3>\n       <ul>\n         <li>Ange ett namn för gloslistan i textfältet högst upp i fönstret</li>\n         <li>Tryck därefter 'Lägg till' vid sidan av textfältet</li>\n       </ul>\n\n      <h3>1.2 Lägg till ord</h3>\n       <ul>\n         <li>VIKTIGT! Gloslistan måste innehålla 10 ord!</li>\n         <li>Välj din gloslista i den högra flervalsmenyn</li>\n         <li>Skriv in det svenska ordet i det lilla textfältet till vänster</li>\n         <li>Skriv in motsvarande ord i det andra språket i det högra textfältet</li>\n         <li>Tryck på knappen 'Lägg till'</li>\n         <li>Orden visas nu i en lista nedanför</li>\n       </ul>\n\n    <h2>2. Starta ett WP Quiz</h2>\n     <p>Under knappen 'Quiz' kan du starta ett WP Quiz där du kan öva på dina glosor.</p>\n       <ul>\n         <li>Välj den gloslista du vill öva på</li>\n         <li>Välj om du vill svara på svenska eller gloslistans andra språk</li>\n         <li>Ifall du vill ha 3 försök på varje glosa så klickar du på knappen \"Ja\"</li>\n         <li>Slutligen väljer du ifall du svara med 3 svartsalternativ, eller skriva in svaret på egen hand</li>\n       </ul>\n\n    <h3>2.1 Spela WP Quiz - 3 alternativ</h3>\n       <ul>\n         <li>Fältet högst upp visar hur mycket tid du har kvar innan nästa glosa</li>\n         <li>Det stora ordet representerar det ordet du ska öva på, det byter även färg ifall du svarar rätt/fel</li>\n         <li>Det lilla fältet visar ditt framsteg i övningen</li>\n         <li>De 3 knapparna representerar de olika svarsalternativ du har att välja på</li>\n         <li>När du har svarat så låser sig knapparna och du kan inte ändra ditt svar</li>\n       </ul>\n\n    <h3>2.2 Spela WP Quiz - Fritext</h3>\n       <ul>\n         <li>Fältet högst upp visar hur mycket tid du har kvar innan nästa glosa</li>\n         <li>Det stora ordet representerar det ordet du ska öva på, det byter även färg ifall du svarar rätt/fel</li>\n         <li>Det lilla fältet visar ditt framsteg i övningen</li>\n         <li>Textfältet är där du skriver in ditt svar</li>\n         <li>När du har svarat så trycker du på knappen 'Ok' eller 'Enter' på tangentbordet</li>\n         <li>Textfältet låser sig och du kan trycka på knappen 'Nästa' eller 'Enter' igen för att komma till nästa ord</li>\n       </ul>\n\n    <h2>3. Kolla statistik</h2>\n      <p>Under knappen 'Statistik' kan du se dina och andras resultat</p>\n       <ul>\n         <li>Välj ett användarnamn i flervalsmenyn högst upp</li>\n         <li>Tryck på knappen 'Hämta'</li>\n         <li>Resultaten visas i listan</li>\n       </ul>\n  </body>\r\n</html>\r\n");
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
