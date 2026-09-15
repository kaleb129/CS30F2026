package SKILLBUILDERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class classdemo {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classdemo window = new classdemo();
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
	public classdemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		FN = new JTextField();
		FN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
				if(FN.getText().equals("Enter your first name"))
				{
					FN.setText(""); 
				}
			}
			
		});
		FN.setText("Enter your first name");
		FN.setBounds(27, 39, 178, 43);
		panel.add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(LN.getText().equals("Enter your last name"))
				{
					LN.setText(""); 
				}
			
			
			}
		});
		LN.setText("Enter your last name");
		LN.setColumns(10);
		LN.setBounds(246, 39, 178, 43);
		panel.add(LN);
		
		JLabel Display = new JLabel("");
		Display.setBounds(27, 168, 397, 58);
		panel.add(Display);
		
		
		
		JButton Submit = new JButton("Submit");
		Submit.setFont(new Font("Tahoma", Font.BOLD, 17));
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Firstn = FN.getText();
				String Lastn = LN.getText();
				
				Display.setText(Firstn + " " + Lastn);
				
			}
			
		});
		Submit.setBounds(588, 39, 112, 211);
		panel.add(Submit);
		
		
	}
}
