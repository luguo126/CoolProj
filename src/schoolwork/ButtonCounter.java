package schoolwork;

import javax.swing.*;
import java.awt.*;


public class ButtonCounter extends JFrame
{
	
	private static final long serialVersionUID = -3205298211347692997L;

	public ButtonCounter() {
		super("显示按钮窗口");
		
		ImageIcon icon = new ImageIcon("./img.jpg");

		// JButton jbt1 = new JButton("menu", icon);
		java.awt.Button jbt1= new java.awt.Button("menu");
		JButton jbt2 = new JButton("menu", icon);
		JButton jbt3 = new JButton("menu", icon);
		JButton jbt4 = new JButton("menu", icon);
		JButton jbt5 = new JButton("menu", icon);
		
		JPanel p1 = new JPanel();
		p1.add(jbt1);
		JPanel p2 = new JPanel();
		p2.add(jbt2);
		JPanel p3 = new JPanel();
		p3.add(jbt3);
		JPanel p4 = new JPanel();
		p4.add(jbt4);
		JPanel p5 = new JPanel();
		p5.add(jbt5);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(p1);
		getContentPane().add(p2);
		getContentPane().add(p3);
		getContentPane().add(p4);
		getContentPane().add(p5);
	}

	public static void main(String[] args) {
		JFrame frame = new ButtonCounter();
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}