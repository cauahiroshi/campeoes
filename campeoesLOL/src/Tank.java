
public class Tank extends Campeao {

	@Override
	public void execucaoDeSkill(Campeao campeaoAlvo, double manaNecessaria) {
		if (super.mana >= manaNecessaria) {
			super.mana -= manaNecessaria;
			campeaoAlvo.vida += super.valorSkill;
		} else {
			System.out.println("Mana insuficente");
		}
	}

}
