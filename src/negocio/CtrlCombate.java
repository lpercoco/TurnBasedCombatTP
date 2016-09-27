package negocio;

import data.DataPersonaje;
import entidades.Personaje;

public class CtrlCombate {

	private data.DataPersonaje dataP;
	private Personaje jugador1,jugador2,jugadorTurnoActual;
	@SuppressWarnings("unused")
	private int energiaActualJ1,energiaActualJ2,vidaActualJ1,vidaActualJ2;
	
	public CtrlCombate(){
		dataP=new DataPersonaje();
	}
	
	
//al finalizar partida, jugadorTurnoActual=null	
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

//    	switch (turno) {
//    	
//		case 1:{
//			j1.ataca(j2, puntosAtaque);
//			if(j2.getVida()==0){
//				j1.aumentaPuntosTotales();
//				//fin partida
//				j1.recuperacion();
//				dataP.update(j1);
//			}	
//		break;}
//		
//		case 2:{
//			j2.ataca(j1, puntosAtaque);
//			if(j1.getVida()==0){
//				j2.aumentaPuntosTotales();
//				//fin partida
//			}	
//		break;}
//		}
//    	
//    	generarNuevoTurno();
    }
    
    public void defensa(Personaje j){
    	Personaje jOriginal = dataP.getByNombre(j);
    	j.defiende(jOriginal.getVida(),jOriginal.getEnergia());
    	generarNuevoTurno();
    }


	public void setJugador1(Personaje p) {
		jugador1=p;
	}


	public void setJugador2(Personaje p) {
		jugador2=p;
	}
	
	//se repite  codigo del otro controlador ¿?
	//recibir objeto personaje o dejar como asi?
	//crear metodo en data persona que reciba string?
	public Personaje getByNombre(String nombre){
		Personaje p = new Personaje();
		p.setNombre(nombre);
		return dataP.getByNombre(p);
		
	}
	
	public void nuevaPartida(){
		jugadorTurnoActual=null;
		energiaActualJ1=jugador1.getEnergia();
		energiaActualJ2=jugador2.getEnergia();
		vidaActualJ1=jugador1.getVida();
		vidaActualJ2=jugador2.getVida();
		
	}
	
    
}
