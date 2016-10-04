package uiEscritorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import entidades.Personaje;
import negocio.CtrlPersonajes;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UiPersonajes {

	public JFrame frame;
	private JTextField textNombre;
	private JTextField textVida;
	private JTextField textEnergia;
	private JTextField textDefensa;
	private JTextField textEvasion;
	private CtrlPersonajes ctrlPersonajes;
	private JTextField textPuntosTotales;
	private JTextField textPuntosSinAsignar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UiPersonajes window = new UiPersonajes();
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
	public UiPersonajes() {
		initialize();
		ctrlPersonajes=new CtrlPersonajes();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel label = new JLabel("");
		
		JLabel lblEnergia = new JLabel("Energia");
		
		JLabel lblVida = new JLabel("Vida");
		
		JLabel lblNewLabel = new JLabel("Defensa");
		
		JLabel lblNewLabel_1 = new JLabel("Evasion");
		
		textVida = new JTextField();
		textVida.setColumns(10);
		
		textEnergia = new JTextField();
		textEnergia.setColumns(10);
		
		textDefensa = new JTextField();
		textDefensa.setColumns(10);
		
		textEvasion = new JTextField();
		textEvasion.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				agregar();
				
			}
		});
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modificar();
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    eliminar();
			}
		});
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buscar();
				
			}
		});
		
		JLabel lblPuntosTotales = new JLabel("Puntos Totales");
		
		textPuntosTotales = new JTextField();
		textPuntosTotales.setEditable(false);
		textPuntosTotales.setColumns(10);
		
		JLabel lblPuntosSinAsignar = new JLabel("Puntos sin asignar");
		
		textPuntosSinAsignar = new JTextField();
		textPuntosSinAsignar.setEditable(false);
		textPuntosSinAsignar.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(lblVida)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(68))
								.addComponent(lblEnergia)
								.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textEvasion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textVida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textEnergia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textDefensa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
						.addComponent(btnEliminar, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
						.addComponent(btnBuscar, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
						.addComponent(btnAgregar, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
					.addGap(68))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPuntosSinAsignar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPuntosSinAsignar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPuntosTotales)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textPuntosTotales, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(237))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPuntosTotales)
						.addComponent(textPuntosTotales, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPuntosSinAsignar)
						.addComponent(textPuntosSinAsignar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre)
								.addComponent(label))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVida)
								.addComponent(textVida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEnergia)
								.addComponent(textEnergia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(textDefensa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(textEvasion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnBuscar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAgregar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEliminar)
							.addGap(18)
							.addComponent(btnModificar)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
	
	//se puede mejorar validacion de puntos asignados?
	//cartel modificacion exitosa?
	//falta manejar caso  de personaje inexistente
	protected void modificar() {
		Personaje p = new Personaje();
		if(datosValidos()){
			p=MapearDeFormulario();
			if(p.validarPuntosAsignados()){
		    ctrlPersonajes.update(p);
			limpiarCampos();
			} 
			else {
			     notifyUser("Tenga en cuenta las siguientes reglas\nLa suma de los puntos asignados no puede superar los puntos totales\nTope puntos defesa: 20\nTope puntos evasion: 80");
			}
		}
	}
		
	//sin el if 
	//error Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException:
	//For input string: "" 
	//se puede mejorar?
	
	public Personaje MapearDeFormulario(){
		Personaje p = new Personaje();
		p.setNombre(textNombre.getText());
		if(textDefensa.getText().trim().length()>0) {p.setDefensa(Integer.parseInt(textDefensa.getText()));} else p.setDefensa(0) ;
		if(textEnergia.getText().trim().length()>0) {p.setEnergia(Integer.parseInt(textEnergia.getText()));} else p.setEnergia(0);
		if(textEvasion.getText().trim().length()>0) {p.setEvasion(Integer.parseInt(textEvasion.getText()));} else p.setEvasion(0);
		if(textVida.getText().trim().length()>0)    {p.setVida(Integer.parseInt(textVida.getText()));      } else p.setVida(0);
	
		return p;
	}
	

	public void MapearAformulario(Personaje p){
		textNombre.setText(p.getNombre());
		textDefensa.setText(Integer.toString(p.getDefensa()));
		textEnergia.setText(Integer.toString(p.getEnergia()));
		textVida.setText(Integer.toString(p.getVida()));
		textEvasion.setText(Integer.toString(p.getEvasion()));
		textPuntosTotales.setText(Integer.toString(p.getPuntosTotales()));
		textPuntosSinAsignar.setText(Integer.toString(p.getPuntosTotales()-(p.getDefensa()+p.getEnergia()+p.getEvasion()+p.getVida())));
	}
	
     //"limpia" todos los campos del frame
	public void limpiarCampos(){
		textNombre.setText("");
		textDefensa.setText("");
		textEnergia.setText("");
		textVida.setText("");
		textEvasion.setText("");
		textPuntosTotales.setText("");
		textPuntosSinAsignar.setText("");
	}
			
	
	//valida que los todos los campos esten completos y que se ingresen numeros enteros
	public boolean datosValidos(){
		boolean valido=true;
		if(textNombre.getText().trim().length()==0
		   ||textDefensa.getText().trim().length()==0	
		   ||textEnergia.getText().trim().length()==0
		   ||textVida.getText().trim().length()==0
		   ||textEvasion.getText().trim().length()==0){
			valido=false;
			notifyUser("Complete los campos faltantes");
		}

		if(valido && (!textDefensa.getText().matches("[0-9]*")
		   || !textEnergia.getText().matches("[0-9]*")
		   || !textVida.getText().matches("[0-9]*")
		   || !textEvasion.getText().matches("[0-9]*"))){
			valido=false;
			notifyUser("Reingrese los puntos asignados, solamente se aceptan numeros enteros");
		}
		return valido;
	}
	
	//imprime mensaje
	private void notifyUser(String mensaje) {
		JOptionPane.showMessageDialog(this.frame, mensaje);
    }

	//falta manejar caso personaje ya existente con ese nombre
	//se puede mejorar  validacion puntos asignados? mensaje especifico para cada caso?
	//cartel alta personaje exitosa?
	protected void agregar() {
		Personaje p=new Personaje();
		
		if(datosValidos()){
		p=MapearDeFormulario();
		if(p.validarPuntosAsignados()){
		   ctrlPersonajes.add(p);
		   limpiarCampos();
		   }else{
			     notifyUser("Tenga en cuenta las siguientes reglas\nLa suma de los puntos asignados no puede superar los puntos totales\nTope puntos defesa: 20\nTope puntos evasion: 80");
		   }
		}
	}

	// busca personaje por el nombre y lo muestra en el frame
	protected void buscar() {
		Personaje p=new Personaje();
		p=ctrlPersonajes.getByNombre(MapearDeFormulario());
		if(p!=null)MapearAformulario(p);
		else notifyUser("Personaje no encontrado");
	}

	//falta manejar "eliminar un personaje que no esta registrado"
	protected void eliminar() {
		ctrlPersonajes.delete(MapearDeFormulario());
		limpiarCampos();
	}
	
}
        
	