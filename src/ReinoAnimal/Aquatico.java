package ReinoAnimal;
/**
 * 
 * @author Maria Cecilia
 *
 */
public class Aquatico extends Animal{
	
	private String tipoAgua;
	private boolean escama;
	
	/**
	 * Esse método indica que o animal aquático está nadando
	 */
	public void nadar() {
		System.out.println("O animal está nadando...");
	}
	/**
	 * Esse método indica que o animal aquático está comendo
	 */
	public void comer() {
		System.out.println("O animal aquático está comendo...");
	}
	/**
	 * Esse método indica o prfil do animal aquático
	 */
	public void perfil() {
		System.out.println("Espécie: " + getEspecie() + " | Sexo: " + getSexo() + " | Data: " + getData() + 
				" | Tipo de água que o animal vive: " + this.tipoAgua + " | Possui escamas? " + this.escama);
	}
	

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscama() {
		return escama;
	}

	public void setEscama(boolean escama) {
		this.escama = escama;
	}
	
	

}
