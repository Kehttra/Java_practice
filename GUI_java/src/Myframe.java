import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame{
    
     //Variable declaractions
        //Can be changed by user later on
        int _width = 700, _height = 500;
        String _mainTitle = "Java Test GUI";
        ImageIcon _logo = new ImageIcon("images/orb_image.png");
        boolean _resize = true;
        boolean _visibleFrame = true;
        Color _color = new Color(0,0,0);



    Myframe()
    {

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //this.setResizable(true);

        this.setTitle(_mainTitle);
        this.setSize(_width, _height);
        this.setVisible(_visibleFrame);
        this.setResizable(_resize);
        //Setting the Icon of the main frame
        
        this.setIconImage(_logo.getImage());
        this.getContentPane().setBackground(_color);
    }

    

}
