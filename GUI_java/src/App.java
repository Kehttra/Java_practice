import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Main Instantiation
        _custom_Jframe _mainMyframe = new _custom_Jframe();
        _mainMyframe.setLayout(null);
        // _mainMyframe.pack();
        _mainMyframe.setVisible(true);

        JPanel redpanel = new JPanel();
        JPanel greenpanel = new JPanel();
        JPanel yellowpanel = new JPanel();
        JPanel magentapanel = new JPanel();
        JPanel bluepanel = new JPanel();

        redpanel.setBackground(Color.red);
        greenpanel.setBackground(Color.green);
        yellowpanel.setBackground(Color.yellow);
        magentapanel.setBackground(Color.magenta);
        bluepanel.setBackground(Color.blue);

        redpanel.setPreferredSize(new Dimension(100, 100));
        greenpanel.setPreferredSize(new Dimension(100, 100));
        yellowpanel.setPreferredSize(new Dimension(100, 100));
        magentapanel.setPreferredSize(new Dimension(100, 100));
        bluepanel.setPreferredSize(new Dimension(100, 100));

    }
}
