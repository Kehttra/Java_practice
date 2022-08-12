import java.awt.*;

import javax.swing.*;

public class _custom_Jframe extends JFrame{
    
     //Variable declaractions
        //Can be changed by user later on
        int _width, _height;
        String _mainTitle;
        ImageIcon _logo = new ImageIcon("images/orb_image.png");
        boolean _resize;
        boolean _visibleFrame;
        Color _color;



    _custom_Jframe()
    {
        _width = 700; 
        _height = 500;
        _mainTitle = "Java Test GUI";
        _resize = true;
        _visibleFrame = false;
        _color = new Color(166, 166, 166);


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