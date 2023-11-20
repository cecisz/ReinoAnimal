package ReinoAnimal;
/**
 * 
 * @author Maria Cecilia
 *
 */
public class Aereo extends Animal {
	private double altitude;
	
	/**
	 * Esse método indica que o animal aéreo está voando
	 */
	public void voar() {
		System.out.println("O animal está voando...");
	}
	
	/**
	 * Esse método indica que o animal aéreo está comendo
	 */
	public void comer() {
		System.out.println("O animal aéreo está comendo...");
	}
	/**
	 * Esse método indica o perfil do animal aéreo
	 */
	public void perfil() {
		System.out.println("Espécie: " + getEspecie() + " | Sexo: " + getSexo() + " | Data: " + getData() + " | Altitude em que vooa: " + this.altitude);
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	
}
