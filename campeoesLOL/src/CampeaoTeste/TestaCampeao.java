package CampeaoTeste;

import Campeao.Atirador;
import Campeao.Campeao;
import Campeao.Tank;

public class TestaCampeao {

	public static void main(String[] args) {

		Campeao atirador1 = new Atirador("Jinx", 500, 400);
		atirador1.setDanoAtaqueBasico(60);


		Campeao tank1 = new Tank("Garen", 900, 400);
		tank1.setDanoAtaqueBasico(30);
		
		
		System.out.println("Nome:" + atirador1.getNome());
		System.out.println("Vida = " + atirador1.getVida());
		System.out.println("Mana = " + atirador1.getMana());

		System.out.println();

		System.out.println("Nome:" + tank1.getNome());
		System.out.println("Vida = " + tank1.getVida());
		System.out.println("Mana = " + tank1.getMana());
		System.out.println();
		
		tank1.primeiraSkill(atirador1);
		tank1.segundaSkill(atirador1);
		tank1.ultimate(tank1);
		
		System.out.println("vida: " + atirador1.getVida());
		System.out.println("mana: " + tank1.getMana());
		
		atirador1.ataqueBasico(tank1);
	
		System.out.println("vida tank: " + tank1.getVida());
		System.out.println("vida atirador: " + atirador1.getVida());

		

	}

}
