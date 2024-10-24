/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package ui.main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import ui.table.TableCustom;

/**
 *
 * @author LENOVO
 */
public class CustomerSearch extends javax.swing.JPanel {
    
    public CustomerSearch() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCenter = new javax.swing.JPanel();
        scrollPane_tableCustomer = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        lbTitlePane = new javax.swing.JLabel();
        lbTitleTable = new javax.swing.JLabel();
        lbCustPhone = new javax.swing.JLabel();
        lbCustName = new javax.swing.JLabel();
        btnSearch = new ui.button.Button();
        txtPhoneSearch = new ui.textfield.TextField();
        txtCustNameSearch = new ui.textfield.TextField();

        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        pCenter.setBackground(new java.awt.Color(242, 249, 255));
        pCenter.setPreferredSize(new java.awt.Dimension(1600, 1000));

        scrollPane_tableCustomer.setBackground(new java.awt.Color(221, 221, 221));
        scrollPane_tableCustomer.setBorder(null);

        tableCustomer.setBackground(new java.awt.Color(221, 221, 221));
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
        lbTitlePane.setText("TÌM KIẾM KHÁCH HÀNG");

        lbTitleTable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitleTable.setForeground(new java.awt.Color(102, 204, 255));
        lbTitleTable.setText("DANH SÁCH KHÁCH HÀNG");

        lbCustPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustPhone.setText("Tìm theo số điện thoại khách hàng");

        lbCustName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustName.setText("Tìm theo tên khách hàng");

        btnSearch.setBackground(new java.awt.Color(51, 204, 255));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm kiếm");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(lbTitlePane)
                        .addGap(597, 597, 597))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(lbTitleTable)
                        .addGap(640, 640, 640))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pCenterLayout.createSequentialGroup()
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCustPhone)
                                    .addComponent(txtPhoneSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(122, 122, 122)
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCenterLayout.createSequentialGroup()
                                        .addComponent(lbCustName)
                                        .addGap(0, 602, Short.MAX_VALUE))
                                    .addGroup(pCenterLayout.createSequentialGroup()
                                        .addComponent(txtCustNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(scrollPane_tableCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 1458, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCustPhone)
                            .addComponent(lbCustName)))
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCustNameSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(txtPhoneSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(lbTitleTable)
                .addGap(18, 18, 18)
                .addComponent(scrollPane_tableCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        add(pCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnSearch;
    private javax.swing.JLabel lbCustName;
    private javax.swing.JLabel lbCustPhone;
    private javax.swing.JLabel lbTitlePane;
    private javax.swing.JLabel lbTitleTable;
    private javax.swing.JPanel pCenter;
    private javax.swing.JScrollPane scrollPane_tableCustomer;
    private javax.swing.JTable tableCustomer;
    private ui.textfield.TextField txtCustNameSearch;
    private ui.textfield.TextField txtPhoneSearch;
    // End of variables declaration//GEN-END:variables
}
