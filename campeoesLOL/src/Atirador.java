
public class Atirador extends Campeao {

	@Override
	public void execucaoDeSkill(Campeao campeaoAlvo, double manaNecessaria) {
		if (super.mana >= manaNecessaria) {
			super.mana -= manaNecessaria;
			campeaoAlvo.vida -= this.valorSkill;
		} else {
			System.out.println("Mana insuficiente");
		}

	}

}