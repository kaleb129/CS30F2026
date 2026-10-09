package MASTERY;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class school {

	private JFrame frame;
	private JTextField fname;
	private JTextField lname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					school window = new school();
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
	public school() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon abe = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\abe.jpg");
		ImageIcon chhs = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\CHHS.jpg");
		ImageIcon west = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\western.png");
		ImageIcon nt = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\northtrail.png");
		ImageIcon fran = new ImageIcon("C:\\Users\\49052003\\git\\CS30F2026\\Chapter10\\src\\MASTERY\\stfrancis.jpg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 864, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JComboBox grade = new JComboBox();
		grade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		grade.setModel(new DefaultComboBoxModel(new String[] {"Enter your grade", "10", "11", "12"}));
		grade.setBounds(90, 147, 121, 22);
		panel.add(grade);
		
		JComboBox school = new JComboBox();
		school.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		school.setModel(new DefaultComboBoxModel(new String[] {"Enter your school", "Crescent Heights", "Western", "Aberhart", "North Trail", "Francis"}));
		school.setBounds(311, 147, 121, 22);
		panel.add(school);
		
		JLabel slogo = new JLabel("New label");
		slogo.setBounds(90, 317, 138, 118);
		panel.add(slogo);
		
		fname = new JTextField();
		fname.addKeyListener(new KeyAdapter() {
			
			
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(fname.getText().equals("Enter first name"))
				{
					fname.setText(""); 
				}
			}
		});
		fname.setText("Enter first name");
		fname.setBounds(70, 58, 141, 20);
		panel.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(lname.getText().equals("Enter last name"))
				{
					lname.setText(""); 
				}
			}
		});
		lname.setText("Enter last name");
		lname.setColumns(10);
		lname.setBounds(294, 58, 138, 20);
		panel.add(lname);
		
		JLabel person = new JLabel("New label");
		person.setBounds(90, 228, 342, 78);
		panel.add(person); 
		
		
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fn = fname.getText();
				String ln = lname.getText();
				Object gr = grade.getSelectedItem();
				Object schl = school.getSelectedItem();
				
				person.setText(fn + ln + " is in grade "+ gr  + schl);
				
		
			}
		});
		submit.setBounds(634, 44, 89, 287);
		panel.add(submit);

	}
}
