package Campeao;

public class Tank extends Campeao implements Passiva {
	
	protected final int vidaInicial;
	protected final int manaInicial;
	private int golpeDeEspada = 50;
	private int giroDeEspada = 100;
	private int superCura = 200; 


	public Tank(String nome, int vida, int mana){
		super.setNome(nome);
		vidaInicial=vida;
		manaInicial=mana; 
	}
	
	
	@Override
	public void passiva() {
		double regenerarMana = manaInicial / (manaInicial/2); 
		super.manaAtual += regenerarMana;
		
	}
	
	
	@Override
	public void ataqueBasico(Campeao alvo) {
		alvo.vidaAtual -= super.danoAtaqueBasico;
		if(manaAtual<=manaInicial){
			passiva();
		}
	}
	

	@Override
	public void primeiraSkill(Campeao alvo) {
		if (super.manaAtual >= 30) {
			super.manaAtual -= 30;
			alvo.vidaAtual -= golpeDeEspada;
		}
	}
	

	@Override
	public void segundaSkill(Campeao alvo) {
		if (super.manaAtual >= 60) {
			super.manaAtual -= 60; 
			alvo.vidaAtual -= giroDeEspada;
		}else {
			System.out.println("Mana insuficiente");
		}
	}
	

	@Override
	public void ultimate(Campeao alvo) {
		if (super.manaAtual >= 130) {
			super.manaAtual -= 130;
			alvo.vidaAtual += superCura; 
		}else {
			System.out.println("Mana Insuficiente");
		}
	}

}
