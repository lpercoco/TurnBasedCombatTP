package uiEscritorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import entidades.Personaje;

import java.util.ArrayList;

import negocio.*;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	private JLabel lblVida_1;
	private JLabel lblEnergia_1;
	private JLabel lblNewLabel;
	private JLabel lblEvasion_1;// estos van?
	
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
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
							.addGap(258)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(lblEvasion_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(textFieldEvasionJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(textFieldDefensaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblJugador)
								.addComponent(comboBoxJ2, 0, 138, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEnergia)
								.addComponent(lblVida))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldVidaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEnergiaJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblVida_1)
									.addGap(31))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEnergia_1)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textFieldVidaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEnergiaJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(22, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJugad)
						.addComponent(lblJugador))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(lblEvasion_1))))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public void llenarComboBox(){
		    personajesRegistrados = ctrlCombate.getPersonajesRegistrados(); 
		    for(int i=0; i<personajesRegistrados.size();i++){
		        comboBoxJ1.addItem(personajesRegistrados.get(i).getNombre());
		        comboBoxJ2.addItem(personajesRegistrados.get(i).getNombre());
		    	
		    }
	}
	
	public Personaje getJugadorSeleccionado(String nombre){
        Personaje resultado = null;
		for (Personaje personaje : personajesRegistrados) {
			if (personaje.equals(nombre)) {
				resultado=personaje;	
				break;
			}		
		}		
		return resultado;	
	}
	
	public void mostrarAtributosJugadorSeleccionadoJ1(){
	    Personaje p1=getJugadorSeleccionado(comboBoxJ1.getSelectedItem().toString());
		
	    textFieldDefensaJ1.setText(Integer.toString(p1.getDefensa()));
		textFieldEnergiaJ1.setText(Integer.toString(p1.getEnergia()));
		textFieldVidaJ1.setText(Integer.toString(p1.getVida()));
		textFieldEvasionJ1.setText(Integer.toString(p1.getEvasion()));	
		
	}
	
	public void mostrarAtributosJugadorSeleccionadoJ2(){
	    Personaje p2=getJugadorSeleccionado(comboBoxJ2.getSelectedItem().toString());
	    
		textFieldDefensaJ2.setText(Integer.toString(p2.getDefensa()));
		textFieldEnergiaJ2.setText(Integer.toString(p2.getEnergia()));
		textFieldVidaJ2.setText(Integer.toString(p2.getVida()));
		textFieldEvasionJ2.setText(Integer.toString(p2.getEvasion()));
		
	}
	
	
}


