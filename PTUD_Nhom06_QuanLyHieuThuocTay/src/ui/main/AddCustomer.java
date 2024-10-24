package ui.main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import ui.table.TableCustom;

public class AddCustomer extends javax.swing.JPanel{
    
    public AddCustomer() {
        initComponents();
        
        setupTable();
        testData(tableCustomer);
        TableCustom.apply(scrollPane_tableCustomer, TableCustom.TableType.MULTI_LINE);
    }
    
    private void setupTable() {
        JTableHeader theader = tableCustomer.getTableHeader();
         theader.setFont(new java.awt.Font("Segoe UI", 0, 18));   
         tableCustomer.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
          if (tableCustomer.getColumnModel().getColumnCount() > 0) {
            tableCustomer.getColumnModel().getColumn(0).setPreferredWidth(250);
            tableCustomer.getColumnModel().getColumn(1).setPreferredWidth(130);
            tableCustomer.getColumnModel().getColumn(2).setPreferredWidth(90);
            tableCustomer.getColumnModel().getColumn(3).setPreferredWidth(170);
            tableCustomer.getColumnModel().getColumn(4).setPreferredWidth(320);
            tableCustomer.getColumnModel().getColumn(5).setPreferredWidth(80);
            tableCustomer.getColumnModel().getColumn(6).setPreferredWidth(400);
        }
    }

    private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{ "Nguyễn Văn A", "0000000000", "Nam", "20-10-2024", "hqn1907@gmail.com", "10", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn B", "0111111111", "Nam","20-10-2024", "firstname.lastname@yourbusinessname.com","30", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn C", "0222222222", "Nữ","20-10-2024", "lastname@yourbusinessname.com", "41", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn D", "0333333333", "Nữ","20-10-2024", "hqn1907@gmail.com","60", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn E", "0444444444", "Nam","20-10-2024", "job@yourbusinessname.com","40", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn F", "0555555555", "Nữ","20-10-2024", "lastname@yourbusinessname.com","70", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn G", "0666666666", "Nam","20-10-2024", "firstname.lastname@yourbusinessname.com","15", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn H", "0777777777", "Nữ","20-10-2024", "hqn1907@gmail.com","56", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn I", "0888888888", "Nam","20-10-2024", "job@yourbusinessname.com","78", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn J", "0999999999", "Nữ","20-10-2024", "job@yourbusinessname.com","16", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn K", "0123456789", "Nữ","20-10-2024", "firstname.lastname@yourbusinessname.com","90", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn L", "0112345678", "Nam","20-10-2024", "hqn1907@gmail.com","28", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn M", "0111234567", "Nữ","20-10-2024", "job@yourbusinessname.com","85", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn N", "0111123456", "Nam","20-10-2024", "firstname.lastname@yourbusinessname.com","67", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn O", "0122345678", "Nữ","20-10-2024", "job@yourbusinessname.com","19", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn P", "0122234567", "Nam","20-10-2024", "hqn1907@gmail.com","7", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn Q", "0122223456", "Nữ","20-10-2024", "lastname@yourbusinessname.com","28", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn R", "0123345678", "Nữ","20-10-2024", "job@yourbusinessname.com","24", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn S", "0123334567", "Nam","20-10-2024", "firstname.lastname@yourbusinessname.com","14", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn T", "0111123456", "Nữ","20-10-2024", "job@yourbusinessname.com","67", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn U", "0122345678", "Nữ","20-10-2024", "hqn1907@gmail.com","19", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn Y", "0122234567", "Nam","20-10-2024", "lastname@yourbusinessname.com","7", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn W", "0122223456", "Nam","20-10-2024", "firstname.lastname@yourbusinessname.com","28", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
        model.addRow(new Object[]{ "Nguyễn Văn X", "0123345678", "Nữ","20-10-2024", "lastname@yourbusinessname.com","24", "12, Nguyễn Văn Bảo, P.4, Q.GV, HCM"});
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        pCenter = new javax.swing.JPanel();
        scrollPane_tableCustomer = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        lbTitlePane = new javax.swing.JLabel();
        lbTitleTable = new javax.swing.JLabel();
        lbCustName = new javax.swing.JLabel();
        lbPhoneNumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbBirthDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        radioButtonCustom1 = new ui.radio_button.RadioButtonCustom();
        radioButtonCustom2 = new ui.radio_button.RadioButtonCustom();
        btnAdd = new ui.button.Button();
        btnUpdate = new ui.button.Button();
        btnRefresh = new ui.button.Button();
        txtCustName = new ui.textfield.TextField();
        txtPhoneNumber = new ui.textfield.TextField();
        textField4 = new ui.textfield.TextField();
        txtAddress = new ui.textfield.TextField();
        txtBirthDate = new ui.textfield.TextField();

        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        pCenter.setBackground(new java.awt.Color(242, 249, 255));
        pCenter.setPreferredSize(new java.awt.Dimension(1600, 1000));

        scrollPane_tableCustomer.setBackground(new java.awt.Color(221, 221, 221));
        scrollPane_tableCustomer.setBorder(null);

        tableCustomer.setBackground(new java.awt.Color(242, 249, 255));
        tableCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên khách hàng", "Số điện thoại", "Giới tính", "Ngày sinh", "Email", "ĐTL", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustomer.setGridColor(new java.awt.Color(218, 247, 249));
        scrollPane_tableCustomer.setViewportView(tableCustomer);

        lbTitlePane.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitlePane.setForeground(new java.awt.Color(102, 204, 255));
        lbTitlePane.setText("THÔNG TIN KHÁCH HÀNG");

        lbTitleTable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitleTable.setForeground(new java.awt.Color(102, 204, 255));
        lbTitleTable.setText("DANH SÁCH kHÁCH HÀNG");

        lbCustName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustName.setText("Tên khách hàng");

        lbPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPhoneNumber.setText("Số điện thoại ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Giới tính :");

        lbBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBirthDate.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Địa chỉ mail :");

        lbAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAddress.setText("Địa chi thường trú");

        radioButtonCustom1.setBackground(new java.awt.Color(102, 204, 255));
        buttonGroup.add(radioButtonCustom1);
        radioButtonCustom1.setText("Nam");
        radioButtonCustom1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioButtonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCustom1ActionPerformed(evt);
            }
        });

        radioButtonCustom2.setBackground(new java.awt.Color(102, 204, 255));
        buttonGroup.add(radioButtonCustom2);
        radioButtonCustom2.setText("Nữ");
        radioButtonCustom2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(5, 146, 57));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(5, 146, 57));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Cập nhật");
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setPreferredSize(new java.awt.Dimension(72, 50));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(5, 146, 57));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Làm mới");
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtCustName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNameActionPerformed(evt);
            }
        });

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        textField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane_tableCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 1458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCustName)
                            .addComponent(lbPhoneNumber)
                            .addComponent(lbBirthDate)
                            .addComponent(lbAddress))
                        .addGap(33, 33, 33)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                            .addGroup(pCenterLayout.createSequentialGroup()
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCenterLayout.createSequentialGroup()
                                        .addComponent(radioButtonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButtonCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(63, 63, 63)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(lbTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(535, 535, 535))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(lbTitleTable)
                        .addGap(632, 632, 632))))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCustName)
                            .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPhoneNumber)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(radioButtonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBirthDate)
                            .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lbTitleTable)
                .addGap(39, 39, 39)
                .addComponent(scrollPane_tableCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        add(pCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCustom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCustom1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnAdd;
    private ui.button.Button btnRefresh;
    private ui.button.Button btnUpdate;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbBirthDate;
    private javax.swing.JLabel lbCustName;
    private javax.swing.JLabel lbPhoneNumber;
    private javax.swing.JLabel lbTitlePane;
    private javax.swing.JLabel lbTitleTable;
    private javax.swing.JPanel pCenter;
    private ui.radio_button.RadioButtonCustom radioButtonCustom1;
    private ui.radio_button.RadioButtonCustom radioButtonCustom2;
    private javax.swing.JScrollPane scrollPane_tableCustomer;
    private javax.swing.JTable tableCustomer;
    private ui.textfield.TextField textField4;
    private ui.textfield.TextField txtAddress;
    private ui.textfield.TextField txtBirthDate;
    private ui.textfield.TextField txtCustName;
    private ui.textfield.TextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
