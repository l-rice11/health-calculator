
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**************************************************** 
Program Name: CIS355A Week 2
Programmer's Name: Landon Rice
Program Description: Create a Health Profile UI
***********************************************************/

public class HealthProfileGUI extends javax.swing.JFrame {

    /**
     * Creates new form HealthProfileGUI
     */
    public HealthProfileGUI() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblHeightFt = new javax.swing.JLabel();
        txtHeightIn = new javax.swing.JTextField();
        btnDisplay = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblBMI = new javax.swing.JLabel();
        txtBMI = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtMHR = new javax.swing.JTextField();
        lblMHR = new javax.swing.JLabel();
        lblHeightIn = new javax.swing.JLabel();
        txtHeightFt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Profile App");

        lblName.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 204));
        lblName.setText("Name:");

        txtName.setToolTipText("Enter Name...");

        lblAge.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(204, 204, 204));
        lblAge.setText("Age:");

        lblWeight.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(204, 204, 204));
        lblWeight.setText("Weight:");

        lblHeightFt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblHeightFt.setForeground(new java.awt.Color(204, 204, 204));
        lblHeightFt.setText("Height-Feet:");

        btnDisplay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblBMI.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblBMI.setForeground(new java.awt.Color(204, 204, 204));
        lblBMI.setText("BMI");

        txtBMI.setEditable(false);

        lblCategory.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(204, 204, 204));
        lblCategory.setText("Category");

        txtCategory.setEditable(false);

        txtMHR.setEditable(false);

        lblMHR.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblMHR.setForeground(new java.awt.Color(204, 204, 204));
        lblMHR.setText("Max Heart Rate");

        lblHeightIn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblHeightIn.setForeground(new java.awt.Color(204, 204, 204));
        lblHeightIn.setText("Height-Inches:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHeightIn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHeightFt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMHR, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMHR, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHeightFt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeightIn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeightFt)
                    .addComponent(txtHeightIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeightIn)
                    .addComponent(txtHeightFt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBMI)
                    .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMHR)
                    .addComponent(txtMHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        //verify txtfields
        if(txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Name is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocus();
            return;
        }
        if(txtAge.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Age is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtAge.requestFocus();
            return;
        }
        if(txtWeight.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Weight is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtWeight.requestFocus();
            return;
        }
        if(txtHeightIn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Height is required.", "Error", JOptionPane.ERROR_MESSAGE);
            txtHeightIn.requestFocus();
            return;
        }
        
        //gather data from fields
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        int feet = Integer.parseInt(txtHeightIn.getText());
        double inches = Double.parseDouble(txtHeightFt.getText());
        
        //create HealthProfile Object
        HealthProfile profile = new HealthProfile(name, age, weight, feet, inches);
        
        //display output
        double bmi = profile.getBMI();
        DecimalFormat fmt = new DecimalFormat("0.0");
        txtBMI.setText(fmt.format(bmi));
        txtCategory.setText(profile.getCategory());
        txtMHR.setText("" + profile.getMaxHR());
        
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //clear all fields
        txtName.setText("");
        txtAge.setText("");
        txtWeight.setText("");
        txtHeightFt.setText("");
        txtHeightIn.setText("");
        txtBMI.setText("");
        txtCategory.setText("");
        txtMHR.setText("");

        
        txtName.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblHeightFt;
    private javax.swing.JLabel lblHeightIn;
    private javax.swing.JLabel lblMHR;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtHeightFt;
    private javax.swing.JTextField txtHeightIn;
    private javax.swing.JTextField txtMHR;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
