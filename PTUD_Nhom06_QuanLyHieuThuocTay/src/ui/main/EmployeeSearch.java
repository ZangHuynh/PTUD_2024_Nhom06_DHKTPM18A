package ui.main;

import javax.swing.table.JTableHeader;
import ui.table.TableCustom;

public class EmployeeSearch extends javax.swing.JPanel {

    public EmployeeSearch() {
        initComponents();
        
        JTableHeader theader = tableVendor.getTableHeader();
        theader.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        
        TableCustom.apply(scrollPane_tableVendor, TableCustom.TableType.MULTI_LINE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCenter = new javax.swing.JPanel();
        scrollPane_tableVendor = new javax.swing.JScrollPane();
        tableVendor = new javax.swing.JTable();
        lbTitlePane = new javax.swing.JLabel();
        lbTitleTable = new javax.swing.JLabel();
        lbEmplID = new javax.swing.JLabel();
        lbEmplName = new javax.swing.JLabel();
        txtEmplID = new ui.textfield.TextField();
        txtEmplName = new ui.textfield.TextField();
        txtEmplPhone = new ui.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxSuggestion1 = new ui.combo_suggestion.ComboBoxSuggestion();

        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        pCenter.setBackground(new java.awt.Color(242, 249, 255));
        pCenter.setPreferredSize(new java.awt.Dimension(1600, 1000));

        scrollPane_tableVendor.setBackground(new java.awt.Color(221, 221, 221));
        scrollPane_tableVendor.setBorder(null);

        tableVendor.setBackground(new java.awt.Color(242, 249, 255));
        tableVendor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableVendor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới tính", "Số điện thoại", "Ngày sinh", "Mã tài khoản"
            }
        ));
        tableVendor.setGridColor(new java.awt.Color(218, 247, 249));
        scrollPane_tableVendor.setViewportView(tableVendor);

        lbTitlePane.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitlePane.setForeground(new java.awt.Color(102, 204, 255));
        lbTitlePane.setText("THÔNG TIN NHÂN VIÊN");

        lbTitleTable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitleTable.setForeground(new java.awt.Color(102, 204, 255));
        lbTitleTable.setText("DANH SÁCH NHÂN VIÊN");

        lbEmplID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEmplID.setText("Tìm theo mã");

        lbEmplName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEmplName.setText("Tìm theo tên");

        txtEmplID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmplID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmplIDActionPerformed(evt);
            }
        });

        txtEmplPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmplPhoneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tìm theo số điện thoại");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tìm theo giới tính");

        comboBoxSuggestion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        comboBoxSuggestion1.setSelectedIndex(-1);
        comboBoxSuggestion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane_tableVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 1458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmplID)
                            .addComponent(lbEmplName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmplID, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmplName, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmplPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                        .addGap(117, 117, 117)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(lbTitleTable)
                        .addGap(643, 643, 643))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(lbTitlePane)
                        .addGap(590, 590, 590))))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmplID)
                    .addComponent(txtEmplID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmplPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmplName)
                    .addComponent(txtEmplName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxSuggestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(lbTitleTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane_tableVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        add(pCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmplIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmplIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmplIDActionPerformed

    private void txtEmplPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmplPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmplPhoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbEmplID;
    private javax.swing.JLabel lbEmplName;
    private javax.swing.JLabel lbTitlePane;
    private javax.swing.JLabel lbTitleTable;
    private javax.swing.JPanel pCenter;
    private javax.swing.JScrollPane scrollPane_tableVendor;
    private javax.swing.JTable tableVendor;
    private ui.textfield.TextField txtEmplID;
    private ui.textfield.TextField txtEmplName;
    private ui.textfield.TextField txtEmplPhone;
    // End of variables declaration//GEN-END:variables

}
