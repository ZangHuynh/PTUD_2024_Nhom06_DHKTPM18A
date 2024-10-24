package ui.menu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.Timer;
import javax.swing.text.html.CSS;

/**
 *
 * @author Admin
 */
public class SlideShow extends JLabel {
    private final String[] images = {
        "/slider/slide1.jpg",
        "/slider/slide2.jpg",
        "/slider/slide3.jpg",
        "/slider/slide4.png"
    };
    private int currentSlide = 0;
    private Timer timer;

    public SlideShow() {
        initComponents();
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSlide();
            }
        });
        timer.start();
    }

    public void updateSlide() {
        // Tạo đối tượng ImageIcon từ đường dẫn hình ảnh
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(images[currentSlide]));
        // Thay đổi kích thước hình ảnh để khớp với kích thước của JLabel
        ImageIcon scaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(
            getWidth(), // chiều rộng của JLabel
            getHeight(), // chiều cao của JLabel
            java.awt.Image.SCALE_SMOOTH // cách thay đổi kích thước hình ảnh
        ));
        setIcon(scaledIcon); // Cập nhật hình ảnh cho JLabel
        currentSlide++;
        if (currentSlide >= images.length) {
            currentSlide = 0;
        }
    }

    private void initComponents() {
        this.setHorizontalAlignment(CENTER);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        setFont(new Font("Arial",Font.BOLD, 48));
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
    }
}