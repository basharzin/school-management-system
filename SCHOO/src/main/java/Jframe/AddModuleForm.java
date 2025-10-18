package Jframe;


import Jframe.AdminDashboard2;
import com.mycompany.schoo.Admin;
import com.mycompany.schoo.Admin;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class AddModuleForm extends javax.swing.JFrame {
    private Admin admin;

    public AddModuleForm(Admin admin) {
         this.admin = admin;
            this.setLocationRelativeTo(null); 
        this.setResizable(false) ;
        initComponents();
    }


    AddModuleForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moduleNameField = new javax.swing.JTextField();
        capacityField = new javax.swing.JTextField();
        teacherIDField = new javax.swing.JTextField();
        timeSlotField = new javax.swing.JTextField();
        moduleIDField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        modulename = new javax.swing.JLabel();
        moduleid = new javax.swing.JLabel();
        teacherid = new javax.swing.JLabel();
        timeslot = new javax.swing.JLabel();
        capacity = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddModulewithTeacher");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        moduleNameField.setBackground(new java.awt.Color(255, 255, 255));
        moduleNameField.setForeground(new java.awt.Color(0, 0, 0));

        capacityField.setBackground(new java.awt.Color(255, 255, 255));
        capacityField.setForeground(new java.awt.Color(0, 0, 0));
        capacityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacityFieldActionPerformed(evt);
            }
        });

        teacherIDField.setBackground(new java.awt.Color(255, 255, 255));
        teacherIDField.setForeground(new java.awt.Color(0, 0, 0));
        teacherIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherIDFieldActionPerformed(evt);
            }
        });

        timeSlotField.setBackground(new java.awt.Color(255, 255, 255));
        timeSlotField.setForeground(new java.awt.Color(0, 0, 0));

        moduleIDField.setBackground(new java.awt.Color(255, 255, 255));
        moduleIDField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Module");

        modulename.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modulename.setForeground(new java.awt.Color(255, 255, 255));
        modulename.setText("Module Name:");

        moduleid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        moduleid.setForeground(new java.awt.Color(255, 255, 255));
        moduleid.setText("Module ID:");

        teacherid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        teacherid.setForeground(new java.awt.Color(255, 255, 255));
        teacherid.setText("Teacher ID:");

        timeslot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timeslot.setForeground(new java.awt.Color(255, 255, 255));
        timeslot.setText("Time Slot:");

        capacity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        capacity.setForeground(new java.awt.Color(255, 255, 255));
        capacity.setText("Capacity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(moduleid)
                            .addComponent(teacherid)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(modulename))
                    .addComponent(timeslot, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(capacity, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teacherIDField)
                    .addComponent(moduleIDField)
                    .addComponent(timeSlotField)
                    .addComponent(moduleNameField)
                    .addComponent(capacityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moduleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modulename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moduleIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moduleid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherid))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeslot))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacity))
                .addGap(145, 145, 145))
        );

        Submit.setBackground(new java.awt.Color(0, 0, 0));
        Submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 0, 0));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(204, 0, 0));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
             try {
            int moduleID = Integer.parseInt(moduleIDField.getText().trim());
            String moduleName = moduleNameField.getText().trim();
            int capacity = Integer.parseInt(capacityField.getText().trim());
            String teacherID = teacherIDField.getText().trim();
            String timeSlot = timeSlotField.getText().trim();

            if (moduleName.isEmpty() || teacherID.isEmpty() || timeSlot.isEmpty()) {
                JOptionPane.showMessageDialog(this, " Please fill all fields.");
                return;
            }

            boolean success = admin.addModuleWithTeacher(moduleID, moduleName, capacity, teacherID, timeSlot);

            if (success) {
                JOptionPane.showMessageDialog(this, " Module added successfully!");
               new AdminDashboard2(admin).setVisible(true);
                    this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "️ Failed to add module. Check if teacher ID exists.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, " Module ID and Capacity must be numbers.");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, " Unexpected error: " + ex.getMessage());
        }
    
    }//GEN-LAST:event_SubmitActionPerformed

    private void teacherIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherIDFieldActionPerformed
      
    }//GEN-LAST:event_teacherIDFieldActionPerformed

    private void capacityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacityFieldActionPerformed
        
    }//GEN-LAST:event_capacityFieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         new AdminDashboard2(admin).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_BackActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AddModuleForm AddModuleForm = new AddModuleForm();
                       AddModuleForm.setVisible(true);
                AddModuleForm.setLocationRelativeTo(null); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel capacity;
    private javax.swing.JTextField capacityField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField moduleIDField;
    private javax.swing.JTextField moduleNameField;
    private javax.swing.JLabel moduleid;
    private javax.swing.JLabel modulename;
    private javax.swing.JTextField teacherIDField;
    private javax.swing.JLabel teacherid;
    private javax.swing.JTextField timeSlotField;
    private javax.swing.JLabel timeslot;
    // End of variables declaration//GEN-END:variables
}
