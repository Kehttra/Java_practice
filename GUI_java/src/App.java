import java.awt.BorderLayout;
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
        _mainMyframe.setLayout(new BorderLayout(10,10));
        // _mainMyframe.pack();
        
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


        //---------------------Additional panels--------------------------

        JPanel subredpanel = new JPanel();
        JPanel subgreenpanel = new JPanel();
        JPanel subyellowpanel = new JPanel();
        JPanel submagentapanel = new JPanel();
        JPanel subbluepanel = new JPanel();

        subredpanel.setBackground(Color.black);
        subgreenpanel.setBackground(Color.darkGray);
        subyellowpanel.setBackground(Color.gray);
        submagentapanel.setBackground(Color.lightGray);
        subbluepanel.setBackground(Color.white);
        
        bluepanel.setLayout(new BorderLayout());

        subredpanel.setPreferredSize(new Dimension(50, 50));
        subgreenpanel.setPreferredSize(new Dimension(50, 50));
        subyellowpanel.setPreferredSize(new Dimension(50, 50));
        submagentapanel.setPreferredSize(new Dimension(50, 50));
        subbluepanel.setPreferredSize(new Dimension(50, 50));
        
        bluepanel.add(subredpanel, BorderLayout.NORTH);
        bluepanel.add(subgreenpanel, BorderLayout.WEST);
        bluepanel.add(subyellowpanel, BorderLayout.EAST);
        bluepanel.add(submagentapanel, BorderLayout.SOUTH);
        bluepanel.add(subbluepanel, BorderLayout.CENTER);
        //----------------------------------------------------------------

        
        _mainMyframe.add(redpanel, BorderLayout.NORTH);
        _mainMyframe.add(greenpanel, BorderLayout.WEST);
        _mainMyframe.add(yellowpanel, BorderLayout.EAST);
        _mainMyframe.add(magentapanel, BorderLayout.SOUTH);
        _mainMyframe.add(bluepanel, BorderLayout.CENTER);
        
        _mainMyframe.setVisible(true);
    }
}
