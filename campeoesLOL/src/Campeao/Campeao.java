package Campeao;

public abstract class Campeao {

	protected String nome;
	protected int vida;
	protected int mana;
	protected double danoAtaqueBasico;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;

	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
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
