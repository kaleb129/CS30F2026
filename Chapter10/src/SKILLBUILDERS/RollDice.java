package SKILLBUILDERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RollDice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RollDice window = new RollDice();
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
	public RollDice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon die1 = new ImageIcon("../Chapter10/src/SKILLBUILDERS/die1.gif");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/SKILLBUILDERS/die2.gif");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/SKILLBUILDERS/die3.gif");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/SKILLBUILDERS/die4.gif");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/SKILLBUILDERS/die5.gif");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/SKILLBUILDERS/die6.gif");
		
		
				
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel dieface = new JLabel("");
		dieface.setBounds(90, 120, 121, 114);
		panel.add(dieface);
		
		JLabel dieface2 = new JLabel("");
		dieface2.setBounds(270, 120, 121, 114);
		panel.add(dieface2);
		
		JButton roll = new JButton("Roll die ");
		roll.setFont(new Font("Tempus Sans ITC", Font.BOLD, 27));
		roll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieface.setIcon(die1);
				}
				else	if(newRoll == 2)
				{
					dieface.setIcon(die2);
				}
				else if(newRoll == 3)
				{
					dieface.setIcon(die3);
				}
				else if(newRoll == 4)
				{
					dieface.setIcon(die4);
				}
				else if(newRoll == 5)
				{
					dieface.setIcon(die5);
				}
				else if(newRoll == 6)
				{
					dieface.setIcon(die6);
				}
newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1)
				{
					dieface2.setIcon(die1);
				}
				else	if(newRoll2 == 2)
				{
					dieface2.setIcon(die2);
				}
				else if(newRoll2 == 3)
				{
					dieface2.setIcon(die3);
				}
				else if(newRoll2 == 4)
				{
					dieface2.setIcon(die4);
				}
				else if(newRoll2 == 5)
				{
					dieface2.setIcon(die5);
				}
				else if(newRoll2 == 6)
				{
					dieface2.setIcon(die6);
				}
			}
		});
		roll.setBounds(173, 11, 813, 114);
		panel.add(roll);
		
		
		
	
		
		
		
		
	}
}
