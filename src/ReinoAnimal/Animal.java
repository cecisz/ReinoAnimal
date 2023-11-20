package ReinoAnimal;
/**
 * 
 * @author Maria Cecilia
 * Essa classe representa um animal 
 */
public class Animal {
	private String especie;
	private String sexo;
	private String data;
	private static int contador;
	
	public Animal() {
		setContador();
	}
	
	/**
	 * Esse método indica que o animal está comendo
	 */
	public void comer() {
		System.out.println("O animal está comendo...");
	}
	/**
	 * Esse método indica o perfil do animal
	 */
	public void perfil() {
		System.out.println("Espécie: " + this.especie + " | Sexo: " + this.sexo + " | Data: " + this.data);
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static int getContador() {
		return contador;
	}
	private static void setContador() {
		Animal.contador = contador + 1;
	}
	
	/**
	 * Esse método immprime a quantidade de animais instanciados
	 */
	public static void contar() {
		System.out.println(contador);
	}
	
	
}
