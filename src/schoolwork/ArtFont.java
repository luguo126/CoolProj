package schoolwork;

//ArtFont.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArtFont extends JFrame implements ActionListener {
	JComboBox fontType, fontSize;
	JCheckBox boldBx;		// 粗体按钮
	JCheckBox italicBx;		// 斜体按钮
	JButton colorBtn;		// 颜色按钮；
	
	String[] fontNames;		// 字体名称;
	String[] fontSizes;		// 字体尺寸；
	
	JLabel label;// 输入提示标签；
	JTextField inputText;// 文字输入框；
	JTextArea txtArea;// 文字显示区;
	JPanel fontPanel;// 字体设置；
	JPanel showPanel;// 显示效果区
	
	Font font;
	int boldStyle, italicStyle, underlineStyle;
	int fontSizeStyle;
	String fontNameStyle;
	Color colorStyle = Color.black;// 设置字体的默认颜色为黑色;
	
	
	public ArtFont() {
		super("字体设置");
		boldStyle = 0;
		italicStyle = 0;
		underlineStyle = 0;
		fontSizeStyle = 10;
		fontNameStyle = "宋体";
		
		font = new Font(fontNameStyle,
				boldStyle + italicStyle, fontSizeStyle);
		
		fontPanel = new JPanel();
		fontPanel.setLayout(new FlowLayout());
		GraphicsEnvironment ge = 
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontNames = ge.getAvailableFontFamilyNames();
		
		fontType = new JComboBox(fontNames);
		fontType.setEditable(false);
		fontType.setMaximumRowCount(10);
		fontType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					fontNameStyle = (e.getItem().toString());
					font = new Font(fontNameStyle,
							boldStyle + italicStyle, fontSizeStyle);
					txtArea.setFont(font);
				}
			}
		});
		
		//设置字体大小
		fontSizes = new String[63];
		for(int i = 0; i < 63; i++) {
			fontSizes[i] = Integer.toString(i + 10);
		}
		fontSize = new JComboBox(fontSizes);
		fontSize.setEditable(false);
		fontSize.setMaximumRowCount(10);
		fontSize.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
			/*	if(e.getSource() == fontSize){
					System.out.println("字体大小");
				}
			*/
				if(e.getStateChange() == ItemEvent.SELECTED) {
					fontSizeStyle = Integer.parseInt(e.getItem().toString());
					font = new Font(fontNameStyle,
							boldStyle + italicStyle, fontSizeStyle);
					txtArea.setFont(font);
				}
			}
		});
		
		// 设置粗体选择按钮
		boldBx = new JCheckBox("粗体");
		boldBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource() == boldBx){
					if(e.getStateChange() == ItemEvent.SELECTED){
						boldStyle = Font.BOLD;
						font = new Font(fontNameStyle,
							boldStyle + italicStyle, fontSizeStyle);
						txtArea.setFont(font);
					}else if(e.getStateChange() == ItemEvent.DESELECTED){
						boldStyle = 0;
						font = new Font(fontNameStyle,
							boldStyle + italicStyle, fontSizeStyle);
						txtArea.setFont(font);
					}
				}
			}
		});
		
		// 设置斜体选择按钮
		italicBx = new JCheckBox("斜体");
		italicBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource() == italicBx) {
					if(e.getStateChange() == ItemEvent.SELECTED){
						italicStyle = Font.ITALIC;
						font = new Font(fontNameStyle,
							boldStyle + italicStyle, fontSizeStyle);
						txtArea.setFont(font);
					}else if(e.getStateChange() == ItemEvent.DESELECTED){
						italicStyle = 0;
						font = new Font(fontNameStyle,
							boldStyle + italicStyle, fontSizeStyle);
						txtArea.setFont(font);
					}
				}
			}
		});
		
		// 设置颜色选择
		colorBtn = new JButton("颜色");
		colorBtn.addActionListener(this);
		
		// 设置字体面板
		fontPanel.add(fontType);
		fontPanel.add(fontSize);
		fontPanel.add(boldBx);
		fontPanel.add(italicBx);
		fontPanel.add(colorBtn);
		
		// 设置输入提示标签
		label = new JLabel("输入");
		
		//设置文本输入款
		inputText = new JTextField(12);
		inputText.addActionListener(this);
		
		//设置文本显示区域
		txtArea = new JTextArea(10, 40);
		txtArea.setFont(font);
		
		
		//设置文本面板
		showPanel = new JPanel();
		showPanel.add(label);
		showPanel.add(inputText);
		showPanel.setLayout(new FlowLayout());
		showPanel.add(new JScrollPane(txtArea));
		
		// 设置容器
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(fontPanel, BorderLayout.NORTH);
		container.add(showPanel, BorderLayout.CENTER);
		
		setSize(550, 260);
		setVisible(true);
	} // end constructor
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == colorBtn) {
			colorStyle = 
					JColorChooser.showDialog(this, "选择字体颜色", colorStyle);
			colorBtn.setForeground(colorStyle);
			txtArea.setForeground(colorStyle);
		} else if(e.getSource() == inputText) {
			txtArea.setText(inputText.getText());
		}
	}
	
	public static void main(String[] args) {
		ArtFont app = new ArtFont();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}










