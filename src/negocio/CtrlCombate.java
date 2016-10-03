package negocio;

import data.DataPersonaje;
import entidades.Personaje;
import utils.ApplicationException;

public class CtrlCombate {

	private data.DataPersonaje dataP;
	private Personaje jugador1,jugador2,jugadorTurnoActual;
	private boolean finCombate;
	
	
	public boolean isFinCombate() {
		return finCombate;
	}


	public void setFinCombate(boolean finCombate) {
		this.finCombate = finCombate;
	}


	public CtrlCombate(){
		dataP=new DataPersonaje();
	}
	
	
    public Personaje getJugadorTurnoActual() {
		return jugadorTurnoActual;
	}
  
        
    public void generarNuevoTurno(){

    		if(jugador1.equals(jugadorTurnoActual)){
    			jugadorTurnoActual=jugador2;
    		}else{
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
    
	
	//validar que el ataque sea en una partida y que los puntos de ataque sean menores
	//a la energia del atacante
    public void ataque(int puntosAtaque) throws ApplicationException{
    	
    	if(jugadorTurnoActual.equals(jugador1)){
    		//jugador1 ataca, jugador2 recibe ataque
    		
    		if(jugador1.getEnergiaActual()>puntosAtaque){
    			throw new ApplicationException("Puntos ataque deben ser menor que energia actual del atacante");
    		}
    		
    		jugador1.ataca(puntosAtaque);
    		jugador2.recibeAtaque(puntosAtaque);
    		if(jugador2.getVidaActual()<=0){
    			finCombate=true;
    			combateGanado(jugador1);
    		}
    	}else{
    		//jugador2 ataca, jugador1 recibe ataque
    		
    		if(jugador2.getEnergiaActual()>puntosAtaque){
    			throw new ApplicationException("Puntos ataque deben ser menor que energia actual del atacante");
    		}
    		
    		jugador1.recibeAtaque(puntosAtaque);
    		jugador2.ataca(puntosAtaque);
    		if(jugador1.getVidaActual()<=0){
    			finCombate=true;
    			combateGanado(jugador2);
    		}
    	}
    	
    	if(!finCombate){
    		generarNuevoTurno();
    	}
    	
    }

    
    public void combateGanado(Personaje j){
    	j.aumentaPuntosTotales();
    	dataP.update(j);
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
	
	public void nuevaPartida(Personaje jugador1,Personaje jugador2) throws ApplicationException{
		if(jugador1.equals(jugador2)){
			throw new ApplicationException("Ingrese dos personajes diferentes");
		}else{
		
		finCombate=false;
		
		setJugador1(jugador1);
		setJugador2(jugador2);
		
		generarPrimerTurnoAleatorio();
		}
	}
	
    
}
