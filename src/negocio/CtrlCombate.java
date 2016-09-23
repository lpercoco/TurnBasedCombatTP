package negocio;

import java.util.ArrayList;

import data.DataPersonaje;
import entidades.Personaje;

public class CtrlCombate {

	private data.DataPersonaje dataP;
	private int turno;
	
	public CtrlCombate(){
		dataP=new DataPersonaje();
		turno=0;
	}
	

    public ArrayList<Personaje> getPersonajesRegistrados(){
    	return (dataP.GetPersonajesRegistrados());
    }
    
    public void generarNuevoTurno(){
    	    
        switch (turno) {
		case 0: generarPrimerTurnoAleatorio();break;
		case 1: turno=2;break;
		case 2: turno=1;break;
        }
    }
    	
	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}


	public void generarPrimerTurnoAleatorio() {
		double numeroAleatorio;
		do {
    		numeroAleatorio=Math.random();
    		
			if (numeroAleatorio > 0.5) {
				turno = 2;
			} else {
				turno = 1;
			} 
		} while (numeroAleatorio==0.5);
	}
    
    public void ataque(Personaje j1, Personaje j2, int puntosAtaque){

    	switch (turno) {
    	
		case 1:{
			j1.ataca(j2, puntosAtaque);
			if(j2.getVida()==0){
				j1.aumentaPuntosTotales();
				//fin partida
				j1.recuperacion();
			}	
		break;}
		
		case 2:{
			j2.ataca(j1, puntosAtaque);
			if(j1.getVida()==0){
				j2.aumentaPuntosTotales();
				//fin partida
			}	
		break;}
		}
    	
    	generarNuevoTurno();
    }
    
    public void defensa(Personaje j){
    	Personaje jOriginal = dataP.getByNombre(j);
    	j.defiende(jOriginal.getVida(),jOriginal.getEnergia());
    	generarNuevoTurno();
    }
	
    
    
}
