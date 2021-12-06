package CampeaoTeste;

import Campeao.Atirador;
import Campeao.Campeao;
import Campeao.Tank;

public class TestaCampeao {

	public static void main(String[] args) {

		Campeao atirador1 = new Atirador("Jinx");
		atirador1.setDanoAtaqueBasico(60);


		Campeao tank1 = new Tank("Garen");
		tank1.setDanoAtaqueBasico(30);
		
		
		System.out.println("Nome:" + atirador1.getNome());
		System.out.println("Vida = " + atirador1.getVida());
		System.out.println("Mana = " + atirador1.getMana());
		System.out.println();

		System.out.println("Nome:" + tank1.getNome());
		System.out.println("Vida = " + tank1.getVida());
		System.out.println("Mana = " + tank1.getMana());
		System.out.println();
		
	    atirador1.ataqueBasico(tank1); 
	    atirador1.ataqueBasico(tank1); 
	    
	    tank1.segundaSkill(atirador1);
	    
	    atirador1.ataqueBasico(tank1); 
	    atirador1.ataqueBasico(tank1);
	    
	    
	    atirador1.ultimate(tank1);
	    
	    tank1.ataqueBasico(atirador1);
	    tank1.ataqueBasico(atirador1);
	    tank1.ataqueBasico(atirador1);
	   
	  
	    System.out.println("tank vida: " + tank1.getVida());
	    System.out.println("atirador vida: " + atirador1.getVida());
	    System.out.println();
	    
	    System.out.println("tank mana: " + tank1.getMana());
	    System.out.println("atirador mana: " + atirador1.getMana());

	}

}
