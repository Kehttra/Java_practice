import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class _custom_Jbutton extends JButton implements ActionListener {

    _custom_Jbutton() {

        this.setBounds(200, 100, 250, 140);

        // No need as of now
        // this.addActionListener(this);

        this.setText("text");
        this.setFocusable(false);

        // Requires image, kept for reference
        // this.setIcon(point_icon);

        this.setVerticalTextPosition(JButton.BOTTOM);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setFont(new Font("Comic Sans", Font.BOLD, 20));
        this.setForeground(Color.CYAN);
        this.setBackground(Color.PINK);
        this.setBorder(BorderFactory.createEtchedBorder());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
