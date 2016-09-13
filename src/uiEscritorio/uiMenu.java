package uiEscritorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class uiMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uiMenu window = new uiMenu();
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
	public uiMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPersonajes = new JButton("Personajes");
		
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		
		JButton btnMejoresPersonajes = new JButton("Mejores personajes");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(84)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnPersonajes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addComponent(btnNuevaPartida, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addComponent(btnMejoresPersonajes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(82))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addComponent(btnPersonajes)
					.addGap(54)
					.addComponent(btnNuevaPartida)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(btnMejoresPersonajes)
					.addGap(47))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
