package ui.main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import ui.table.TableCustom;

public class Category extends javax.swing.JPanel{
    
    public Category() {
        initComponents();
        
        JTableHeader theader = tableProduct.getTableHeader();
        theader.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
         
        TableCustom.apply(jScrollPane_tableProduct, TableCustom.TableType.MULTI_LINE);
    }
    
    private void setupTable() {
        JTableHeader theader = tableProduct.getTableHeader();
        theader.setFont(new java.awt.Font("Segoe UI", 0, 18));   
        tableProduct.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
          if (tableProduct.getColumnModel().getColumnCount() > 0) {
            tableProduct.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableProduct.getColumnModel().getColumn(1).setPreferredWidth(400);
            tableProduct.getColumnModel().getColumn(2).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(3).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(4).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(5).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(6).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(7).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(8).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(9).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(10).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(11).setPreferredWidth(300);
            tableProduct.getColumnModel().getColumn(12).setPreferredWidth(300);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new ui.datechooser.DateChooser();
        tableCustom = new ui.table.TableCustom();
        pCenter = new javax.swing.JPanel();
        txtSearch = new ui.textfield.TextField();
        btnCalendar = new ui.button.Button();
        btnAdd = new ui.button.Button();
        cbbCategory = new ui.combobox.Combobox();
        cbbVendor = new ui.combobox.Combobox();
        cbbMethod = new ui.combobox.Combobox();
        tableScrollButton_Product = new ui.table.TableScrollButton();
        jScrollPane_tableProduct = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        btnScanBarCode = new ui.button.Button();
        cbbAdministration = new ui.combobox.Combobox();

        date.setForeground(new java.awt.Color(102, 204, 255));
        date.setTextRefernce(txtSearch);

        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        pCenter.setBackground(new java.awt.Color(242, 249, 255));
        pCenter.setPreferredSize(new java.awt.Dimension(1600, 1000));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtSearch.setName(""); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnCalendar.setBackground(new java.awt.Color(221, 221, 221));
        btnCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/calendar.png"))); // NOI18N
        btnCalendar.setPreferredSize(new java.awt.Dimension(64, 64));
        btnCalendar.setRound(20);
        btnCalendar.setShadowColor(new java.awt.Color(255, 255, 255));
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(5, 146, 57));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm sản phẩm");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setIconTextGap(2);
        btnAdd.setPreferredSize(new java.awt.Dimension(64, 64));
        btnAdd.setRound(30);
        btnAdd.setShadowColor(new java.awt.Color(0, 0, 0));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cbbCategory.setBackground(new java.awt.Color(242, 249, 255));
        cbbCategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbbCategory.setForeground(new java.awt.Color(102, 102, 102));
        cbbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Nhóm thuốc giảm đau", "hạ sốt", "Nhóm thuốc kháng sinh", "Nhóm thuốc kháng viêm", "Nhóm thuốc kháng virus", "Nhóm thuốc ho và long đờm", "Nhóm thuốc dạ dày", "Nhóm thuốc tiêu hóa", "Nhóm thuốc trị rối loạn kinh nguyệt", "Nhóm thuốc huyết áp - tim mạch", "Nhóm thuốc điều trị rối loạn lipid máu", "Nhóm thuốc tránh thai", "Nhóm thuốc kháng nấm", "Nhóm thuốc cải thiện tuần hoàn máu não", "chóng mặt", "Nhóm thuốc điều trị các bệnh về gan", "Nhóm thuốc điều trị bệnh sỏi thận", "Nhóm thuốc xổ giun", "Nhóm thuốc nhỏ mắt", "Nhóm thuốc dùng ngoài", "Nhóm vật tư y tế", "Nhóm thực phẩm chức năng" }));
        cbbCategory.setSelectedIndex(-1);
        cbbCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbbCategory.setLabeText("Danh mục");
        cbbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCategoryActionPerformed(evt);
            }
        });

        cbbVendor.setBackground(new java.awt.Color(242, 249, 255));
        cbbVendor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbbVendor.setForeground(new java.awt.Color(102, 102, 102));
        cbbVendor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "CTCPDP Agimexpharm", "CTCPDP Savi", "CTCPDP Khánh Hòa", "CTCPDP Nano" }));
        cbbVendor.setSelectedIndex(-1);
        cbbVendor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbbVendor.setLabeText("Nhà cung cấp");
        cbbVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbVendorActionPerformed(evt);
            }
        });

        cbbMethod.setBackground(new java.awt.Color(242, 249, 255));
        cbbMethod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbbMethod.setForeground(new java.awt.Color(102, 102, 102));
        cbbMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Sản phẩm bán chạy", "Sản phẩm sắp hết hạn", "Sản phẩm tồn kho thấp" }));
        cbbMethod.setSelectedIndex(-1);
        cbbMethod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbbMethod.setLabeText("Khác");
        cbbMethod.setName(""); // NOI18N
        cbbMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMethodActionPerformed(evt);
            }
        });

        tableScrollButton_Product.setMinimumSize(new java.awt.Dimension(200, 15));
        tableScrollButton_Product.setPreferredSize(new java.awt.Dimension(1190, 400));

        jScrollPane_tableProduct.setBackground(new java.awt.Color(221, 221, 221));
        jScrollPane_tableProduct.setBorder(null);
        jScrollPane_tableProduct.setPreferredSize(new java.awt.Dimension(950, 400));

        tableProduct.setBackground(new java.awt.Color(242, 249, 255));
        tableProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số đăng ký", "Số lượng tồn kho", "Giá nhập", "Giá bán", "Hoạt chất", "Đường dùng", "Đơn vị quy đổi", "Dưỡng chất chính", "Loại vật tư y tế", "Danh mục", "Nhà cung cấp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProduct.setGridColor(new java.awt.Color(218, 247, 249));
        tableProduct.setRequestFocusEnabled(false);
        tableProduct.setShowVerticalLines(true);
        jScrollPane_tableProduct.setViewportView(tableProduct);

        tableScrollButton_Product.add(jScrollPane_tableProduct, java.awt.BorderLayout.CENTER);

        btnScanBarCode.setBackground(new java.awt.Color(221, 221, 221));
        btnScanBarCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/barcode.png"))); // NOI18N
        btnScanBarCode.setPreferredSize(new java.awt.Dimension(64, 64));
        btnScanBarCode.setRound(20);
        btnScanBarCode.setShadowColor(new java.awt.Color(255, 255, 255));
        btnScanBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScanBarCodeActionPerformed(evt);
            }
        });

        cbbAdministration.setBackground(new java.awt.Color(242, 249, 255));
        cbbAdministration.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbbAdministration.setForeground(new java.awt.Color(102, 102, 102));
        cbbAdministration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả" }));
        cbbAdministration.setSelectedIndex(-1);
        cbbAdministration.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbbAdministration.setLabeText("Đường dùng");
        cbbAdministration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbAdministrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cbbVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cbbAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(439, 439, 439))
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnScanBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                    .addContainerGap(27, Short.MAX_VALUE)
                    .addComponent(tableScrollButton_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 1551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnScanBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(792, Short.MAX_VALUE))
            .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pCenterLayout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(tableScrollButton_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(84, Short.MAX_VALUE)))
        );

        add(pCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        date.showPopup();
    }//GEN-LAST:event_btnCalendarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCategoryActionPerformed

    private void cbbVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbVendorActionPerformed

    private void cbbMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMethodActionPerformed

    private void btnScanBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScanBarCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScanBarCodeActionPerformed

    private void cbbAdministrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbAdministrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbAdministrationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnAdd;
    private ui.button.Button btnCalendar;
    private ui.button.Button btnScanBarCode;
    private ui.combobox.Combobox cbbAdministration;
    private ui.combobox.Combobox cbbCategory;
    private ui.combobox.Combobox cbbMethod;
    private ui.combobox.Combobox cbbVendor;
    private ui.datechooser.DateChooser date;
    private javax.swing.JScrollPane jScrollPane_tableProduct;
    private javax.swing.JPanel pCenter;
    private ui.table.TableCustom tableCustom;
    private javax.swing.JTable tableProduct;
    private ui.table.TableScrollButton tableScrollButton_Product;
    private ui.textfield.TextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
