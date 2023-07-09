import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LinearSearching extends JFrame {

	private JPanel contentPane;
	private JTextField tfb;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearching frame = new LinearSearching();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LinearSearching() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(149, 11, 150, 21);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("ENTER NUMBER TO SORT");
		labela.setForeground(new Color(0, 255, 255));
		labela.setFont(new Font("Times New Roman", Font.BOLD, 18));
		labela.setBounds(17, 74, 244, 21);
		contentPane.add(labela);
		
		JLabel labelb = new JLabel("ENTER KEY TO SEARCH");
		labelb.setForeground(Color.CYAN);
		labelb.setFont(new Font("Times New Roman", Font.BOLD, 18));
		labelb.setBounds(17, 120, 238, 21);
		contentPane.add(labelb);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBackground(new Color(255, 255, 0));
		ta1.setBounds(265, 74, 116, 22);
		contentPane.add(ta1);
		
		JButton jb1 = new JButton("LINEAR SEARCH");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				String key=tfb.getText();
				for(int i=0;i<arr.length;i++) {
					if(Integer.valueOf(arr[i])==Integer.valueOf(key)) {
						textField.setText("key found at index "+ i);
						return;
					}else {
						textField.setText("key not found");
					}
					
				}
				
			}	
		});
		jb1.setBackground(new Color(127, 255, 0));
		jb1.setForeground(new Color(255, 165, 0));
		jb1.setBounds(149, 218, 111, 23);
		contentPane.add(jb1);
		
		JLabel labelc = new JLabel("RESULT");
		labelc.setForeground(Color.CYAN);
		labelc.setFont(new Font("Times New Roman", Font.BOLD, 18));
		labelc.setBounds(90, 167, 73, 21);
		contentPane.add(labelc);
		
		tfb = new JTextField();
		tfb.setBackground(new Color(255, 255, 0));
		tfb.setBounds(265, 122, 116, 23);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 0));
		textField.setBounds(182, 169, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
