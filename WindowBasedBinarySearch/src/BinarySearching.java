import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BinarySearching extends JFrame {

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
					BinarySearching frame = new BinarySearching();
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
	public BinarySearching() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("BINARY SEARCH");
		heading.setForeground(new Color(255, 0, 0));
		heading.setBounds(168, 11, 158, 24);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("ENTER NUMBERS TO SEARCH");
		labela.setForeground(new Color(0, 255, 255));
		labela.setBounds(10, 63, 196, 20);
		contentPane.add(labela);
		
		JLabel labelb = new JLabel("ENTER KEY TO SEARCH");
		labelb.setForeground(Color.CYAN);
		labelb.setBounds(10, 109, 184, 20);
		contentPane.add(labelb);
		
		JLabel labelc = new JLabel("RESULT");
		labelc.setForeground(Color.CYAN);
		labelc.setBounds(36, 159, 96, 19);
		contentPane.add(labelc);
		
		JButton btnBinarySearch = new JButton("BINARY SEARCH");
		btnBinarySearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data1=tfa.getText(); 
				String arr[]=data1.split(" "); 
				String data2=tfb.getText(); 
				String result=""; 
				for(int i=0;i<=arr.length-1;i++) 
				{ 
				int low=0; 
				int high=arr.length-1; 
				while(low<=high) 
				{ 
				int mid=(low+high)/2; 
				if(Integer.valueOf(data2)==Integer.valueOf(arr[mid])) 
				{ 
				result="search success @ "+mid; 
				tfr.setText(result); 
				return; 
				} 
				else if(Integer.valueOf(data2)>Integer.valueOf(arr[mid])) 
				{ 
				low=mid+1; 
				high=high; 
				} 
				else
				{ 
				low=low; 
				high=mid-1; 
				} 
				} 
				} 
				result="key is not found"; 
				tfr.setText(result); 
				 
			}
		});
		btnBinarySearch.setBackground(new Color(255, 0, 0));
		btnBinarySearch.setBounds(149, 210, 138, 23);
		contentPane.add(btnBinarySearch);
		
		tfa = new JTextField();
		tfa.setBounds(228, 63, 138, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(228, 109, 138, 20);
		contentPane.add(tfb);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(228, 158, 138, 20);
		contentPane.add(tfr);
	}

}
