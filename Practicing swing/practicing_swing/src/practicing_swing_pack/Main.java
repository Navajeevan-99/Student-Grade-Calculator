package practicing_swing_pack;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JLabel label=new JLabel();
		frame.setTitle("Students Grade Calculator");//sets title of frame
		frame.setSize(1280,720);// sets the x and y dimensions of frame
		frame.setVisible(true);//make frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );/*For closing the operation 
		when close without this command ,it only hides the frame but not close the execution*/
		frame.setResizable(false);//default resize is true
		ImageIcon image=new  ImageIcon("Icon.png");// create an image
		frame.setIconImage(image.getImage());// set the icon
		frame.getContentPane().setBackground(new Color(0x123456));//to set color background
		ImageIcon plus=new ImageIcon("plus.png");
		label.setIcon(plus);
		label.setText("Bloody Sweet");
		frame.add(label);
		frame.setLayout(null);
		label.setText("return");
		label.setBounds(50,50,400,500);
		
		
	}

}
