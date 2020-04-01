package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame firstFrame;

	public MainMenu() {
		initialize();
	}

	private void initialize() {
		firstFrame = new JFrame();
		firstFrame.setBounds(100, 100, 764, 438);
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.getContentPane().setLayout(null);
		
		JLabel labelSalma = new JLabel("SALMA - Salon Manager for Professionals");
		labelSalma.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		labelSalma.setBounds(151, 38, 450, 56);
		firstFrame.getContentPane().add(labelSalma);
		
		JButton buttonRegister = new JButton("Register Data");
		buttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstFrame.setVisible(false);
				new Register();
			}
		});
		buttonRegister.setBounds(306, 107, 138, 39);
		firstFrame.getContentPane().add(buttonRegister);
		
		JButton buttonLogin = new JButton("User Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				firstFrame.setVisible(false);
				firstFrame.dispose();
				new Login();
			}
		});
		buttonLogin.setBounds(306, 159, 138, 39);
		firstFrame.getContentPane().add(buttonLogin);
		
		JButton Exit = new JButton("Exit");
		Exit.setBounds(306, 211, 138, 39);
		firstFrame.getContentPane().add(Exit);
		
		firstFrame.setVisible(true);
	}

}
