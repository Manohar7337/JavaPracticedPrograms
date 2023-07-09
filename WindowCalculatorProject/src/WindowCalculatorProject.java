import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowCalculatorProject extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCalculatorProject frame = new WindowCalculatorProject();
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
	public WindowCalculatorProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jb1 = new JButton("1");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb1.getText();
				tf.setText(number);
				}
		});
		jb1.setBounds(26, 78, 57, 32);
		contentPane.add(jb1);
		
		JButton jb2 = new JButton("2");
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb2.getText();
				tf.setText(number);
			}
		});
		jb2.setBounds(93, 78, 57, 32);
		contentPane.add(jb2);
		
		JButton jb3 = new JButton("3");
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb3.getText();
				tf.setText(number);
			}
		});
		jb3.setBounds(160, 78, 57, 32);
		contentPane.add(jb3);
		
		JButton jb4 = new JButton("4");
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb4.getText();
				tf.setText(number);
			}
		});
		jb4.setBounds(26, 123, 57, 32);
		contentPane.add(jb4);
		
		JButton jb5 = new JButton("5");
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb5.getText();
				tf.setText(number);
			}
		});
		jb5.setBounds(93, 123, 57, 32);
		contentPane.add(jb5);
		
		JButton jb6 = new JButton("6");
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb6.getText();
				tf.setText(number);
			}
		});
		jb6.setBounds(160, 121, 57, 32);
		contentPane.add(jb6);
		
		JButton jb7 = new JButton("7");
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb7.getText();
				tf.setText(number);
			}
		});
		jb7.setBounds(26, 166, 57, 32);
		contentPane.add(jb7);
		
		JButton jb8 = new JButton("8");
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb8.getText();
				tf.setText(number);
			}
		});
		jb8.setBounds(93, 166, 57, 32);
		contentPane.add(jb8);
		
		JButton jb9 = new JButton("9");
		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb9.getText();
				tf.setText(number);
			}
		});
		jb9.setBounds(160, 166, 57, 32);
		contentPane.add(jb9);
		JButton jb00 = new JButton("0");
		jb00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jb00.getText();
				tf.setText(number);
			}
		});
		jb00.setBounds(26, 209, 57, 32);
		contentPane.add(jb00);
		
		JButton jbDot = new JButton(".");
		jbDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=tf.getText()+jbDot.getText();
				tf.setText(number);
			}
		});
		jbDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbDot.setBounds(93, 209, 57, 32);
		contentPane.add(jbDot);
		
		JButton jbPercentile = new JButton("%");
		jbPercentile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="%";
			}
		});
		jbPercentile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbPercentile.setBounds(160, 209, 57, 32);
		contentPane.add(jbPercentile);
		
		JButton jbMultiply = new JButton("*");
		jbMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="*";
			}
		});
		jbMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbMultiply.setBounds(227, 120, 57, 32);
		contentPane.add(jbMultiply);
		
		JButton jbMinus = new JButton("-");
		jbMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="-";
			}
		});
		jbMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbMinus.setBounds(227, 163, 57, 32);
		contentPane.add(jbMinus);
		
		JButton jbPlus = new JButton("+");
		jbPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="+";
			}
		});
		jbPlus.setFont(new Font("Tahoma", Font.BOLD, 17));
		jbPlus.setBounds(227, 206, 57, 32);
		contentPane.add(jbPlus);
		
		JButton jbEqualsTo = new JButton("=");
		jbEqualsTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(tf.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					tf.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					tf.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					tf.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					tf.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					tf.setText(answer);
				}
			}
		});
		jbEqualsTo.setForeground(new Color(0, 191, 255));
		jbEqualsTo.setBackground(new Color(0, 255, 0));
		jbEqualsTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbEqualsTo.setBounds(294, 160, 57, 81);
		contentPane.add(jbEqualsTo);
		
		JButton jbDiv = new JButton("/");
		jbDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				tf.setText("");
				operation="/";
			}
		});
		jbDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbDiv.setBounds(227, 78, 57, 32);
		contentPane.add(jbDiv);
		
		tf = new JTextField();
		tf.setColumns(10);
		tf.setBounds(26, 11, 329, 56);
		contentPane.add(tf);
		
		JButton jbBSP = new JButton("BackSpace");
		jbBSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace=null;
				if(tf.getText().length()>0) {
					 StringBuilder str=new StringBuilder(tf.getText());
					 str.deleteCharAt(tf.getText().length()-1);
					 BackSpace=str.toString();
					 tf.setText(BackSpace);
				}
			}
		});
		jbBSP.setForeground(Color.RED);
		jbBSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jbBSP.setBounds(294, 78, 120, 31);
		contentPane.add(jbBSP);
		
		JButton jbClear = new JButton("ClearScreen");
		jbClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(null);
			}
		});
		jbClear.setForeground(Color.RED);
		jbClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jbClear.setBounds(294, 122, 120, 31);
		contentPane.add(jbClear);
	}
}
