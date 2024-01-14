package ex5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Admin main screen
 * has option to add branch, and add car
 * @author Sean & Bar
 *
 */
public class ManageMainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton openBranch;
	private JButton openCar;
	private JLabel welcomeMessage;
	private JButton returnButt;
	
	public ManageMainFrame() {
		super("Manage Main Page");
		
		openBranch = new JButton("Add New Branch");
		openCar = new JButton("Add New Car");
		returnButt = new JButton("Log Out");
		welcomeMessage = new JLabel("Welcome to manage panel",SwingConstants.CENTER);
		welcomeMessage.setFont(new Font("Bahnschrift", Font.PLAIN, 30));
		
		openBranch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ManageAddBranchFrame branchFrame = new ManageAddBranchFrame();
				branchFrame.setSize(400,300);
				branchFrame.setVisible(true);
			}
		});
		
		openCar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ManageAddCarFrame carFrame = new ManageAddCarFrame();
				carFrame.setSize(400,700);
				carFrame.setVisible(true);
			}
		});
		
		returnButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainPageFrame mainpage = new MainPageFrame();
				mainpage.setSize(700,400);
				mainpage.setVisible(true);
				closeWindow();
			}
		});
		
		init();
		
	}
	
	/**
	 * Building frame interface
	 */
	private void init() {
		setLayout(new GridLayout(0,1));
		getContentPane().setBackground(Color.gray);
		
		JPanel buttons = new JPanel(new FlowLayout());
		openBranch.setBackground(Color.black);
		openCar.setBackground(Color.black);
		
		openBranch.setForeground(Color.white);
		openCar.setForeground(Color.white);
		
		openBranch.setFont(new Font("Verdana", Font.PLAIN, 18));
		openCar.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		buttons.add(openBranch);
		buttons.add(openCar);
		
		JPanel exit_flow = new JPanel(new FlowLayout());
		returnButt.setFont(new Font("Verdana", Font.PLAIN, 18));
		exit_flow.add(returnButt);
		
		add(welcomeMessage);
		add(buttons);
		add(exit_flow);

		pack();
	}
	/**
	 * Closing current window
	 */
	private void closeWindow() {
		setVisible(false);
		dispose();
	}
	
}
