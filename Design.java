import javax.swing.*;
import java.awt.*;
// class DUButton extends JButton{

// }
public class Design{
	public static void main(String[] args) {
		  JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel(new BorderLayout());
	

JButton myButton1 = new JButton("DHVANI SHAH");
panel.add(myButton1,BorderLayout.CENTER);
myButton1.setBackground(Color.RED);
myButton1.setForeground(Color.WHITE);

JButton myButton2 = new JButton();
panel.add(myButton2,BorderLayout.EAST);
myButton2.setBackground(Color.YELLOW);

JButton myButton3 = new JButton();
panel.add(myButton3,BorderLayout.SOUTH);
myButton3.setBackground(Color.BLUE);

JButton myButton4 = new JButton();
panel.add(myButton4,BorderLayout.WEST);
myButton4.setBackground(Color.BLUE);

 frame.add(panel);
        frame.setVisible(true);
}
}