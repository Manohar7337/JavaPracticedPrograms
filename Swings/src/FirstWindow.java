import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("CALCULATOR");
		heading.setForeground(Color.RED);
		heading.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		heading.setBounds(164, 11, 115, 21);
		contentPane.add(heading);

		JLabel labela = new JLabel("A");
		labela.setForeground(Color.RED);
		labela.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labela.setBounds(119, 59, 9, 19);
		contentPane.add(labela);

		tfa = new JTextField();
		tfa.setBounds(164, 60, 96, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);

		JLabel labelb = new JLabel("B");
		labelb.setForeground(Color.RED);
		labelb.setFont(new Font("Century", Font.PLAIN, 17));
		labelb.setBounds(119, 102, 13, 21);
		contentPane.add(labelb);

		tfb = new JTextField();
		tfb.setBounds(164, 105, 96, 20);
		contentPane.add(tfb);
		tfb.setColumns(10);

		JLabel labelres = new JLabel("RESULT");
		labelres.setForeground(Color.RED);
		labelres.setFont(new Font("Century", Font.PLAIN, 16));
		labelres.setBounds(86, 153, 68, 20);
		contentPane.add(labelres);

		tfr = new JTextField();
		tfr.setBounds(164, 155, 96, 20);
		contentPane.add(tfr);
		tfr.setColumns(10);

		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for addition
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int var1 = Integer.valueOf(data1);// by using wrapper class we can convert String to int
				int var2 = Integer.valueOf(data2);
				int res = var1 + var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		add.setForeground(Color.RED);
		add.setBounds(20, 208, 74, 23);
		contentPane.add(add);

		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for substraction
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int val1 = Integer.valueOf(data1);
				int val2 = Integer.valueOf(data2);
				int res = val1 - val2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		sub.setForeground(Color.RED);
		sub.setBounds(104, 208, 67, 23);
		contentPane.add(sub);

		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for multiplycation
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				int res = var1 * var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		mul.setForeground(Color.RED);
		mul.setBounds(181, 208, 68, 23);
		contentPane.add(mul);

		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for divison
				int var1 = Integer.valueOf(tfa.getText());// code modified
				int var2 = Integer.valueOf(tfb.getText());
				int res = var1 / var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		div.setForeground(Color.RED);
		div.setBounds(269, 208, 67, 23);
		contentPane.add(div);

		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for reminder
				int var1 = Integer.valueOf(tfa.getText());// code modified
				int var2 = Integer.valueOf(tfb.getText());
				String result = String.valueOf(var1 % var2);// code modified
				tfr.setText(result);
			}
		});
		rem.setForeground(Color.RED);
		rem.setBounds(346, 208, 68, 23);
		contentPane.add(rem);
	}
}
