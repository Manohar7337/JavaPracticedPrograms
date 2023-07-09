import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ReverseString extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseString frame = new ReverseString();
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
	public ReverseString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("REVERSE STRING");
		heading.setFont(new Font("Tahoma", Font.BOLD, 20));
		heading.setForeground(new Color(255, 69, 0));
		heading.setBounds(100, 11, 221, 28);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("ENTER A STRING");
		labela.setFont(new Font("Tahoma", Font.BOLD, 18));
		labela.setForeground(new Color(255, 69, 0));
		labela.setBounds(35, 65, 197, 17);
		contentPane.add(labela);
		
		JLabel labelb = new JLabel("REVERSED STRING");
		labelb.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelb.setForeground(new Color(255, 69, 0));
		labelb.setBounds(35, 169, 182, 23);
		contentPane.add(labelb);
		
		JButton btnReverseString = new JButton("REVERSE STRING");
		btnReverseString.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnReverseString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText(); 
				char arr1[]=data1.toCharArray(); 
				char arr2[]=new char[arr1.length]; 
				int j=arr1.length-1; 
				String res=""; 
				for(int i=arr1.length-1;i>=0;i-- ) 
				{ 
				arr2[j]=arr1[i]; 
				res=res+arr2[j]; 
				j--; 
				} 
				tfb.setText(res); 
			}
		});
		btnReverseString.setForeground(new Color(0, 0, 255));
		btnReverseString.setBounds(116, 120, 205, 23);
		contentPane.add(btnReverseString);
		
		tfa = new JTextField();
		tfa.setBounds(250, 62, 119, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(250, 173, 119, 20);
		contentPane.add(tfb);
	}

}
