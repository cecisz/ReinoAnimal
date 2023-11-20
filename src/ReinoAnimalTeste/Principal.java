package ReinoAnimalTeste;

import ReinoAnimal.*;
/**
 * 
 * @author Maria Cecilia
 * Essa classe é uma classe teste
 */
public class Principal {

	public static void main(String[] args) {
		
		Aquatico a1 = new Aquatico();
		
		a1.setEspecie("Carcharias taurus");
		a1.setSexo("Fêmea");
		a1.setData("7");
		a1.setTipoAgua("agua salgada");
		a1.setEscama(true);
		
		Aquatico a2 = new Aquatico();
		
		a2.setEspecie("Pygocentrus nattereri");
		a2.setSexo("Macho");
		a2.setData("3");
		a2.setTipoAgua("agua doce");
		a2.setEscama(true);
		
		Terrestre a3 = new Terrestre();
		
		a3.setEspecie("Felis catus");
		a3.setSexo("Fêmea");
		a3.setData("2");
		a3.setLocal("asia");
		a3.setPelagem(true);
		
		Terrestre a4 = new Terrestre();
		
		a4.setEspecie("Hydrochoerus hydrochaeris");
		a4.setSexo("Macho");
		a4.setData("8");
		a4.setLocal("América do Sul");
		a4.setPelagem(true);
		
		Aereo a5 = new Aereo();
		
		a5.setEspecie("Coragyps atratus");
		a5.setSexo("Macho");
		a5.setData("3");
		a5.setAltitude(54.5);
		
		Aereo a6 = new Aereo();
		
		a6.setEspecie("Amazona aestiva");
		a6.setSexo("Fêmea");
		a6.setData("10");
		a6.setAltitude(37.9);
		
		System.out.println(Animal.getContador());
		
	}
	
	
	
}
