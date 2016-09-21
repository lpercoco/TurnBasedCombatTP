package negocio;

import java.util.ArrayList;

import data.DataPersonaje;
import entidades.Personaje;

public class CtrlCombate {

	private data.DataPersonaje dataP;
	
	public CtrlCombate(){
		dataP=new DataPersonaje();
	}
	
/*	Defensa:
	    Si el jugador opta por defender no podrá atacar en dicho turno, 
	    pero a cambio de ello el personaje recuperará un porcentaje de la energía y 
	    de la vida que tenía al comenzar el juego. Calculado de la siguiente forma:
	        energiaARecupearar = energiaOriginal * defensa / 100
	        vidaARecuperar = vidaOriginal * defensa / 250
	    Los puntos de vida o energia recueperados se sumaran 
	    pero no podrán superar los valores originales del comienzo de la partida.
*/
    public ArrayList<Personaje> getPersonajesRegistrados(){
    	return (dataP.GetPersonajesRegistrados());
    }
	public void defensa(){
		
	}
	
}
