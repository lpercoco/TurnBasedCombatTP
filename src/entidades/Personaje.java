package entidades;

public class Personaje {
	
	private int codigo;
	private String nombre;
	private int vida;
	private int energia;
	private int defensa;
	private int evasion;
	private int puntosTotales;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getEvasion() {
		return evasion;
	}
	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}
	public int getPuntosTotales() {
		return puntosTotales;
	}
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	//valida que la suma total de los puntos del personaje sea la correcta
	//faltan dos validaciones
	//evasion <=80
	//defensa <=20
	public boolean validarPuntosAsignados() {
		boolean rta;
		int aux;
		aux=defensa+vida+energia+evasion;
		//remplazar el 200 por una variable?
		if (aux<=200) {
			rta=true;
		} else {
			rta=false;

		}
		return rta;
	}
	

	public boolean equals(String nombre){
		return  (nombre == this.getNombre());
}
	//hay que validar que puntosAtaque no supere la energia del j atacante
	
	public void ataca(Personaje pAtacado,int puntosAtaque){
		double numAleatorio=Math.random();
		
		//descuenta la energia del atacante, ya sea que el atacado evada o no
		this.energia=this.energia-puntosAtaque;
		
		//evalua evasion y descuenta vida en el atacado
		if (!((numAleatorio*100)>pAtacado.getEvasion())) {
			pAtacado.vida=pAtacado.vida-puntosAtaque;
		} 		
	}

}
