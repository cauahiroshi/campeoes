package Campeao;

public abstract class Campeao {

	protected String nome;
	public int vidaAtual;
	public int manaAtual;
	protected double danoAtaqueBasico;
	
	public Campeao(){
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vidaAtual;
	}

	public void setVida(int vida) {
		this.vidaAtual = vida;
	}

	public int getMana() {
		return manaAtual;
	}

	public void setMana(int mana) {
		this.manaAtual = mana;
	}

	public double getDanoAtaqueBasico() {
		return danoAtaqueBasico;
	}

	public void setDanoAtaqueBasico(int ataqueBasico) {
		this.danoAtaqueBasico = ataqueBasico;
	}
	

	public abstract void ataqueBasico(Campeao alvo); 
	
	public abstract void primeiraSkill(Campeao alvo);

	public abstract void segundaSkill(Campeao alvo);

	public abstract void ultimate(Campeao alvo);
	
	

}
