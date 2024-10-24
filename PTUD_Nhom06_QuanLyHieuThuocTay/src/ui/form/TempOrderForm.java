package ui.form;

import javax.swing.table.JTableHeader;
import ui.tabbed.TabbedForm;
import ui.table.TableCustom;

public class TempOrderForm extends TabbedForm {
    
    public TempOrderForm() {
        initComponents();
        
        JTableHeader theader = tableProduct.getTableHeader();
        theader.setFont(new java.awt.Font("Segoe UI", 0, 18));
        
        TableCustom.apply(scrollPane, TableCustom.TableType.MULTI_LINE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_PaymentMethod = new javax.swing.ButtonGroup();
        panelRound2 = new ui.panel.PanelRound();
        pnProductOrder = new ui.panel.PanelRound();
        tableScrollButton_Product = new ui.table.TableScrollButton();
        scrollPane = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        pnOrderInfor = new ui.panel.PanelRound();
        txtTotalDue = new ui.textfield.TextField_Behind();
        lbEmployeeName = new javax.swing.JLabel();
        lbTotalDue = new javax.swing.JLabel();
        lbOrderPoint = new javax.swing.JLabel();
        txtPointOrder = new ui.textfield.TextField_Behind();
        txtCustPhone = new ui.textfield.TextField_Behind();
        lbCustPhone = new javax.swing.JLabel();
        txtCustName = new ui.textfield.TextField_Behind();
        lbCustName = new javax.swing.JLabel();
        lbCustPoint = new javax.swing.JLabel();
        txtPoint = new ui.textfield.TextField_Behind();
        txtEmployeeName = new ui.textfield.TextField_Behind();
        txtDateTime = new ui.textfield.TextField_Behind();
        ckbTransPoint = new ui.checkbox.JCheckBoxCustom();
        lbCustNeededPay = new javax.swing.JLabel();
        txtNeededPay = new ui.textfield.TextField_Behind();
        lbDiscountAmount = new javax.swing.JLabel();
        txtDiscount = new ui.textfield.TextField_Behind();
        lbCustPay = new javax.swing.JLabel();
        txtCustPay = new ui.textfield.TextField_Behind();
        rbCash = new ui.radio_button.RadioButtonCustom();
        rbCreditCard = new ui.radio_button.RadioButtonCustom();
        rbTransfer = new ui.radio_button.RadioButtonCustom();
        btnCheckOut = new ui.button.Button();
        pnNotes = new ui.panel.PanelRound();
        txtNote = new ui.textfield.TextField_Behind();
        lbTotalDue_Left = new javax.swing.JLabel();
        txtTotalQuantity = new ui.textfield.TextField_Behind();
        txtTotalDue_Left = new ui.textfield.TextField_Behind();

        setBackground(new java.awt.Color(242, 249, 255));
        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        panelRound2.setBackground(new java.awt.Color(242, 249, 255));
        panelRound2.setPreferredSize(new java.awt.Dimension(1600, 1000));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setShadowSize(5);

        pnProductOrder.setBackground(new java.awt.Color(255, 255, 255));
        pnProductOrder.setRoundBottomLeft(30);
        pnProductOrder.setRoundBottomRight(30);
        pnProductOrder.setRoundTopLeft(30);
        pnProductOrder.setRoundTopRight(30);
        pnProductOrder.setShadowColor(new java.awt.Color(204, 204, 204));
        pnProductOrder.setShadowSize(5);

        tableProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn vị", "Số lượng", "Giá bán", "Thành tiền"
            }
        ));
        tableProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProduct.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(tableProduct);

        tableScrollButton_Product.add(scrollPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnProductOrderLayout = new javax.swing.GroupLayout(pnProductOrder);
        pnProductOrder.setLayout(pnProductOrderLayout);
        pnProductOrderLayout.setHorizontalGroup(
            pnProductOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductOrderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tableScrollButton_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnProductOrderLayout.setVerticalGroup(
            pnProductOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductOrderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tableScrollButton_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnOrderInfor.setBackground(new java.awt.Color(255, 255, 255));
        pnOrderInfor.setForeground(new java.awt.Color(255, 255, 255));
        pnOrderInfor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnOrderInfor.setRoundBottomLeft(30);
        pnOrderInfor.setRoundBottomRight(30);
        pnOrderInfor.setRoundTopLeft(30);
        pnOrderInfor.setRoundTopRight(30);
        pnOrderInfor.setShadowColor(new java.awt.Color(204, 204, 204));
        pnOrderInfor.setShadowSize(5);

        txtTotalDue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalDue.setEnabled(false);
        txtTotalDue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbEmployeeName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbEmployeeName.setText("Người bán:");

        lbTotalDue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTotalDue.setText("Tổng tiền hàng:");

        lbOrderPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbOrderPoint.setText("Tích điểm:");

        txtPointOrder.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPointOrder.setEnabled(false);
        txtPointOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPointOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPointOrderActionPerformed(evt);
            }
        });

        txtCustPhone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCustPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCustPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustPhoneActionPerformed(evt);
            }
        });

        lbCustPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustPhone.setText("Số điện thoại khách:");

        txtCustName.setEnabled(false);
        txtCustName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbCustName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustName.setText("Tên khách:");

        lbCustPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustPoint.setText("Điểm tích lũy:");

        txtPoint.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPoint.setEnabled(false);
        txtPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEmployeeName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEmployeeName.setEnabled(false);
        txtEmployeeName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });

        txtDateTime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDateTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateTimeActionPerformed(evt);
            }
        });

        ckbTransPoint.setBackground(new java.awt.Color(102, 204, 255));
        ckbTransPoint.setText("Đổi điểm");
        ckbTransPoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbCustNeededPay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustNeededPay.setText("Khách cần trả:");

        txtNeededPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNeededPay.setEnabled(false);
        txtNeededPay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbDiscountAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDiscountAmount.setText("Tiền giảm:");

        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscount.setEnabled(false);
        txtDiscount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });

        lbCustPay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustPay.setText("Khách thanh toán:");

        txtCustPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCustPay.setEnabled(false);
        txtCustPay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rbCash.setBackground(new java.awt.Color(102, 204, 255));
        btnGroup_PaymentMethod.add(rbCash);
        rbCash.setText("Tiền mặt");
        rbCash.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rbCreditCard.setBackground(new java.awt.Color(102, 204, 255));
        btnGroup_PaymentMethod.add(rbCreditCard);
        rbCreditCard.setText("Thẻ");
        rbCreditCard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rbTransfer.setBackground(new java.awt.Color(102, 204, 255));
        btnGroup_PaymentMethod.add(rbTransfer);
        rbTransfer.setText("Chuyển khoản");
        rbTransfer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCheckOut.setBackground(new java.awt.Color(102, 204, 255));
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("THANH TOÁN");
        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCheckOut.setRound(20);
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOrderInforLayout = new javax.swing.GroupLayout(pnOrderInfor);
        pnOrderInfor.setLayout(pnOrderInforLayout);
        pnOrderInforLayout.setHorizontalGroup(
            pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderInforLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOrderInforLayout.createSequentialGroup()
                        .addComponent(rbCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(rbCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(rbTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnOrderInforLayout.createSequentialGroup()
                        .addComponent(ckbTransPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOrderInforLayout.createSequentialGroup()
                        .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnOrderInforLayout.createSequentialGroup()
                                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDiscountAmount)
                                    .addComponent(lbCustPay))
                                .addGap(24, 24, 24)
                                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCustPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnOrderInforLayout.createSequentialGroup()
                                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTotalDue)
                                    .addComponent(lbOrderPoint)
                                    .addComponent(lbEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCustPhone)
                                    .addComponent(lbCustName)
                                    .addComponent(lbCustNeededPay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNeededPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTotalDue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPointOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnOrderInforLayout.createSequentialGroup()
                                        .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(lbCustPoint)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCustPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnOrderInforLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(174, 174, 174))))
        );
        pnOrderInforLayout.setVerticalGroup(
            pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderInforLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnOrderInforLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtEmployeeName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addComponent(lbEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPointOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOrderPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCustPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(ckbTransPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustNeededPay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNeededPay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustPay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnOrderInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCash, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pnNotes.setBackground(new java.awt.Color(255, 255, 255));
        pnNotes.setPreferredSize(new java.awt.Dimension(840, 90));
        pnNotes.setRoundBottomLeft(30);
        pnNotes.setRoundBottomRight(30);
        pnNotes.setRoundTopLeft(30);
        pnNotes.setRoundTopRight(30);
        pnNotes.setShadowColor(new java.awt.Color(204, 204, 204));

        txtNote.setForeground(new java.awt.Color(102, 102, 102));
        txtNote.setText("Ghi chú đơn hàng ...");
        txtNote.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoteFocusLost(evt);
            }
        });

        lbTotalDue_Left.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTotalDue_Left.setText("Tổng tiền hàng: ");

        txtTotalQuantity.setEnabled(false);
        txtTotalQuantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotalQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalQuantityActionPerformed(evt);
            }
        });

        txtTotalDue_Left.setEnabled(false);
        txtTotalDue_Left.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnNotesLayout = new javax.swing.GroupLayout(pnNotes);
        pnNotes.setLayout(pnNotesLayout);
        pnNotesLayout.setHorizontalGroup(
            pnNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNotesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(lbTotalDue_Left)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(txtTotalDue_Left, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnNotesLayout.setVerticalGroup(
            pnNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNotesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalDue_Left)
                    .addComponent(txtTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalDue_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnProductOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnOrderInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addComponent(pnProductOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnOrderInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(panelRound2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPointOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPointOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPointOrderActionPerformed

    private void txtCustPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustPhoneActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTimeActionPerformed

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void txtTotalQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalQuantityActionPerformed

    private void txtNoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoteFocusGained
        if(txtNote.getText().equals("Ghi chú đơn hàng ...")){
            txtNote.setText("");
        }
    }//GEN-LAST:event_txtNoteFocusGained

    private void txtNoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoteFocusLost
        if(txtNote.getText().equals("")){
            txtNote.setText("Ghi chú đơn hàng ...");
        }
    }//GEN-LAST:event_txtNoteFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnCheckOut;
    private javax.swing.ButtonGroup btnGroup_PaymentMethod;
    private ui.checkbox.JCheckBoxCustom ckbTransPoint;
    private javax.swing.JLabel lbCustName;
    private javax.swing.JLabel lbCustNeededPay;
    private javax.swing.JLabel lbCustPay;
    private javax.swing.JLabel lbCustPhone;
    private javax.swing.JLabel lbCustPoint;
    private javax.swing.JLabel lbDiscountAmount;
    private javax.swing.JLabel lbEmployeeName;
    private javax.swing.JLabel lbOrderPoint;
    private javax.swing.JLabel lbTotalDue;
    private javax.swing.JLabel lbTotalDue_Left;
    private ui.panel.PanelRound panelRound2;
    private ui.panel.PanelRound pnNotes;
    private ui.panel.PanelRound pnOrderInfor;
    private ui.panel.PanelRound pnProductOrder;
    private ui.radio_button.RadioButtonCustom rbCash;
    private ui.radio_button.RadioButtonCustom rbCreditCard;
    private ui.radio_button.RadioButtonCustom rbTransfer;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableProduct;
    private ui.table.TableScrollButton tableScrollButton_Product;
    private ui.textfield.TextField_Behind txtCustName;
    private ui.textfield.TextField_Behind txtCustPay;
    private ui.textfield.TextField_Behind txtCustPhone;
    private ui.textfield.TextField_Behind txtDateTime;
    private ui.textfield.TextField_Behind txtDiscount;
    private ui.textfield.TextField_Behind txtEmployeeName;
    private ui.textfield.TextField_Behind txtNeededPay;
    private ui.textfield.TextField_Behind txtNote;
    private ui.textfield.TextField_Behind txtPoint;
    private ui.textfield.TextField_Behind txtPointOrder;
    private ui.textfield.TextField_Behind txtTotalDue;
    private ui.textfield.TextField_Behind txtTotalDue_Left;
    private ui.textfield.TextField_Behind txtTotalQuantity;
    // End of variables declaration//GEN-END:variables
}
