package uiEscritorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import entidades.Personaje;

import negocio.*;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class UiCombate {
   
	private JFrame frame;
	private CtrlCombate ctrlCombate;
	private JTextField textFieldVidaJ1;
	private JTextField textFieldEnergiaJ1;
	private JTextField textFieldDefensaJ1;
	private JTextField textFieldEvasionJ1;
	private JTextField textFieldVidaJ2;
	private JTextField textFieldEnergiaJ2;
	private JTextField textFieldDefensaJ2;
	private JTextField textFieldEvasionJ2;
	private JTextField textFieldTurnoPersonaje;
	private JTextField textFieldPuntosAtaque;
	private JTextField textFieldNombreJ1;
	private JTextField textFieldNombreJ2;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiCombate window = new UiCombate();
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
	public UiCombate() {
		initialize();
		ctrlCombate=new CtrlCombate();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 851, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblJugad = new JLabel("Jugador 1");
		
		JLabel lblJugador = new JLabel("Jugador 2");
		
		JLabel lblVida = new JLabel("VIDA");
		
		textFieldVidaJ1 = new JTextField();
		textFieldVidaJ1.setEditable(false);
		textFieldVidaJ1.setColumns(10);
		
		JLabel lblEnergia = new JLabel("ENERGIA");
		
		JLabel lblDefensa = new JLabel("DEFENSA");
		
		JLabel lblEvasion = new JLabel("EVASION");
		
		textFieldEnergiaJ1 = new JTextField();
		textFieldEnergiaJ1.setEditable(false);
		textFieldEnergiaJ1.setColumns(10);
		
		textFieldDefensaJ1 = new JTextField();
		textFieldDefensaJ1.setEditable(false);
		textFieldDefensaJ1.setColumns(10);
		
		textFieldEvasionJ1 = new JTextField();
		textFieldEvasionJ1.setEditable(false);
		textFieldEvasionJ1.setColumns(10);
		
		textFieldVidaJ2 = new JTextField();
		textFieldVidaJ2.setEditable(false);
		textFieldVidaJ2.setColumns(10);
		
		textFieldEnergiaJ2 = new JTextField();
		textFieldEnergiaJ2.setEditable(false);
		textFieldEnergiaJ2.setColumns(10);
		
		textFieldDefensaJ2 = new JTextField();
		textFieldDefensaJ2.setEditable(false);
		textFieldDefensaJ2.setColumns(10);
		
		textFieldEvasionJ2 = new JTextField();
		textFieldEvasionJ2.setEditable(false);
		textFieldEvasionJ2.setColumns(10);
		
		JLabel lblVida_1 = new JLabel("VIDA");
		
		JLabel lblEnergia_1 = new JLabel("ENERGIA");
		
		JLabel lblDefensa_1 = new JLabel("DEFENSA");
		
		JLabel lblEvasion_1 = new JLabel("EVASION");
		
		JButton btnNuevaPartida = new JButton("NUEVA PARTIDA");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevaPartida();	
			}

		});
		
		JLabel lblTurnoJugador = new JLabel("TURNO JUGADOR:");
		
		textFieldTurnoPersonaje = new JTextField();
		textFieldTurnoPersonaje.setEditable(false);
		textFieldTurnoPersonaje.setColumns(10);
		
		JButton btnAtacar = new JButton("ATACAR");
		btnAtacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atacar();
			}
		});
		
		textFieldPuntosAtaque = new JTextField();
		textFieldPuntosAtaque.setColumns(10);
		
		JButton btnDefender = new JButton("DEFENDER");
		btnDefender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//defender();
			}
		});
		
		JLabel lblNombre = new JLabel("NOMBRE");
		
		textFieldNombreJ1 = new JTextField();
		textFieldNombreJ1.setColumns(10);
		
		JButton btnBuscarJ1 = new JButton("BUSCAR");
		btnBuscarJ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarJugador1();
			}
		});
		
		JLabel lblNombre_1 = new JLabel("NOMBRE");
		
		textFieldNombreJ2 = new JTextField();
		textFieldNombreJ2.setColumns(10);
		
		JButton btnBuscarJ2 = new JButton("BUSCAR");
		btnBuscarJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarJugador2();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblJugad)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblDefensa)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textFieldDefensaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNombre)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textFieldNombreJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblVida)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textFieldVidaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnBuscarJ1)
									.addGap(20)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblTurnoJugador)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textFieldTurnoPersonaje, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
												.addGap(26))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(btnAtacar, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textFieldPuntosAtaque, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addGap(57)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnNuevaPartida)
											.addGap(83))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEvasion)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldEvasionJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblEnergia)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldEnergiaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
							.addComponent(btnDefender)
							.addGap(130)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblDefensa_1)
									.addComponent(lblEvasion_1)
									.addComponent(lblEnergia_1)
									.addComponent(lblVida_1))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(textFieldEnergiaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textFieldDefensaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textFieldEvasionJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textFieldVidaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(43))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblJugador)
								.addGap(56)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNombre_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldNombreJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscarJ2)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblJugador)
								.addComponent(btnNuevaPartida))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldTurnoPersonaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTurnoJugador)
								.addComponent(lblNombre_1)
								.addComponent(textFieldNombreJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblJugad)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(textFieldNombreJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscarJ1))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblVida_1)
									.addComponent(textFieldVidaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblVida)
								.addGap(18))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(textFieldVidaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(18))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnAtacar)
								.addGap(18)))
						.addComponent(textFieldPuntosAtaque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEnergia_1)
										.addComponent(textFieldEnergiaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDefensa_1)
										.addComponent(textFieldDefensaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(12))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEnergia)
										.addComponent(textFieldEnergiaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDefensa)
										.addComponent(textFieldDefensaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEvasion)
								.addComponent(textFieldEvasionJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEvasion_1)
								.addComponent(textFieldEvasionJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(40))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(btnDefender)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(61, Short.MAX_VALUE)
					.addComponent(btnBuscarJ2)
					.addGap(185))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
		
	//falta considerar  caso que no exista el jugador
	//si no existe limpiar campos
	protected void seleccionarJugador1() {
		Personaje p=ctrlCombate.getByNombre(textFieldNombreJ1.getText());
		mostrarAtributosJugadorSeleccionadoJ1(p);
		setJugadorSeleccionado1(p);
	}
	
	//falta considerar  caso que no exista el jugador
	//si no existe limpiar campos
	protected void seleccionarJugador2() {
		Personaje p=ctrlCombate.getByNombre(textFieldNombreJ2.getText());
		mostrarAtributosJugadorSeleccionadoJ2(p);
		setJugadorSeleccionado2(p);
	}


	protected void setJugadorSeleccionado1(Personaje p){
        ctrlCombate.setJugador1(p);
	}
	
	protected void setJugadorSeleccionado2(Personaje p){
        ctrlCombate.setJugador2(p);
	}
	
	protected void mostrarAtributosJugadorSeleccionadoJ1(Personaje p){
	    textFieldDefensaJ1.setText(Integer.toString(p.getDefensa()));
		textFieldEnergiaJ1.setText(Integer.toString(p.getEnergia()));
		textFieldVidaJ1.setText(Integer.toString(p.getVida()));
		textFieldEvasionJ1.setText(Integer.toString(p.getEvasion()));	
	}

	protected void mostrarAtributosJugadorSeleccionadoJ2(Personaje p){
		textFieldDefensaJ2.setText(Integer.toString(p.getDefensa()));
		textFieldEnergiaJ2.setText(Integer.toString(p.getEnergia()));
		textFieldVidaJ2.setText(Integer.toString(p.getVida()));
		textFieldEvasionJ2.setText(Integer.toString(p.getEvasion()));	
	}

	// falta validar que se hayan ingresado 2 jugadores que sean distintos
	protected void nuevaPartida() {
		ctrlCombate.nuevaPartida();
		textFieldTurnoPersonaje.setText(ctrlCombate.getJugadorTurnoActual().getNombre());
	}
	
	//modificar
    //falta validar puntos ataque>energia
	//falta validar que para atacar  primero se haya generado una nueva partida
	protected void atacar(){
//		if (validarCampoPuntosAtaque()){
//		 ctrlCombate.ataque(Integer.parseInt((textFieldPuntosAtaque.getText())));	
////		 mostrarAtributosJugadorSeleccionadoJ1();
////		 mostrarAtributosJugadorSeleccionadoJ2();
//		// textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));
//		} else {
//		 	notifyUser("Ingrese un numero entero mayor a 0 para el ataque");
//		}
//		textFieldPuntosAtaque.setText("");
			
			
	}
	
	//no modificar
	protected boolean validarCampoPuntosAtaque(){		
		//valida que se haya ingresado los puntos, que sea numero entero y mayor a 0
		if (       (textFieldPuntosAtaque.getText().length()>0) 
				&& (textFieldPuntosAtaque.getText()).matches("[0-9]*") ) {
			return true;
		} else {
			 return false;
		}
	}
	
	//muestra mensaje
	@SuppressWarnings("unused")
	private void notifyUser(String mensaje) {
		JOptionPane.showMessageDialog(this.frame, mensaje);
    }
	
	//ver mas tarde
//	protected void defender() {
//		switch (ctrlCombate.getTurno()) {
//		case 0: notifyUser("Primero es necesario generar una nueva partida");break;
//		case 1:ctrlCombate.defensa(j1);mostrarAtributosJugadorSeleccionadoJ1();textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));break;
//		case 2:ctrlCombate.defensa(j2);mostrarAtributosJugadorSeleccionadoJ1();textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));break;
//		}
//	}
	
}


