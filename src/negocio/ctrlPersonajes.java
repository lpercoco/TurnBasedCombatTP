package negocio;

import java.util.ArrayList;
import entidades.Personaje;

public class ctrlPersonajes {
	private ArrayList<Personaje> personajes;
	
	public int generarCodigo() {
		int nuevoCodigo=0;
		for (Personaje p : personajes) {
			if(p.getCodigo()>nuevoCodigo) nuevoCodigo=p.getCodigo();
		}
		nuevoCodigo+=1;
		return nuevoCodigo;
		
	}
	
}
