package SKILLBUILDERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MetricConversion {

	private JFrame frame;
	private JTextField FS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 862, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Display = new JLabel("");
		Display.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
			 
			}
		});
		Display.setBounds(50, 172, 233, 97);
		panel.add(Display);
		
		JComboBox Metric = new JComboBox();
		Metric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			 if(Metric.getSelectedItem().equals("1 Inch = 2.54 Centimeters"))
			 {
				 String n = FS.getText();
				 double Num = Double.parseDouble(n);
				 double answer = Num * 2.54;
				 
				 Display.setText(Num + " inches converted to cm is "+ answer + " cm");
			 }
			
			
			}
		});
		Metric.setModel(new DefaultComboBoxModel(new String[] {"Click here ", "1 Inch = 2.54 Centimeters ", "1 foot = 0.3084"}));
		Metric.setBounds(295, 11, 217, 60);
		panel.add(Metric);
		
		FS = new JTextField();
		FS.setText("Enter Number here");
		FS.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(FS.getText().equals("Enter Number here"))
				{ 
					FS.setText(null);
				}
			}
		});
		FS.setBounds(128, 100, 337, 61);
		panel.add(FS);
		FS.setColumns(10);
		
		
	}
}
