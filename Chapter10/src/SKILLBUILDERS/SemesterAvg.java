package SKILLBUILDERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JLabel;

public class SemesterAvg {

	private JFrame frame;
	private JTextField FirstG;
	private JTextField SecondG;
	private JTextField ThirdG;
	private final JLabel Average = new JLabel("Your average is ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		FirstG = new JTextField();
		FirstG.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(FirstG.getText().equals("Enter first grade"))
				{
					FirstG.setText(""); 
				}
			}
		
		});
		FirstG.setFont(new Font("Tahoma", Font.BOLD, 15));
		FirstG.setText("Enter first grade");
		FirstG.setBounds(54, 21, 175, 32);
		panel.add(FirstG);
		FirstG.setColumns(10);
		
		SecondG = 
				new JTextField();
		SecondG.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) { 
				if(SecondG.getText().equals("Enter second grade"))
			{
				SecondG.setText(""); 
			}
			}
		});
		SecondG.setFont(new Font("Tahoma", Font.BOLD, 15));
		SecondG.setText("Enter second grade");
		SecondG.setColumns(10);
		SecondG.setBounds(54, 64, 175, 32);
		panel.add(SecondG);
		
		Average.setBounds(54, 150, 370, 83);
		panel.add(Average);
		
		ThirdG = new JTextField();
		ThirdG.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(ThirdG.getText().equals("Enter third grade"))
				{
					ThirdG.setText(""); 
				}
			}
		});
		ThirdG.setFont(new Font("Tahoma", Font.BOLD, 15));
		ThirdG.setText("Enter third grade");
		ThirdG.setColumns(10);
		ThirdG.setBounds(54, 107, 175, 32);
		panel.add(ThirdG);
		
		JButton Submit = new JButton("Calculate Average");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String g1 = FirstG.getText();
				String g2 = SecondG.getText();
				String g3 = ThirdG.getText();
				
				double g11 = Double.parseDouble(g1);
				double g12 = Double.parseDouble(g2);
				double g13 = Double.parseDouble(g3);
				
				double avg = (g11 + g12 + g13)/3; 
				
				DecimalFormat dc = new DecimalFormat("0.0");
				
				
				
				Average.setText("Average: "+ dc.format(avg));
			}
		});
		Submit.setFont(new Font("Arial", Font.BOLD, 12));
		Submit.setBounds(280, 21, 144, 118);
		panel.add(Submit);
		
	
	}
}
