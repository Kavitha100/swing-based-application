package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class season1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					season1 window = new season1();
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
	public season1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 711, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSummer = new JButton("summer");
		btnSummer.setActionCommand("summer");
		btnSummer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String com=e.getActionCommand();
				if(com.equals("summer"))
				{
					class1 nw=new class1();
					JFrame f= new JFrame();
					//f.setSize(2000,1000);
					f.getContentPane().add(nw);
					//nw.drawing();
					f.setVisible(true);
				}
			}
		});
		btnSummer.setBounds(52, 37, 97, 37);
		frame.getContentPane().add(btnSummer);
		
		JButton btnWinter = new JButton("winter");
		btnWinter.setActionCommand("winter");
		btnWinter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String com=e.getActionCommand();
				if(com.equals("winter"))
				{
					class2 nw=new class2();
					JFrame f= new JFrame();
					//f.setSize(2000,1000);
					f.getContentPane().add(nw);
					//nw.drawing();
					f.setVisible(true);
				}
			}
		});
		btnWinter.setBounds(245, 98, 97, 37);
		frame.getContentPane().add(btnWinter);
		
		JButton btnNewButton = new JButton("rainy");
btnNewButton.setActionCommand("rainy");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String com=e.getActionCommand();
				if(com.equals("rainy"))
				{
				class3 nw=new class3();
				JFrame f= new JFrame();
				//f.setSize(2000,1000);
				f.getContentPane().add(nw);
				//nw.drawing();
				f.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(403, 184, 97, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAutumn = new JButton("autumn");

		btnAutumn.setActionCommand("autumn");
		btnAutumn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String com=e.getActionCommand();
				if(com.equals("autumn"))
				{
					class4 nw=new class4();
					JFrame f= new JFrame();
					f.setSize(2000,1000);
					f.getContentPane().add(nw);
					//nw.drawing();
					f.setVisible(true);
				}
			}
		});
		btnAutumn.setBounds(542, 255, 97, 37);
		frame.getContentPane().add(btnAutumn);
	}
}
