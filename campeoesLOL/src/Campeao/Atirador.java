package Campeao;

public class Atirador extends Campeao implements Passiva {
	
	private int tiroDePistola = 90; 
	private int tiroDeSniper = 120; 
	private int tiroDeBazuca = 250; 
	
	
	public Atirador(String nome, int vida, int mana){
		super(nome, vida, mana);
	}
	
	
	@Override
	public void passiva() {
		double cura = vidaInicial / (vidaInicial/2); 
		super.vidaAtual += cura; 
	}
	
	
	@Override
	public void ataqueBasico(Campeao alvo) {
		alvo.vidaAtual -= super.danoAtaqueBasico;
		
		if (vidaAtual < vidaInicial) {
			passiva(); 
		}
	}
	

	@Override
	public void primeiraSkill(Campeao alvo) {
		if (super.manaAtual >= 30){
			super.manaAtual -= 30; 
			alvo.vidaAtual -= tiroDePistola; 
		}else {
			System.out.println("Mana insuficiente");
		}
	}
	

	@Override
	public void segundaSkill(Campeao alvo) {
		if (super.manaAtual >= 60) {
			super.manaAtual -= 60; 
			alvo.vidaAtual -= tiroDeSniper; 
		}else {
			System.out.println("Mana Insuficiente");
		}
	}
	

	@Override
	public void ultimate(Campeao alvo) {
		if (super.manaAtual >= 100) {
			super.manaAtual -= 100;
			alvo.vidaAtual -= tiroDeBazuca; 
		}else {
			System.out.println("Mana insuficiente");
		}
	}

}
