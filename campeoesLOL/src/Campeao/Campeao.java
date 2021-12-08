package Campeao;

public abstract class Campeao {

	protected String nome;
	protected final int vidaInicial;
	protected final int manaInicial;
	public int vidaAtual;
	public int manaAtual;
	protected double danoAtaqueBasico;
	
	public Campeao(String nome, int vida, int mana){
		this.nome=nome; 
		this.vidaInicial=vida; 
		this.manaInicial=mana;
		vidaAtual = vidaInicial;
		manaAtual = manaInicial;
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
