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
    
    public void getNuevoTurno(){
    	    
        switch (turno) {
		case 0: generarPrimerTurnoAleatorio();break;
		case 1: turno=2;break;
		case 2: turno=1;break;
        }
    }
    	
	public int getTurno() {
		return turno;
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
    
    public void ataque(int nroJTurno, Personaje j1, Personaje j2, int puntosAtaque){
    	if (nroJTurno==1) {
    		j1.ataca(j2, puntosAtaque);
			
		} else {
			j2.ataca(j1, puntosAtaque);

		}
    	
    }
	
}
