package Students_grade_calculator_pack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
class addtest implements ActionListener
{
	JFrame frame;
	List<JFrame> frame2;
	List<JPanel> panel2;
	List<List<JTextField>> t1;
	List<List<JTextField>> subt1;
	List<List<JTextField>> subt2;
	List<List<JTextField>> subt3;
	List<List<JTextField>> subt4;
	List<List<JTextField>> subt5;
	List<JScrollPane> fs2;
	List<Integer> x2,y2;//to manage x2,y2
	JLabel label;
	JButton plus,back;
	JPanel panel1;
	List<JLabel> pl;
	List<JButton> pb;
	List<JButton> add1;
	ImageIcon pi,image,logo;
	JScrollPane fs1;
	int n;
	int x,y; //for plus and label
	int x1,y1;//for paper and pl
	int b;
	List<Integer> noft;//no  of textdfield
	addtest()
	{	//sub1,sub2,sub3,sub4 and sub5
		subt1 = new ArrayList<List<JTextField>>();
		subt2 = new ArrayList<List<JTextField>>();
		subt3 = new ArrayList<List<JTextField>>();
		subt4 = new ArrayList<List<JTextField>>();
		subt5 = new ArrayList<List<JTextField>>();
		//x2 and y2 details
		x2=new ArrayList<>();
		y2=new ArrayList<>();
		//noft details
		noft=new ArrayList<>();
		//t1 JTextField
		t1 = new ArrayList<List<JTextField>>();
		//add button
		add1=new ArrayList<>();
		//fs2 scroll Bar
		fs2=new ArrayList<>();
		x=10;
		y=10;
		x1=10;
		y1=10;
		n=0;
		//panel2 creation
		panel2=new ArrayList<>();
		
		//for creating array list
		pl=new ArrayList<>();
		pb=new ArrayList<>();
		//frame1 details 
		frame=new JFrame();
		frame2=new ArrayList<>();
		frame.setSize(1280,720);
		frame.getContentPane().setBackground(new Color(0x123456));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		//panel details
		panel1=new JPanel();
		panel1.setBackground(new Color(0x124563));
		panel1.setPreferredSize(new Dimension(900,1200));
		panel1.setLayout(null);

		//scroll bar details
		fs1=new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		fs1.setBounds(160,40,900,600);
		frame.add(fs1);
		//pi ImageIcon details
		image=new ImageIcon("plus.png");
		Image rp=image.getImage();
		rp=rp.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		image.setImage(rp);
		//plus button details
		plus=new JButton();
		plus.setBackground(new Color(0x123439));
		plus.setIcon(image);
		plus.setBounds(0,0,60,60);
		plus.addActionListener(this);
		
		//label details
		label=new JLabel();
		label.add(plus);
		panel1.add(label);
		label.setText("Add");
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10,10,60,150);
		label.setForeground(Color.WHITE);	
		b = 0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==plus)
		{
			//noft adding
			noft.add(0);
			//x2 and y2 text field
			x2.add(10);
			y2.add(45);
			//pi ImageIcon details
			pi=new ImageIcon("paper.png");
			Image rp=pi.getImage();
			rp=rp.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			pi.setImage(rp);
			//pb Button details(paper button)
			pb.add(new JButton());
			pb.get(n).setIcon(pi);
			//pl label details(paper label) 
			pl.add(new JLabel());
			pl.get(n).setText("Test "+(n+1));
			pl.get(n).setBounds(x1,y1,60,150);
			pl.get(n).setForeground(Color.WHITE);
			pl.get(n).add(pb.get(n));
			pb.get(n).setBounds(0,0,50,50);
			pb.get(n).addActionListener(this);
			panel1.add(pl.get(n));;
			//BACK BUTTON
			back=new JButton("Back");
			back.setBackground(new Color(0x123439));
			back.setForeground(Color.WHITE);
			back.setBounds(1080,600,100,50);
			//panel2 details
			panel2.add(new JPanel());
			panel2.get(n).setBackground(new Color(0x124563));
			panel2.get(n).setLayout(null);
			panel2.get(n).setPreferredSize(new Dimension(900,1200));
			//Scroll pane fs2
			fs2.add(new JScrollPane(panel2.get(n),JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
			fs2.get(n).setBounds(160,40,900,600);
			//frame2
			frame2.add(new JFrame());
			frame2.get(n).setSize(1280,720);
			frame2.get(n).setLayout(null);
			frame2.get(n).getContentPane().setBackground(new Color(0x123456));
			frame2.get(n).add(back);
			frame2.get(n).add(fs2.get(n));
			frame2.get(n).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//JTextField t1 in list of nest list
			t1.add(new ArrayList<JTextField>()); 
			subt1.add(new ArrayList<JTextField>());
			subt2.add(new ArrayList<JTextField>());
			subt3.add(new ArrayList<JTextField>());
			subt4.add(new ArrayList<JTextField>());
			subt5.add(new ArrayList<JTextField>());
						//add button details
			add1.add(new JButton());
			add1.get(n).setText("Add Person");
			add1.get(n).setBackground(new Color(0x123439));
			add1.get(n).setForeground(Color.WHITE);
			add1.get(n).setBounds(1100,100,100,50);
			frame2.get(n).add(add1.get(n));
			add1.get(n).addActionListener(this);
			back.addActionListener(new ActionListener()
					{
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							frame2.get(b).dispose();
							frame.setVisible(true);
							
							
						}
					});
			
			//position the pl.get(n)
			if (x<=700)
			{
				
				x=x+50;
			}
			else
			{
				x=10;
			}
			//position the label
			if (x1<=750)
			{
				x1=x1+60;
				label.setBounds(x1,y1,60,150);
				
			}
			else
			{
				y1=y1+100;
				x1=10;
				label.setBounds(x1,y1,60,150);
			}
			panel1.revalidate();
			panel1.repaint();
			n=n+1;
		}
		
		for (int i=0;i<n;i++)
		{
			if(e.getSource()==pb.get(i))
			{
				frame.dispose();
				frame2.get(i).setVisible(true);
				System.out.print(i);
				b=i;
			}
		}
		for (int i=0;i<n;i++)
		{
			if (e.getSource()==add1.get(i))
			{
				subt1.get(i).add(new JTextField());
				subt1.get(i).get(noft.get(i)).setBounds(180,y2.get(i),50,25);
				panel2.get(i).add(subt1.get(i).get(noft.get(i)));
				subt2.get(i).add(new JTextField());
				subt2.get(i).get(noft.get(i)).setBounds(250,y2.get(i),50,25);
				panel2.get(i).add(subt2.get(i).get(noft.get(i)));
				subt3.get(i).add(new JTextField());
				subt3.get(i).get(noft.get(i)).setBounds(320,y2.get(i),50,25);
				panel2.get(i).add(subt3.get(i).get(noft.get(i)));
				subt4.get(i).add(new JTextField());
				subt4.get(i).get(noft.get(i)).setBounds(390,y2.get(i),50,25);
				panel2.get(i).add(subt4.get(i).get(noft.get(i)));
				subt5.get(i).add(new JTextField());
				subt5.get(i).get(noft.get(i)).setBounds(460,y2.get(i),50,25);
				panel2.get(i).add(subt5.get(i).get(noft.get(i)));
				t1.get(i).add(new JTextField());
				t1.get(i).get(noft.get(i)).setBounds(x2.get(i),y2.get(i),150,25);;
				panel2.get(i).add(t1.get(i).get(noft.get(i)));
				noft.set(i,noft.get(i)+1);
				panel2.get(i).revalidate();
				panel2.get(i).repaint();
				y2.set(i,y2.get(i)+35);
				if(y2.get(i)>1100)
				{
					panel2.get(i).setPreferredSize(new Dimension(900,y2.get(i)+30));
				}
				
			}
		}
		
		
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtest a=new addtest();
		
	}

}
