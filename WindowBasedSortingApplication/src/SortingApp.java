import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortingApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingApp frame = new SortingApp();
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
	public SortingApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SORTING");
		heading.setForeground(Color.RED);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 17));
		heading.setBounds(210, 11, 79, 21);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("Enter Numbers Before Sorting");
		labela.setForeground(Color.MAGENTA);
		labela.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		labela.setBounds(39, 73, 220, 19);
		contentPane.add(labela);
		
		JLabel labelb = new JLabel("Enter Numbers After Sorting");
		labelb.setForeground(Color.MAGENTA);
		labelb.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		labelb.setBounds(39, 141, 220, 19);
		contentPane.add(labelb);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(278, 72, 120, 22);
		contentPane.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(278, 140, 120, 22);
		contentPane.add(ta2);
		
		JButton jb1 = new JButton("BubbleSort");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				String help;
				String result="";
				for(int i=0;i<=arr.length-2;i++) {
					for(int j=0;j<arr.length-2-i;j++) {
						if(Integer.valueOf(arr[i])>Integer.valueOf(arr[j+1])) {
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
					
				}
				for(int i=0;i<=arr.length-1;i++) {
					result =result+arr[i]+" ";
				}
				ta2.setText(result);
			}
		});
		jb1.setForeground(Color.GRAY);
		jb1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		jb1.setBounds(170, 198, 107, 27);
		contentPane.add(jb1);
	}
}
