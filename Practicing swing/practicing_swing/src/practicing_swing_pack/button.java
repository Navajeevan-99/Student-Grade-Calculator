package practicing_swing_pack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
class next implements ActionListener
{
	JButton button;
	JButton b2;
	JFrame Frame;
	next(){
		Frame=new JFrame();
		button =new JButton();
		Frame.setVisible(true);
		Frame.setLayout(null);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setBounds(200,200,500,200);
		Frame.setSize(1280,720);
		Frame.add(button);
		button.addActionListener(this);
		//button.addActionListener(e -> System.out.println("Bloody Sweet"));
		button.setText("Bloody Sweet");
		b2=new JButton();
		Frame.add(b2);
		b2.setBounds(20,20,400,200);
		ImageIcon i=new ImageIcon("button.png");
		b2.setIcon(i);
	
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button)
		{
			System.out.println("Bloody Sweet");
		}
}}
	
public class button {
	
	public static void main(String[] args) {
		
		next n=new next();
		
	}
	}


