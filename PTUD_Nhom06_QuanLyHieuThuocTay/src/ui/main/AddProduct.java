package ui.main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import ui.table.TableCustom;

public class AddProduct extends javax.swing.JPanel{
    
    public AddProduct() {
        initComponents();
        setupTable();
        testData(tableProduct);
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


    private void testData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Trần Văn B", "2024-10-15 10:00", "Online", "10%", "900.000", "900.000"});
        model.addRow(new Object[]{"HD002", "Lê Thị B", "Trần Văn C", "2024-10-15 11:00", "Trực tiếp", "5%", "800.000", "900.000"});
        model.addRow(new Object[]{"HD003", "Trần Văn D", "Võ Hoàng E", "2024-10-15 12:00", "Online", "15%", "1.200.000", "900.000"});
        model.addRow(new Object[]{"HD004", "Nguyễn Văn F", "Lê Văn G", "2024-10-15 13:00", "Trực tiếp", "10%", "950.000", "900.000"});
        model.addRow(new Object[]{"HD005", "Nguyễn Thị H", "Trần Văn I", "2024-10-15 14:00", "Online", "Không có", "1.500.000", "900.000"});
        model.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Trần Văn B", "2024-10-15 10:00", "Online", "10%", "900.000", "900.000"});
        model.addRow(new Object[]{"HD002", "Lê Thị B", "Trần Văn C", "2024-10-15 11:00", "Trực tiếp", "5%", "800.000", "900.000"});
        model.addRow(new Object[]{"HD003", "Trần Văn D", "Võ Hoàng E", "2024-10-15 12:00", "Online", "15%", "1.200.000", "900.000"});
        model.addRow(new Object[]{"HD004", "Nguyễn Văn F", "Lê Văn G", "2024-10-15 13:00", "Trực tiếp", "10%", "950.000", "900.000"});
        model.addRow(new Object[]{"HD005", "Nguyễn Thị H", "Trần Văn I", "2024-10-15 14:00", "Online", "Không có", "1.500.000", "900.000"});
        model.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Trần Văn B", "2024-10-15 10:00", "Online", "10%", "900.000", "900.000"});
        model.addRow(new Object[]{"HD002", "Lê Thị B", "Trần Văn C", "2024-10-15 11:00", "Trực tiếp", "5%", "800.000", "900.000"});
        model.addRow(new Object[]{"HD003", "Trần Văn D", "Võ Hoàng E", "2024-10-15 12:00", "Online", "15%", "1.200.000", "900.000"});
        model.addRow(new Object[]{"HD004", "Nguyễn Văn F", "Lê Văn G", "2024-10-15 13:00", "Trực tiếp", "10%", "950.000", "900.000"});
        model.addRow(new Object[]{"HD005", "Nguyễn Thị H", "Trần Văn I", "2024-10-15 14:00", "Online", "Không có", "1.500.000", "900.000"});
        model.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Trần Văn B", "2024-10-15 10:00", "Online", "10%", "900.000", "900.000"});
        model.addRow(new Object[]{"HD002", "Lê Thị B", "Trần Văn C", "2024-10-15 11:00", "Trực tiếp", "5%", "800.000", "900.000"});
        model.addRow(new Object[]{"HD003", "Trần Văn D", "Võ Hoàng E", "2024-10-15 12:00", "Online", "15%", "1.200.000", "900.000"});
        model.addRow(new Object[]{"HD004", "Nguyễn Văn F", "Lê Văn G", "2024-10-15 13:00", "Trực tiếp", "10%", "950.000", "900.000"});
        model.addRow(new Object[]{"HD005", "Nguyễn Thị H", "Trần Văn I", "2024-10-15 14:00", "Online", "Không có", "1.500.000", "900.000"});
        model.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Trần Văn B", "2024-10-15 10:00", "Online", "10%", "900.000", "900.000"});
        model.addRow(new Object[]{"HD002", "Lê Thị B", "Trần Văn C", "2024-10-15 11:00", "Trực tiếp", "5%", "800.000", "900.000"});
        model.addRow(new Object[]{"HD003", "Trần Văn D", "Võ Hoàng E", "2024-10-15 12:00", "Online", "15%", "1.200.000", "900.000"});
        model.addRow(new Object[]{"HD004", "Nguyễn Văn F", "Lê Văn G", "2024-10-15 13:00", "Trực tiếp", "10%", "950.000", "900.000"});
        model.addRow(new Object[]{"HD005", "Nguyễn Thị H", "Trần Văn I", "2024-10-15 14:00", "Online", "Không có", "1.500.000", "900.000"});
        model.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Trần Văn B", "2024-10-15 10:00", "Online", "10%", "900.000", "900.000"});
        model.addRow(new Object[]{"HD002", "Lê Thị B", "Trần Văn C", "2024-10-15 11:00", "Trực tiếp", "5%", "800.000", "900.000"});
        model.addRow(new Object[]{"HD003", "Trần Văn D", "Võ Hoàng E", "2024-10-15 12:00", "Online", "15%", "1.200.000", "900.000"});
        model.addRow(new Object[]{"HD004", "Nguyễn Văn F", "Lê Văn G", "2024-10-15 13:00", "Trực tiếp", "10%", "950.000", "900.000"});
        model.addRow(new Object[]{"HD005", "Nguyễn Thị H", "Trần Văn I", "2024-10-15 14:00", "Online", "Không có", "1.500.000", "900.000"});

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCenter = new javax.swing.JPanel();
        txtSearch = new ui.textfield.TextField();
        btnAdd = new ui.button.Button();
        btnSave = new ui.button.Button();
        cbbCategory = new ui.combobox.Combobox();
        cbbVendor = new ui.combobox.Combobox();
        jScrollPane_tableProduct = new ui.scroll.win11.ScrollPaneWin11();
        tableProduct = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        pCenter.setBackground(new java.awt.Color(242, 249, 255));
        pCenter.setPreferredSize(new java.awt.Dimension(1600, 1000));
        pCenter.setRequestFocusEnabled(false);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtSearch.setName(""); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(5, 146, 57));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Tải file");
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

        btnSave.setBackground(new java.awt.Color(5, 146, 57));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Lưu");
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setIconTextGap(2);
        btnSave.setPreferredSize(new java.awt.Dimension(64, 64));
        btnSave.setRound(30);
        btnSave.setShadowColor(new java.awt.Color(0, 0, 0));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cbbCategory.setBackground(new java.awt.Color(242, 249, 255));
        cbbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Nhóm thuốc giảm đau", "hạ sốt", "Nhóm thuốc kháng sinh", "Nhóm thuốc kháng viêm", "Nhóm thuốc kháng virus", "Nhóm thuốc ho và long đờm", "Nhóm thuốc dạ dày", "Nhóm thuốc tiêu hóa", "Nhóm thuốc trị rối loạn kinh nguyệt", "Nhóm thuốc huyết áp - tim mạch", "Nhóm thuốc điều trị rối loạn lipid máu", "Nhóm thuốc tránh thai", "Nhóm thuốc kháng nấm", "Nhóm thuốc cải thiện tuần hoàn máu não", "chóng mặt", "Nhóm thuốc điều trị các bệnh về gan", "Nhóm thuốc điều trị bệnh sỏi thận", "Nhóm thuốc xổ giun", "Nhóm thuốc nhỏ mắt", "Nhóm thuốc dùng ngoài", "Nhóm vật tư y tế", "Nhóm thực phẩm chức năng" }));
        cbbCategory.setSelectedIndex(-1);
        cbbCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbCategory.setLabeText("Danh mục");

        cbbVendor.setBackground(new java.awt.Color(242, 249, 255));
        cbbVendor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "CTCPDP Agimexpharm", "CTCPDP Savi", "CTCPDP Khánh Hòa", "CTCPDP Nano" }));
        cbbVendor.setSelectedIndex(-1);
        cbbVendor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbVendor.setLabeText("Nhà cung cấp");

        jScrollPane_tableProduct.setBackground(new java.awt.Color(221, 221, 221));
        jScrollPane_tableProduct.setBorder(null);

        tableProduct.setBackground(new java.awt.Color(242, 249, 255));
        tableProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số đăng ký", "Số lượng tồn kho", "Giá nhập", "Thuế", "Hoạt chất", "Đường dùng", "Đơn vị quy đổi", "Dưỡng chất chính", "Loại vật tư y tế", "Danh mục", "Nhà cung cấp"
            }
        ));
        tableProduct.setGridColor(new java.awt.Color(218, 247, 249));
        jScrollPane_tableProduct.setViewportView(tableProduct);

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane_tableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 1549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pCenterLayout.createSequentialGroup()
                                .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(cbbVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane_tableProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        add(pCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnAdd;
    private ui.button.Button btnSave;
    private ui.combobox.Combobox cbbCategory;
    private ui.combobox.Combobox cbbVendor;
    private javax.swing.JScrollPane jScrollPane_tableProduct;
    private javax.swing.JPanel pCenter;
    private javax.swing.JTable tableProduct;
    private ui.textfield.TextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
