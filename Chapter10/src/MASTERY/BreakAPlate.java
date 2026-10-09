package MASTERY;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon pall = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\PlatesAll.gif");
		ImageIcon p2 = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\plates2broken.gif");
		ImageIcon p3 = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\platesallbroken.gif");
		ImageIcon placeholder = new ImageIcon("/Chapter10/src/MASTERY/placeholder.gif");
		ImageIcon tiger = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\tiger_plush.gif");
		ImageIcon sticker = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\sticker.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 767, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JLabel plates;
		
		plates = new JLabel("");
		plates.setBounds(189, 60, 310, 85);
		panel.add(plates);
		plates.setIcon(pall);
		
		JLabel prize = new JLabel("");
		prize.setBounds(315, 316, 90, 71);
		panel.add(prize);
		
		
		
		JButton PLAY = new JButton("PLAY");
		PLAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			 int number; 
			 	number = (int)(3 * Math.random() + 1);
			 	
			 	PLAY.setText("Play again"); 
			 	
			 	if(number == 1)
			 	{
			 		plates.setIcon(p2);
			 		prize.setIcon(sticker);
			 		
			 	}
			 	
			 	if(number == 3)
			 	{
			 		plates.setIcon(p3);
			 		prize.setIcon(tiger);
			 		
			 	}
			 	
			 	if(number == 2)
			 	{
			 		plates.setIcon(p2);
			 		prize.setIcon(sticker);
			 		
			 	}
			 	
			 
			
			}
		});
		PLAY.setFont(new Font("Arial", Font.PLAIN, 47));
		PLAY.setBounds(189, 201, 351, 71);
		panel.add(PLAY);
		
	
		
		
	}
}
