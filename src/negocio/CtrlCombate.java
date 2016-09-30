package negocio;

import data.DataPersonaje;
import entidades.Personaje;

public class CtrlCombate {

	private data.DataPersonaje dataP;
	private Personaje jugador1,jugador2,jugadorTurnoActual;	
	public CtrlCombate(){
		dataP=new DataPersonaje();
	}
	
	
    public Personaje getJugadorTurnoActual() {
    	if (jugadorTurnoActual==null) {
			generarPrimerTurnoAleatorio();
		} else {
			generarNuevoTurno();
		}
		return jugadorTurnoActual;
	}
  
    
    
    public void generarNuevoTurno(){
    	    if (jugadorTurnoActual==jugador1) {
				jugadorTurnoActual=jugador2;
			} else {
				jugadorTurnoActual=jugador1;
			}
        }
    	
	public void generarPrimerTurnoAleatorio() {
		double numeroAleatorio;
		do {
    		numeroAleatorio=Math.random();
    		
			if (numeroAleatorio > 0.5) {
				jugadorTurnoActual=jugador1;
			} else {
				jugadorTurnoActual=jugador2;
			} 
		} while (numeroAleatorio==0.5);
	}
    
    public void ataque(int puntosAtaque){

    }

    
    public void defensa(Personaje j){
    }


	public void setJugador1(Personaje p) {
		jugador1=p;
	}


	public void setJugador2(Personaje p) {
		jugador2=p;
	}
	
	

	public Personaje getJugador1() {
		return jugador1;
	}


	public Personaje getJugador2() {
		return jugador2;
	}


	public void setJugadorTurnoActual(Personaje jugadorTurnoActual) {
		this.jugadorTurnoActual = jugadorTurnoActual;
	}


	//se repite  codigo del otro controlador ¿?
	//recibir objeto personaje o dejar como asi?
	//crear metodo en data persona que reciba string?
	public Personaje getByNombre(String nombre){
		Personaje p = new Personaje();
		p.setNombre(nombre);
		return dataP.getByNombre(p);
		
	}
	
	public void nuevaPartida(Personaje jugador1,Personaje jugador2){
		jugadorTurnoActual=null;
		setJugador1(jugador1);
		setJugador2(jugador2);		
	}
	
    
}
