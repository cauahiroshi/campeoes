
public class TestaCampeao {

	public static void main(String[] args) {

		Campeao atirador1 = new Atirador("Jinx", 500, 400);
		atirador1.setDanoDeAtaqueBasico(60.0);

		Campeao tank1 = new Tank("Garen", 900, 400);
		tank1.setDanoDeAtaqueBasico(30); 
	

		System.out.println("Nome:" + atirador1.getNome());
		System.out.println("Vida = " + atirador1.getVida());
		System.out.println("Mana = " + atirador1.getMana());

		System.out.println();

		System.out.println("Nome:" + tank1.getNome());
		System.out.println("Vida = " + tank1.getVida());
		System.out.println("Mana = " + tank1.getMana());

	}

}
