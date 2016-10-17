package schoolwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardManager extends JFrame {

	private static final long serialVersionUID = -7575545546031573512L;
	JLabel nameLabel, sexLabel, titleLabel, unitLabel;
	JLabel addressLabel, telLabel1, telLabel2, mobileLabel, faxLabel, emailLabel;
	JTextField nameTxt, unitTxt, addressTxt;
	JTextField telTxt1, telTxt2, mobileTxt, faxTxt, emailTxt;
	JRadioButton sexBtn1, sexBtn2;
	@SuppressWarnings("rawtypes")
	JComboBox titleBx;
	JButton okBtn, cancelBtn;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CardManager() {
		super("名片录入管理");
		Container container = getContentPane();
	
		JPanel centerPanel = new JPanel();
		
		nameLabel = new JLabel("姓名");
		nameTxt = new JTextField(10);
		centerPanel.add(nameLabel);
		centerPanel.add(nameTxt);
		
		sexLabel = new JLabel("性别");
		sexBtn1 = new JRadioButton("男");
		sexBtn2 = new JRadioButton("女");
		ButtonGroup group = new ButtonGroup();
		group.add(sexBtn1);
		group.add(sexBtn2);
		centerPanel.add(sexBtn1);
		centerPanel.add(sexBtn2);
		centerPanel.add(sexLabel);
		
		titleLabel = new JLabel("称谓");
		String title[] = {"总裁", "总经理",
				"主任", "处长", "院长", "科长", "校长", "教授", "讲师"};
		titleBx = new JComboBox(title);
		titleBx.setMaximumRowCount(5);
		centerPanel.add(titleLabel);
		centerPanel.add(titleBx);
		
		unitLabel = new JLabel("工作单位");
		unitTxt = new JTextField(12);
		centerPanel.add(unitLabel);
		centerPanel.add(unitTxt);
		
		addressLabel = new JLabel("工作地址");
		addressTxt = new JTextField(12);
		centerPanel.add(addressLabel);
		centerPanel.add(addressTxt);
		
		telLabel1 = new JLabel("电话");
		telLabel2 = new JLabel("电话");
		telTxt1 = new JTextField(12);
		telTxt2 = new JTextField(12);
		centerPanel.add(telLabel1);
		centerPanel.add(telLabel2);
		centerPanel.add(telTxt1);
		centerPanel.add(telTxt2);
		
		mobileLabel = new JLabel("手机");
		mobileTxt = new JTextField(12);
		centerPanel.add(mobileLabel);
		centerPanel.add(mobileTxt);
		
		faxLabel = new JLabel("传真");
		faxTxt = new JTextField(12);
		centerPanel.add(mobileLabel);
		centerPanel.add(mobileTxt);
		
		emailLabel = new JLabel("e-mail");
		emailTxt = new JTextField(12);
		centerPanel.add(emailLabel);
		centerPanel.add(emailTxt);
		
		JPanel sPanel = new JPanel();
		okBtn = new JButton("确定");
		cancelBtn = new JButton("取消");
		
		cancelBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == cancelBtn) {
					System.exit(0);
				}
			}
		});
		
		sPanel.add(okBtn);
		sPanel.add(cancelBtn);
		
		container.setLayout(new GridLayout());
		//container.setLayout(new FlowLayout());
		
		container.add(centerPanel, CENTER_ALIGNMENT);
		container.add(sPanel, BOTTOM_ALIGNMENT);
		
		
		setSize(400, 350);
		// pack();
		setVisible(true);
	} // end constructor
	
	
	public static void main(String[] args) {
		CardManager app = new CardManager();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}








