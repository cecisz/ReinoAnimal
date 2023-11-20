package ReinoAnimal;
/**
 * 
 * @author Maria Cecilia
 *
 */
public class Terrestre extends Animal{
	
	private String local;
	private boolean pelagem;
	/**
	 * Esse método indica que o animal Terrestre está se movendo
	 */
	public void mover() {
		System.out.println("O animal está se movendo...");
	}
	/**
	 * Esse método indica que o animal terrestre está comendo
	 */
	public void comer() {
		System.out.println("O animal terrestre está comendo...");
	}
	/**
	 * Esse método indica o perfil do animal terrestre
	 */
	public void perfil() {
		System.out.println("Espécie: " + getEspecie() + " | Sexo: " + getSexo() + " | Data: " + getData() + " "
				+ " | Local que o animal vive: " + this.local + " | Possui pelagem? " + this.pelagem);
	}
	

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public boolean isPelagem() {
		return pelagem;
	}

	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
	
	

}
