package negocio;

import data.DataPersonaje;
import entidades.Personaje;

public class CtrlPersonajes {	
	private data.DataPersonaje dataP;
	
	public CtrlPersonajes(){
		dataP=new DataPersonaje();
	}
	
	public void add(Personaje p) {
		dataP.add(p);		
	}

	public void update(Personaje p){
		dataP.update(p);
	}
	
	public Personaje getByNombre(Personaje per){
		Personaje p = new Personaje();
		p=dataP.getByNombre(per);
		return p;
	}
	
	public void delete(Personaje p){
		dataP.delete(p);
	}
}
