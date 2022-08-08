import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        int _width = 700, _height = 500;
        String _mainTitle = "Java Test GUI";



        JFrame _mainFrame = new JFrame();
        _mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //_mainFrame.setResizable(true);

        _mainFrame.setTitle(_mainTitle);
        _mainFrame.setSize(_width, _height);
        _mainFrame.setVisible(true);

        
    }
}
