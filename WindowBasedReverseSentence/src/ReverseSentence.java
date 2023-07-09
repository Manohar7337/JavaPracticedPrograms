import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseSentence extends JFrame {

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
					ReverseSentence frame = new ReverseSentence();
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
	public ReverseSentence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labela = new JLabel("REVERSE WORDS OF SENTENCE");
		labela.setFont(new Font("Tahoma", Font.BOLD, 20));
		labela.setForeground(new Color(255, 0, 255));
		labela.setBounds(81, 11, 321, 25);
		contentPane.add(labela);
		
		JLabel lblEnterASentnce = new JLabel("ENTER A SENTNCE");
		lblEnterASentnce.setForeground(new Color(85, 107, 47));
		lblEnterASentnce.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterASentnce.setBounds(10, 72, 178, 25);
		contentPane.add(lblEnterASentnce);
		
		JLabel lblEnterASentnce_1 = new JLabel("ENTER A SENTNCE");
		lblEnterASentnce_1.setForeground(new Color(85, 107, 47));
		lblEnterASentnce_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterASentnce_1.setBounds(10, 205, 178, 25);
		contentPane.add(lblEnterASentnce_1);
		
		tfa = new JTextField();
		tfa.setBounds(225, 77, 177, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(225, 210, 177, 20);
		contentPane.add(tfb);
		
		JButton btnReverseSentence = new JButton("REVERSE SENTENCE");
		btnReverseSentence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=tfa.getText();
				String arr[]=sentence.split(" ");
				String revsent="";
				String word;
				for(int i=0;i<=arr.length-1;i++) 
				{ 
				word=arr[i]; 
				String revword=""; 
				for(int j=word.length()-1;j>=0;j--) 
				{ 
				revword=revword+word.charAt(j); 
				} 
				revsent=revsent+revword+" "; 
				} 
				tfb.setText(revsent); 

			}
		});
		btnReverseSentence.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReverseSentence.setForeground(new Color(255, 0, 0));
		btnReverseSentence.setBackground(new Color(0, 255, 255));
		btnReverseSentence.setBounds(163, 130, 198, 25);
		contentPane.add(btnReverseSentence);
	}

}
