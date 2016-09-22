package uiEscritorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import entidades.Personaje;

import java.util.ArrayList;

import negocio.*;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class UiCombate {
   
	private JFrame frame;
	private CtrlCombate ctrlCombate;
	private JComboBox<String> comboBoxJ1;
	private ArrayList<Personaje> personajesRegistrados;
	private JComboBox<String> comboBoxJ2;
	private JTextField textFieldVidaJ1;
	private JTextField textFieldEnergiaJ1;
	private JTextField textFieldDefensaJ1;
	private JTextField textFieldEvasionJ1;
	private JTextField textFieldVidaJ2;
	private JTextField textFieldEnergiaJ2;
	private JTextField textFieldDefensaJ2;
	private JTextField textFieldEvasionJ2;
	private JLabel lblVida_1;    //
	private JLabel lblEnergia_1; //
	private JLabel lblNewLabel; //
	private JLabel lblEvasion_1;// estos van?
	private JTextField textFieldTurnoPersonaje;
	private JTextField textFieldPuntosAtaque;
	private Personaje j1;
	private Personaje j2;
	
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
		llenarComboBox();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 692, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblJugad = new JLabel("Jugador 1");
		
		comboBoxJ1 = new JComboBox<String>();
		comboBoxJ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAtributosJugadorSeleccionadoJ1();
			}
		});
		
		comboBoxJ2 = new JComboBox<String>();
		comboBoxJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAtributosJugadorSeleccionadoJ2();
			}
		});
		
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
		
		lblVida_1 = new JLabel("VIDA");
		
		lblEnergia_1 = new JLabel("ENERGIA");
		
		lblNewLabel = new JLabel("DEFENSA");
		
		lblEvasion_1 = new JLabel("EVASION");
		
		JButton btnNuevaPartida = new JButton("NUEVA PARTIDA");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//validar que los jugadores no sean los mismos
				//definir quien juega primero atraves de getPrimerTurno()
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
				defender();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblJugad, Alignment.LEADING)
								.addComponent(comboBoxJ1, Alignment.LEADING, 0, 138, Short.MAX_VALUE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblDefensa)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldDefensaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblEvasion)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldEvasionJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEnergia)
								.addComponent(lblVida))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldVidaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEnergiaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(258)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel)
										.addComponent(lblEvasion_1)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(73)
									.addComponent(btnNuevaPartida))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnAtacar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnDefender, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(25)
									.addComponent(textFieldPuntosAtaque, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(12)
										.addComponent(textFieldEvasionJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addComponent(textFieldDefensaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblJugador))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblVida_1)
											.addGap(31))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblEnergia_1)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textFieldVidaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldEnergiaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblTurnoJugador)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldTurnoPersonaje, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
							.addComponent(comboBoxJ2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(87))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblJugad)
								.addComponent(lblJugador))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblVida)
										.addComponent(textFieldVidaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEnergia)
										.addComponent(textFieldEnergiaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDefensa)
										.addComponent(textFieldDefensaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(16)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEvasion)
										.addComponent(textFieldEvasionJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(22)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldVidaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblVida_1))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldEnergiaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEnergia_1))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldDefensaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldEvasionJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEvasion_1)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNuevaPartida)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTurnoJugador)
								.addComponent(textFieldTurnoPersonaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAtacar)
								.addComponent(textFieldPuntosAtaque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDefender)))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
		

	protected void llenarComboBox(){
		    personajesRegistrados = ctrlCombate.getPersonajesRegistrados(); 
		    for(int i=0; i<personajesRegistrados.size();i++){
		        comboBoxJ1.addItem(personajesRegistrados.get(i).getNombre());
		        comboBoxJ2.addItem(personajesRegistrados.get(i).getNombre());
		    	
		    }
	}
	
	protected Personaje getJugadorSeleccionado(String nombre){
        Personaje resultado = null;
		for (Personaje personaje : personajesRegistrados) {
			if (personaje.equals(nombre)) {
				resultado=personaje;	
				break;
			}		
		}		
		return resultado;	
	}
	
	protected void mostrarAtributosJugadorSeleccionadoJ1(){
	    j1=getJugadorSeleccionado(comboBoxJ1.getSelectedItem().toString());
		
	    textFieldDefensaJ1.setText(Integer.toString(j1.getDefensa()));
		textFieldEnergiaJ1.setText(Integer.toString(j1.getEnergia()));
		textFieldVidaJ1.setText(Integer.toString(j1.getVida()));
		textFieldEvasionJ1.setText(Integer.toString(j1.getEvasion()));	
		
	}
	
	protected void mostrarAtributosJugadorSeleccionadoJ2(){
	    j2=getJugadorSeleccionado(comboBoxJ2.getSelectedItem().toString());
	    
		textFieldDefensaJ2.setText(Integer.toString(j2.getDefensa()));
		textFieldEnergiaJ2.setText(Integer.toString(j2.getEnergia()));
		textFieldVidaJ2.setText(Integer.toString(j2.getVida()));
		textFieldEvasionJ2.setText(Integer.toString(j2.getEvasion()));
		
	}
	
    //falta validar puntos ataque>energia
	//falta validar que para atacar  primero se haya generado una nueva partida
	protected void atacar(){
		if (validarCampoPuntosAtaque()){
		 ctrlCombate.ataque(ctrlCombate.getTurno(),j1,j2,Integer.parseInt((textFieldPuntosAtaque.getText())));	
		 mostrarAtributosJugadorSeleccionadoJ1();
		 mostrarAtributosJugadorSeleccionadoJ2();
		 textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));
		} else {
		 	notifyUser("Ingrese un numero entero mayor a 0 para el ataque");
		}
		textFieldPuntosAtaque.setText("");
	}
	
	protected boolean validarCampoPuntosAtaque(){		
		//valida que se haya ingresado los puntos, que sea numero entero y mayor a 0
		if (       (textFieldPuntosAtaque.getText().length()>0) 
				&& (textFieldPuntosAtaque.getText()).matches("[0-9]*") 
				&& (Integer.parseInt(textFieldPuntosAtaque.getText())>0)) {
			return true;
		} else {
			 return false;
		}
	}
	
	private void notifyUser(String mensaje) {
		JOptionPane.showMessageDialog(this.frame, mensaje);
    }
	
	protected void nuevaPartida() {
		ctrlCombate.setTurno(0);
		
		if(!j1.equals(j2)){
			ctrlCombate.generarNuevoTurno();
			textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));
		} else {
			notifyUser("Ingrese dos personajes distintos para una nueva partida");
		}	
	}
	
	protected void defender() {
		switch (ctrlCombate.getTurno()) {
		case 0: notifyUser("Primero es necesario generar una nueva partida");break;
		case 1:ctrlCombate.defensa(j1);mostrarAtributosJugadorSeleccionadoJ1();textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));break;
		case 2:ctrlCombate.defensa(j2);mostrarAtributosJugadorSeleccionadoJ1();textFieldTurnoPersonaje.setText(Integer.toString(ctrlCombate.getTurno()));break;
		}
	}
	
}


