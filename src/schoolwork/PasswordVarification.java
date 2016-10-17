package schoolwork;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class PasswordVarification
	extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JLabel userLabel;
	JLabel passwordLabel;
	JTextField userText;
	JPasswordField passwordText;
	
	int count = 1;
	
	public PasswordVarification() {
		super("请输入信息");
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		userLabel = new JLabel("user");
		passwordLabel = new JLabel("pwd");
		userText = new JTextField(16);
		passwordText = new JPasswordField(16);
		
		passwordText.setEchoChar('#');
		passwordText.addActionListener(this);
		
		container.add(userLabel);
		container.add(userText);
		container.add(passwordLabel);
		container.add(passwordText);
		
		setSize(240, 100);
		setVisible(true);
	}  // end constructor

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String userName = new String("陈三");
		String password = new String("123456");
		
		if(e.getSource() == passwordText) {
			count++;
			char[] passwords = passwordText.getPassword();
			if(userText.getText().equals(userName)
					&& password.equals(new String(passwords))) {
				JOptionPane.showMessageDialog(null, "欢迎 " + userName);
				System.exit(0);
			}else if(count > 3) {
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null, userText.getText()
						+ "请输入正确的信息!");
			}
		}  
	}	
	
	public static void main(String[] args) {
		PasswordVarification pv = 
					new PasswordVarification();
		// System.exit(0);
		pv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // end main
	
}













