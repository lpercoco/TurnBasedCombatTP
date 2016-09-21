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

public class UiPersonajes {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textVida;
	private JTextField textEnergia;
	private JTextField textDefensa;
	private JTextField textEvasion;
	private CtrlPersonajes ctrlPersonajes;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel label = new JLabel("");
		
		JLabel lblEnergia = new JLabel("Energia");
		
		JLabel lblVida = new JLabel("Vida");
		
		JLabel lblNewLabel = new JLabel("Defensa");
		
		JLabel lblNewLabel_1 = new JLabel("Evasión");
		
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(label)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNombre)
										.addGap(68)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(textVida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textEnergia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textDefensa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textEvasion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblEnergia))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblVida)))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1)))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnBuscar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAgregar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEliminar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(68))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNombre)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnBuscar)
							.addGap(18)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label)
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
								.addComponent(textDefensa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(btnAgregar)
							.addGap(18)
							.addComponent(btnEliminar)
							.addGap(18)
							.addComponent(btnModificar)))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textEvasion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	
	protected void modificar() {
		Personaje p = new Personaje();
		if(datosValidos()){
			p=MapearDeFormulario();
			if(p.validarPuntosAsignados()){
		    ctrlPersonajes.update(p);
			limpiarCampos();}
			}
		else notifyUser("no se pudo modificar");
		}
			
	public Personaje MapearDeFormulario(){
		Personaje p = new Personaje();
		p.setNombre(textNombre.getText());
		if(textDefensa.getText().length()>0) {p.setDefensa(Integer.parseInt(textDefensa.getText()));} else p.setDefensa(0) ;
		if(textEnergia.getText().length()>0) {p.setEnergia(Integer.parseInt(textEnergia.getText()));} else p.setEnergia(0);
		if(textEvasion.getText().length()>0) {p.setEvasion(Integer.parseInt(textEvasion.getText()));} else p.setEvasion(0);
		if(textVida.getText().length()>0)    {p.setVida(Integer.parseInt(textVida.getText()));      } else p.setVida(0);
		
		return p;
	}
	
	public void MapearAformulario(Personaje p){
		textNombre.setText(p.getNombre());
		textDefensa.setText(Integer.toString(p.getDefensa()));
		textEnergia.setText(Integer.toString(p.getEnergia()));
		textVida.setText(Integer.toString(p.getVida()));
		textEvasion.setText(Integer.toString(p.getEvasion()));		
	}
	
 
	public void limpiarCampos(){
		textNombre.setText("");
		textDefensa.setText("");
		textEnergia.setText("");
		textVida.setText("");
		textEvasion.setText("");
		//falta limpiar puntos totales
	}
	
	//valida que los datos ingresados esten completos y que se ingresen numeros enteros sin , o .
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
	
	private void notifyUser(String mensaje) {
		JOptionPane.showMessageDialog(this.frame, mensaje);
    }

	protected void agregar() {
		Personaje p=new Personaje();
		if(datosValidos()){
		p=MapearDeFormulario();
		if(p.validarPuntosAsignados()){
		ctrlPersonajes.add(p);
		limpiarCampos();
		}else{
			notifyUser("Reingrese los puntos asignados, la suma total tiene que ser menor o igual a 200");
		}
		}
	}

	protected void buscar() {
		Personaje p=new Personaje();
		p=ctrlPersonajes.getByNombre(MapearDeFormulario());
		if(p!=null)MapearAformulario(p);
		else notifyUser("Personaje no encontrado");
	}

	protected void eliminar() {
		ctrlPersonajes.delete(MapearDeFormulario());
		limpiarCampos();
	}
	
}

//falta manejar: agregacion de un personaje que ya existe
//               solamente se puede modificar los puntos asignados
//               mostrar puntos totales en la interfaz
//               
	