package Students_grade_calculator_pack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
class addtest implements ActionListener
{
	JFrame frame;
	JFrame frame2;
	JLabel label;
	JButton button,back;
	JPanel panel;
	JLabel[] pl;
	JButton[] pb;
	ImageIcon pi,image;
	
	int n;
	addtest()
	{
		n=1;
		frame= new JFrame();
		label=new JLabel();
		panel=new JPanel();
		button=new JButton();
		frame.setTitle("Students Grade Calculator");//sets title of frame
		frame.setSize(1280,720);// sets the x and y dimensions of frame
		frame.setVisible(true);//make frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );/*For closing the operation 
		when close without this command ,it only hides the frame but not close the execution*/
		frame.setResizable(false);//default resize is true
		image=new  ImageIcon("Icon.png");// create an image
		frame.setIconImage(image.getImage());// set the icon
		frame.getContentPane().setBackground(new Color(0x123456));//to set color background
		ImageIcon plus=new ImageIcon("plus.png");
		Image pl=plus.getImage();
		Image rpl=pl.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
		plus.setImage(rpl);
		button.setIcon(plus);
		button.setBounds(0,0,50,50);
		button.setBackground(new Color(0x123959));
		button.setBorder(BorderFactory.createLineBorder(new Color(0x123959),0));
		button.addActionListener(this);
		label.add(button);
		panel.add(label);
		panel.setLayout(null);
		frame.setLayout(null);
		label.setText("Add Test");
		label.setFont(new Font("Sanserif",Font.BOLD,12));
		label.setForeground(Color.WHITE);
		label.setBounds(50,50,50,50);
		frame.add(panel);
		panel.setPreferredSize(new Dimension(1180,620));
		panel.setBounds(50,25, 1180, 620);
		panel.setBackground(new Color(0x123450));
		label.setBounds(10,10, 100, 150);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==button)
		{
			pi=new ImageIcon("paper.png");
			Image pi2=pi.getImage();
			pi2=pi2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			pi.setImage(pi2);
			pl=new JLabel[n];
			pb=new JButton[n];
			int i=0;
			int x,y;
			x=10;
			y=10;
			while(i<n)
			{
				
				pl[i]=new JLabel();
				pb[i]=new JButton();
				pb[i].setIcon(pi);
				pb[i].setBorder(BorderFactory.createLineBorder(new Color(0x123959),0));
				pb[i].setBackground(new Color(0x123959));
				pl[i].add(pb[i]);
				pb[i].addActionListener(this);
				String s="Test "+(i+1);
				pl[i].setText(s);
				pl[i].setForeground(Color.WHITE);
				panel.add(pl[i]);
				pl[i].setBounds(x,y,50,150);
				pb[i].setBounds(0,0,50,50);
				x+=60;
				i++;
				
				
			}
			panel.revalidate();
			
			label.setLocation(x+5,y);
			
			panel.repaint();
			
			n=n+1;
		}
		int length=pl.length;
		for (int i=0;i<length;i++)
		{
			if (e.getSource()==pb[i])
			{
				
				frame.dispose();
				frame2=new JFrame();
				frame2.setVisible(true);
				frame2.setSize(1280,720);
				frame2.setLayout(null);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.getContentPane().setBackground(new Color(0x123456));
				back=new JButton();
				back.setBounds(1190,650,70,30);
				back.setText("Back");
				back.addActionListener(this);
				frame2.add(back);
				frame2.setTitle("Test "+(i+1));
				frame2.setIconImage(image.getImage());
				
			}
		}
		if (e.getSource()==back)
		{
			frame2.dispose();
			frame.setVisible(true);
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtest a=new addtest();
		
		
	}

}
