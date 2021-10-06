
public class TestaCampeao {

	public static void main(String[] args) {

		Campeao atirador1 = new Atirador();
		atirador1.setNome("Jinx");
		atirador1.setVida(500);
		atirador1.setMana(1000.0);
		atirador1.setDanoDeAtaqueBasico(60.0);
		atirador1.setValorSkill(180.0);
		atirador1.setDanoUltimate(320.0);

		Campeao tank1 = new Tank();
		tank1.setNome("Garen");
		tank1.setVida(700.0);
		tank1.setMana(900.0);
		tank1.setDanoDeAtaqueBasico(45.0);
		tank1.setValorSkill(200);
		tank1.setDanoUltimate(260);

		atirador1.execucaoDeSkill(tank1, 150.0);
		tank1.execucaoDeSkill(tank1, 170.0);

		atirador1.execucaoDeUltimate(tank1, 300.0);
		tank1.execucaoDeUltimate(atirador1, 280);

		System.out.println("Nome:" + atirador1.getNome());
		System.out.println("Vida = " + atirador1.getVida());
		System.out.println("Mana = " + atirador1.getMana());

		System.out.println();

		System.out.println("Nome:" + tank1.getNome());
		System.out.println("Vida = " + tank1.getVida());
		System.out.println("Mana = " + tank1.getMana());

	}

}
