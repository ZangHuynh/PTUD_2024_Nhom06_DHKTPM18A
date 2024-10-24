package ui.main;

import ui.button.Button;
import ui.form.TempOrderForm;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CreateOrder extends javax.swing.JPanel {
    
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
       private Map<String, ScheduledFuture<?>> tabRemovalTasks = new HashMap<>();
    
    public CreateOrder() {
        initComponents();
        initFirstTab();
        
        pCenter.requestFocusInWindow();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCenter = new javax.swing.JPanel();
        tabbedPane = new ui.tabbed.TabbedPaneCustom();
        txtSearch = new ui.textfield.TextField();
        btnSearch = new ui.button.Button();
        btnBarcode = new ui.button.Button();
        btnAddTab = new ui.button.Button();

        setPreferredSize(new java.awt.Dimension(1620, 1000));
        setLayout(new java.awt.BorderLayout());

        pCenter.setBackground(new java.awt.Color(242, 249, 255));

        tabbedPane.setBackground(new java.awt.Color(242, 249, 255));
        tabbedPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSearch.setText("Nhập mã sản phẩm ...");
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setMargin(new java.awt.Insets(3, 6, 3, 6));
        txtSearch.setName(""); // NOI18N
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(102, 204, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/magnifying-glass_32.png"))); // NOI18N
        btnSearch.setMargin(new java.awt.Insets(2, 10, 3, 10));
        btnSearch.setRound(20);
        btnSearch.setShadowColor(new java.awt.Color(102, 204, 255));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBarcode.setBackground(new java.awt.Color(102, 204, 255));
        btnBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/barcode_32.png"))); // NOI18N
        btnBarcode.setIconTextGap(0);
        btnBarcode.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnBarcode.setRound(20);
        btnBarcode.setShadowColor(new java.awt.Color(102, 204, 255));

        btnAddTab.setBackground(new java.awt.Color(102, 204, 255));
        btnAddTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/add.png"))); // NOI18N
        btnAddTab.setRound(50);
        btnAddTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCenterLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnAddTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 954, Short.MAX_VALUE))
                    .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                        .addComponent(btnAddTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(pCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private List<String> availableCounts = new ArrayList<>(List.of("1", "2", "3", "4", "5"));
    private List<String> usedCounts = new ArrayList<>();
    private void btnAddTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTabActionPerformed
        if (!availableCounts.isEmpty()) {
            String countString = availableCounts.remove(0);
            usedCounts.add(countString);

            tabbedPane.addTab("Hóa đơn " + countString, new TempOrderForm());
            int newTabIndex = tabbedPane.getTabCount() - 1;
            addCloseButtonToTab(newTabIndex);
               
            scheduleTabRemoval(countString, newTabIndex);
        } else {
            JOptionPane.showMessageDialog(null, "Chỉ cho lưu tạm tối đa 5 hóa đơn");
        }
    }//GEN-LAST:event_btnAddTabActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if(txtSearch.getText().equals("Nhập mã sản phẩm ...")){
            txtSearch.setText("");
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if(txtSearch.getText().equals("")){
            txtSearch.setText("Nhập mã sản phẩm ...");
        }
    }//GEN-LAST:event_txtSearchFocusLost
    
    public void initFirstTab(){
        String countString = availableCounts.remove(0);
        usedCounts.add(countString);

        tabbedPane.addTab("Hóa đơn " + countString, new TempOrderForm());
        int newTabIndex = tabbedPane.getTabCount() - 1;
        addCloseButtonToTab(newTabIndex);
        
        scheduleTabRemoval(countString, newTabIndex);
    }
    
    private void addCloseButtonToTab(int tabIndex) {
        JPanel tabPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        JLabel titleLabel = new JLabel(tabbedPane.getTitleAt(tabIndex));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 30));
        titleLabel.setOpaque(false);
        tabPanel.add(titleLabel);

        Button closeButton = new Button("X");
        closeButton.setMargin(new Insets(0, 5, 0, 5));
        closeButton.setFocusable(false); 
        closeButton.setOpaque(false);
        closeButton.setBorder(BorderFactory.createEmptyBorder());
        closeButton.setContentAreaFilled(false);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = tabbedPane.indexOfTabComponent(tabPanel);
                if (i != -1) {
                    String tabTitle = tabbedPane.getTitleAt(i).replace("Hóa đơn ", "").trim();
                    usedCounts.remove(tabTitle); 
                    availableCounts.add(tabTitle);
                    Collections.sort(availableCounts);
                    tabbedPane.remove(i);
                }
            }
        });

        tabPanel.add(closeButton);
        tabPanel.setOpaque(false);
        tabbedPane.setTabComponentAt(tabIndex, tabPanel);
    }
    
    private void scheduleTabRemoval(String tabTitle, int tabIndex) {
    ScheduledFuture<?> future = scheduler.schedule(() -> {
        SwingUtilities.invokeLater(() -> {
                int index = findTabIndexByTitle(tabTitle);
                if (index != -1 && tabbedPane.getTabCount() > 1) {
                    removeTabAt(index);
                } else if (tabbedPane.getTabCount() == 1) {
                    replaceLastTabWithInvoiceOne();
                }
            });
        }, 30, TimeUnit.MINUTES);

        tabRemovalTasks.put(tabTitle, future);
    }

    private void removeTabAt(int tabIndex) {
        String tabTitle = tabbedPane.getTitleAt(tabIndex).replace("Hóa đơn ", "").trim();
        usedCounts.remove(tabTitle); 
        availableCounts.add(tabTitle);
        Collections.sort(availableCounts);
        tabbedPane.remove(tabIndex);

        ScheduledFuture<?> future = tabRemovalTasks.remove(tabTitle);
        if (future != null) {
            future.cancel(false);
        }
    }

    private int findTabIndexByTitle(String tabTitle) {
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            if (tabbedPane.getTitleAt(i).contains(tabTitle)) {
                return i;
            }
        }
        return -1;
    }

    private void replaceLastTabWithInvoiceOne() {
        if (tabbedPane.getTabCount() == 1) {
            removeTabAt(0);
            String newTabTitle = "Hóa đơn 1";
            usedCounts.add("1");
            availableCounts.remove("1");
            tabbedPane.addTab(newTabTitle, new TempOrderForm());
            addCloseButtonToTab(tabbedPane.getTabCount() - 1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnAddTab;
    private ui.button.Button btnBarcode;
    private ui.button.Button btnSearch;
    private javax.swing.JPanel pCenter;
    private javax.swing.JTabbedPane tabbedPane;
    private ui.textfield.TextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
