package gui;


import javax.swing.*;
import javax.swing.event.*;

public class TestTexts extends JFrame {

private JLabel label = new JLabel("Status");
private JTextField textField;
private JPasswordField pwdField;
private JTextArea textArea;

public TestTexts() {
super("Test Texts");
setDefaultCloseOperation(EXIT_ON_CLOSE);
getContentPane().setLayout(new java.awt.FlowLayout());

textField = new JTextField(15);
/* 监听文本光标移动事件 */
textField.addCaretListener(
		new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				// 如果改变了内容，就可以即时更新 label 显示的内容
				label.setText(textField.getText());
			}
		});

pwdField = new JPasswordField(15);
pwdField.setEchoChar('#');

textArea = new JTextArea(5, 15);
textArea.setLineWrap(true);

getContentPane().add(textField);
getContentPane().add(pwdField);
getContentPane().add(textArea);
getContentPane().add(label);

setSize(200, 200);
}

@SuppressWarnings("deprecation")
public static void main(String[] args) {
	TestTexts tt = new TestTexts();
	tt.show();
}
}