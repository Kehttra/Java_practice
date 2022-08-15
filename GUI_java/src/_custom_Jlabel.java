import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class _custom_Jlabel extends JLabel
{

    
    ImageIcon _new_logo = new ImageIcon("images/icon_image.jpg");
    Border _border = BorderFactory.createLineBorder(Color.YELLOW, 2);


    _custom_Jlabel()
    {
        this.setText("Test text for main label");
        this.setIcon( _new_logo);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(123, 55, 250));
        this.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.setIconTextGap(10);
        this.setBackground(Color.WHITE);
        this.setOpaque(true); 
        this.setBorder(_border);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
}
