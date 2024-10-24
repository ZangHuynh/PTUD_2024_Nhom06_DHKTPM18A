package ui.main;

import ui.button.Button;
import ui.button.ButtonEvent;
import ui.form.TempOrderForm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import ui.menu.MenuEvent;
import ui.panel.PanelRound;
import ui.scroll.win11.ScrollBarWin11UI;

public class HomePage extends javax.swing.JFrame {
    private List<Component> originComponents = new ArrayList<>();
    
    public HomePage() {
        initComponents();
        setFullScreen();
        
        updateDateLable();
        updateTimeLabels();

        menu.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                System.out.println(index + " " + subIndex);
                openFrame(index, subIndex);
            }
        });
        
        pCenter.requestFocusInWindow();
    }
    
    private void openFrame(int index,int subIndex){
        //Hóa đơn
        if(index == 0 && subIndex == 1){
            replacePanel(new CreateOrder()); 
        } else if(index == 0 && subIndex == 2){
            replacePanel(new OrderHistory());
        } else if(index == 0 && subIndex == 3){
            //Thống kê
            
        }
        //Sản phẩm
        else if(index == 1 && subIndex == 1){
            replacePanel(new Category()); 
        } else if(index == 1 && subIndex == 2){
            replacePanel(new AddProduct());
        } else if(index == 1 && subIndex == 3){
            replacePanel(new UpdateProduct());
        } else if(index == 1 && subIndex == 4){
            //Thống kê
        } 
        //Khách hàng
        else if(index == 2 && subIndex == 1){
            replacePanel(new CustomerSearch());
        } else if(index == 2 && subIndex == 2){
            replacePanel(new AddCustomer());
        } 
        //Nhà cung cấp
        else if(index == 3 && subIndex == 1){
            replacePanel(new VendorSearch());
        } else if(index == 3 && subIndex == 2){
            replacePanel(new AddVendor());
        } 
        //Nhân viên
        else if(index == 4 && subIndex == 1){
            replacePanel(new EmployeeSearch());
        } else if(index == 4 && subIndex == 2){
            
        }
        //Khuyến mãi
        else if(index == 5 && subIndex == 1){
            
        } else if(index == 5 && subIndex == 2){
            
        }
    }
    
    public void replacePanel(JPanel panel){
        pCenter.removeAll();
        
        pCenter.setLayout(new BorderLayout());
        pCenter.add(panel, BorderLayout.CENTER);
        
        pCenter.revalidate();
        pCenter.repaint();
    }
    
    private void setFullScreen() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle bounds = ge.getMaximumWindowBounds();
        
        this.setBounds(bounds);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);  // Đặt JFrame ở chế độ toàn màn hình
    }
    
    private void updateDateLable(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        lbHeaderDate.setText(sdf.format(now));
    }
    
    private void updateTimeLabels() {
        Timer timer = new Timer(1000, e -> {
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
            SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
            SimpleDateFormat secondFormat = new SimpleDateFormat("ss");

            // Cập nhật giờ, phút và giây cho từng JLabel
            lbHour.setText(hourFormat.format(calendar.getTime()));
            lbMinute.setText(minuteFormat.format(calendar.getTime()));
            lbSecond.setText(secondFormat.format(calendar.getTime()));

            // Căn giữa theo chiều ngang và chiều dọc cho JLabel
            lbHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbHour.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

            lbMinute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbMinute.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

            lbSecond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbSecond.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        });
        timer.start();  // Bắt đầu đồng hồ chạy mỗi giây
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_PaymentMethods = new javax.swing.ButtonGroup();
        pNorth = new javax.swing.JPanel();
        lbHeaderDate = new javax.swing.JLabel();
        btnGuide = new ui.button.Button();
        btnNotification = new ui.button.Button();
        btnAvatar = new ui.button.Button();
        pWest = new javax.swing.JPanel();
        menu = new ui.menu.Menu();
        pCenter = new javax.swing.JPanel();
        pHour = new javax.swing.JPanel();
        lbHour = new javax.swing.JLabel();
        pMinute = new javax.swing.JPanel();
        lbMinute = new javax.swing.JLabel();
        pSecond = new javax.swing.JPanel();
        lbSecond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pNorth.setBackground(new java.awt.Color(102, 204, 255));
        pNorth.setPreferredSize(new java.awt.Dimension(756, 75));

        lbHeaderDate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbHeaderDate.setForeground(new java.awt.Color(255, 255, 255));

        btnGuide.setBackground(new java.awt.Color(102, 204, 255));
        btnGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/information_32.png"))); // NOI18N
        btnGuide.setToolTipText("");
        btnGuide.setRound(50);
        btnGuide.setShadowColor(new java.awt.Color(102, 204, 255));

        btnNotification.setBackground(new java.awt.Color(102, 204, 255));
        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/notification_32.png"))); // NOI18N
        btnNotification.setRound(50);
        btnNotification.setShadowColor(new java.awt.Color(102, 204, 255));

        btnAvatar.setBackground(new java.awt.Color(102, 204, 255));
        btnAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/button/user_32_white.png"))); // NOI18N
        btnAvatar.setRound(50);
        btnAvatar.setShadowColor(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout pNorthLayout = new javax.swing.GroupLayout(pNorth);
        pNorth.setLayout(pNorthLayout);
        pNorthLayout.setHorizontalGroup(
            pNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNorthLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(lbHeaderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 876, Short.MAX_VALUE)
                .addComponent(btnAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pNorthLayout.setVerticalGroup(
            pNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNorthLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbHeaderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pWest.setBackground(new java.awt.Color(245, 245, 245));
        pWest.setLayout(new java.awt.BorderLayout());
        pWest.add(menu, java.awt.BorderLayout.CENTER);

        pCenter.setBackground(new java.awt.Color(255, 255, 255));

        pHour.setBackground(new java.awt.Color(102, 204, 255));

        lbHour.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbHour.setForeground(new java.awt.Color(255, 255, 255));
        lbHour.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout pHourLayout = new javax.swing.GroupLayout(pHour);
        pHour.setLayout(pHourLayout);
        pHourLayout.setHorizontalGroup(
            pHourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pHourLayout.setVerticalGroup(
            pHourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pMinute.setBackground(new java.awt.Color(102, 204, 255));

        lbMinute.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbMinute.setForeground(new java.awt.Color(255, 255, 255));
        lbMinute.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout pMinuteLayout = new javax.swing.GroupLayout(pMinute);
        pMinute.setLayout(pMinuteLayout);
        pMinuteLayout.setHorizontalGroup(
            pMinuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMinute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMinuteLayout.setVerticalGroup(
            pMinuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMinute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pSecond.setBackground(new java.awt.Color(102, 204, 255));

        lbSecond.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbSecond.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pSecondLayout = new javax.swing.GroupLayout(pSecond);
        pSecond.setLayout(pSecondLayout);
        pSecondLayout.setHorizontalGroup(
            pSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSecond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pSecondLayout.setVerticalGroup(
            pSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSecond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(635, 635, 635)
                .addComponent(pHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pWest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pWest, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        UIDefaults ui = UIManager.getDefaults();
        ui.put("ScrollBarUI", ScrollBarWin11UI.class.getCanonicalName());
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.button.Button btnAvatar;
    private javax.swing.ButtonGroup btnGroup_PaymentMethods;
    private ui.button.Button btnGuide;
    private ui.button.Button btnNotification;
    private javax.swing.JLabel lbHeaderDate;
    private javax.swing.JLabel lbHour;
    private javax.swing.JLabel lbMinute;
    private javax.swing.JLabel lbSecond;
    private ui.menu.Menu menu;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pHour;
    private javax.swing.JPanel pMinute;
    private javax.swing.JPanel pNorth;
    private javax.swing.JPanel pSecond;
    private javax.swing.JPanel pWest;
    // End of variables declaration//GEN-END:variables
}
