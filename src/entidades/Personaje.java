package entidades;

public class Personaje {
	
	private int codigo;
	private String nombre;
	private int vida;
	private int energia;
	private int defensa;
	private int evasion;
	private int puntosTotales;
	
	
	public Personaje(){
		this.vida=0;
		this.defensa=0;
		this.energia=0;
		this.evasion=0;
		this.puntosTotales=200;
	}
	
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

	//valida que la suma total de los puntos del personaje sea la correcta y
	//evasion <=80
	//defensa <=20
    //se puede mejorar?
	public boolean validarPuntosAsignados() {
		boolean rta;
		int aux;
		
		aux=defensa+vida+energia+evasion;
		
		if (aux<=puntosTotales && evasion<=80 && defensa<=20) {
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
		
		//evalua evasion
		//se puede mejorar?
		if (!((numAleatorio*100)>pAtacado.getEvasion())) {
			//disminuye vida del atacado, si el ataque supera la vida.. asigna 0 vida
			if(pAtacado.vida-puntosAtaque>0){
				pAtacado.vida=pAtacado.vida-puntosAtaque;
			} else{
				pAtacado.vida=0;
			}
		} 		
	}
	
	public void defiende(int vidaOriginal, int energiaOriginal){
		//la vida actual + la vida recuperada no puede superar la vida original
		if(this.vida+(vidaOriginal*this.defensa/250)<vidaOriginal){
		this.vida=this.vida+(vidaOriginal*this.defensa/250);
		}else
		{
			this.vida=vidaOriginal;
		}
		//la energia actual + la energia recuperada no puede superar la energia original
		if(this.energia+(energiaOriginal*defensa/100)<energiaOriginal){
		this.energia=this.energia+(energiaOriginal*defensa/100);
		}else{
			this.energia=energiaOriginal;
		}		
	}
	
	public void aumentaPuntosTotales(){
		this.puntosTotales=+10;
	}

	public void recuperacion() {

	}
}
