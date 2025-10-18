package Jframe;

import com.mycompany.schoo.Admin;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;




public class AdminDashboard2 extends javax.swing.JFrame {
    
 private Admin loggedinadmin ; 
  
    public AdminDashboard2(Admin admin) {
 this.loggedinadmin= admin ;
  this.setResizable(false) ;
    initComponents();   
    setSize(450, 400);      
    this.setLocationRelativeTo(null); 
    setVisible(true);      



        initComponents();
        

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addModuleWithTeacher = new javax.swing.JButton();
        createTeacherAccount = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addModuleWithTeacher.setBackground(new java.awt.Color(255, 255, 255));
        addModuleWithTeacher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addModuleWithTeacher.setForeground(new java.awt.Color(0, 0, 0));
        addModuleWithTeacher.setText("addModuleWithTeacher");
        addModuleWithTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addModuleWithTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(addModuleWithTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 50));

        createTeacherAccount.setBackground(new java.awt.Color(255, 255, 255));
        createTeacherAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createTeacherAccount.setForeground(new java.awt.Color(0, 0, 0));
        createTeacherAccount.setText("createTeacherAccount");
        createTeacherAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTeacherAccountActionPerformed(evt);
            }
        });
        getContentPane().add(createTeacherAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 48));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("createStudentAccount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 203, 170, 50));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Logout.setForeground(new java.awt.Color(153, 51, 0));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 30));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("addStudentToModule");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 182, 51));

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("removeModule");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 182, 47));

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("generateReports");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 182, 51));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("updateModuleDetails");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 182, 48));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 210, 360));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome "+ loggedinadmin.getName() + "!");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login_SignUp LoginFrame = new Login_SignUp();
        
        LoginFrame.setVisible(true);
        
        
         this.dispose();
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new createstudentaccount(loggedinadmin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new generatereports(loggedinadmin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String moduleName = javax.swing.JOptionPane.showInputDialog(this, "Enter Module Name to Remove:");

            if (moduleName == null) {
                javax.swing.JOptionPane.showMessageDialog(this, " Operation canceled by user.");
                return;
            }

            boolean bashar= loggedinadmin.removeModule(moduleName.trim());

            if(bashar)
            {

                javax.swing.JOptionPane.showMessageDialog(this, " Module removed successfully (if it existed).");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, " Module not found.");
            }
        } catch (HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, " Unexpected error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String moduleIDStr = javax.swing.JOptionPane.showInputDialog(this, "Enter Module ID to Update:");
            String newModuleName = javax.swing.JOptionPane.showInputDialog(this, "Enter New Module Name:");

            if (moduleIDStr == null || newModuleName == null) {
                javax.swing.JOptionPane.showMessageDialog(this, " Operation canceled by user.");
                return;
            }

            int moduleID = Integer.parseInt(moduleIDStr.trim());

            boolean malek =  loggedinadmin.updateModuleDetails(moduleID, newModuleName.trim());
            if (malek){
                javax.swing.JOptionPane.showMessageDialog(this, " Module details updated successfully.");
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(this, " Module not found.");
            }

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, " Please enter a valid number for Module ID.");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, " Unexpected error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String studentID = javax.swing.JOptionPane.showInputDialog(this, "Enter Student ID:");
            String moduleIDStr = javax.swing.JOptionPane.showInputDialog(this, "Enter Module ID:");

            if (studentID == null || moduleIDStr == null) {
                javax.swing.JOptionPane.showMessageDialog(this, " Operation canceled by user.");
                return;
            }

            int moduleID = Integer.parseInt(moduleIDStr.trim());

            boolean karim =  loggedinadmin.addStudentToModule(studentID.trim(), moduleID);
            if (karim){
                javax.swing.JOptionPane.showMessageDialog(this, " Student added to module successfully.");
            }
            else {   javax.swing.JOptionPane.showMessageDialog(this, " Student hasnt been added to module.");
            }
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, " Please enter a valid number for Module ID.");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, " Unexpected error: " + ex.getMessage());
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void createTeacherAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTeacherAccountActionPerformed

        new createteacheraccount(loggedinadmin).setVisible(true);
        this. setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_createTeacherAccountActionPerformed

    private void addModuleWithTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addModuleWithTeacherActionPerformed

        new AddModuleForm(loggedinadmin).setVisible(true);
        this.dispose();
        }

        
        private boolean isCancelled(String... inputs) {
            for (String input : inputs) {
                if (input == null) {
                    return true;
                }
            }
            return false;

    }//GEN-LAST:event_addModuleWithTeacherActionPerformed


    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
    
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton addModuleWithTeacher;
    private javax.swing.JButton createTeacherAccount;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
