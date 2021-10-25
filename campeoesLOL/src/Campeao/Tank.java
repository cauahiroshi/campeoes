package Campeao;

public class Tank extends Campeao implements Passiva {
	
	private int golpeDeEspada = 50;
	private int giroDeEspada = 100;
	private int superCura = 200; 


	public Tank(String nome, int vida, int mana ){
		super.setNome(nome);
		super.setVida(vida);
		super.setMana(mana);
	}

	@Override
	public void primeiraSkill(Campeao alvo) {
		if (super.mana >= 30) {
			super.mana -= 30;
			alvo.vida -= golpeDeEspada;
		}
	}

	@Override
	public void segundaSkill(Campeao alvo) {
		if (super.mana >= 60) {
			super.mana -= 60; 
			alvo.vida -= giroDeEspada;
		}else {
			System.out.println("Mana insuficiente");
		}
	}

	@Override
	public void ultimate(Campeao alvo) {
		if (super.mana >= 130) {
			super.mana -= 130;
			alvo.vida += superCura; 
		}else {
			System.out.println("Mana Insuficiente");
		}
	}
	

	@Override
	public void ataqueBasico(Campeao alvo) {
		alvo.vida -= super.danoAtaqueBasico;
	}
	
	@Override
	public void passiva() {
		
	}

}
