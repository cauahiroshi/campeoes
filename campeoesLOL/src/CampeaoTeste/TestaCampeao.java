package CampeaoTeste;

import Campeao.Atirador;
import Campeao.Campeao;
import Campeao.Tank;

public class TestaCampeao {

	public static void main(String[] args) {

		Campeao atirador1 = new Atirador("Jinx", 700, 500);
		atirador1.setDanoAtaqueBasico(60);


		Campeao tank1 = new Tank("Garen", 1200, 500);
		tank1.setDanoAtaqueBasico(30);
		
		
		System.out.println("Nome:" + atirador1.getNome());
		System.out.println("Vida = " + atirador1.getVida());
		System.out.println("Mana = " + atirador1.getMana());
		System.out.println();

		System.out.println("Nome:" + tank1.getNome());
		System.out.println("Vida = " + tank1.getVida());
		System.out.println("Mana = " + tank1.getMana());
		System.out.println();
		
	   
	  
	    System.out.println("tank vida: " + tank1.getVida());
	    System.out.println("atirador vida: " + atirador1.getVida());
	    System.out.println();
	    
	    System.out.println("tank mana: " + tank1.getMana());
	    System.out.println("atirador mana: " + atirador1.getMana());

	}

}
