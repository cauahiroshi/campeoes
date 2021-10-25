package Campeao;

public class Atirador extends Campeao implements Passiva {
	
	private int tiroDePistola = 90; 
	private int tiroDeSniper = 120; 
	private int tiroDeBazuca = 230; 
	
	public Atirador(String nome, int vida, int mana ){
		super.setNome(nome);
		super.setVida(vida);
		super.setMana(mana);
	}

	@Override
	public void primeiraSkill(Campeao alvo) {
		if (super.mana >= 30){
			super.mana -= 30; 
			alvo.vida -= tiroDePistola; 
		}else {
			System.out.println("Mana insuficiente");
		}
	}

	@Override
	public void segundaSkill(Campeao alvo) {
		if (super.mana >= 60) {
			super.mana -= 60; 
			alvo.vida -= tiroDeSniper; 
		}else {
			System.out.println("Mana Insuficiente");
		}
	}

	@Override
	public void ultimate(Campeao alvo) {
		if (super.mana >= 100) {
			super.mana -= 100;
			alvo.vida -= tiroDeBazuca; 
		}else {
			System.out.println("Mana insuficiente");
		}
	}

	@Override
	public void ataqueBasico(Campeao alvo) {
		alvo.vida -= super.danoAtaqueBasico;
		
		if (this.vida < 500) {
			passiva(); 
		}
	}
	
	@Override
	public void passiva() {
		double cura = this.vida / this.vida ; 
		super.vida += cura; 
	}

}
