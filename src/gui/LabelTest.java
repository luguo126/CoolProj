package gui;

import java.awt.*;
import javax.swing.*;


public class LabelTest extends JFrame{
	private static final long serialVersionUID = 7044644695928466691L;
	private JLabel label1, label2, label3;
	
	// set up gui
	public LabelTest() {
		super("Testing JLabel");
		
		// get content pane and set its layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		// JLabel constructor with a string argument
		label1 = new JLabel("label with text");
		label1.setToolTipText("This is label1");
		container.add(label1);
		
		// JLabel constructor with string, icon and alignment arguments
		Icon icon = new ImageIcon("image/girl.gif");
		label2 = new JLabel("label with text and icon", icon, SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		container.add(label2);
		
		// JLabel with no arguments
		label3 = new JLabel();
		label3.setText("label with text and text at bottom");
		label3.setIcon(icon);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		container.add(label3);
		
		setSize(360, 450);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		LabelTest app = new LabelTest();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
