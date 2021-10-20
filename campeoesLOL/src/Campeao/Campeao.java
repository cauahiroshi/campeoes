package Campeao;

public abstract class Campeao {

	protected String nome;
	protected int vida;
	protected int mana;
	protected int danoAtaqueBasico;
	
	public void campeaoAlvo(Campeao alvo) {
	}

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

	public int getDanoAtaqueBasico() {
		return danoAtaqueBasico;
	}

	public void setDanoAtaqueBasico(int ataqueBasico) {
		this.danoAtaqueBasico = ataqueBasico;
	}

	public boolean ataqueBasico(Campeao alvo) {
		
		alvo.vida -= this.danoAtaqueBasico;
		return true; 
	}
	
	public abstract void primeiraSkill(Campeao alvo);

	public abstract void segundaSkill(Campeao alvo);

	public abstract void ultimate(Campeao alvo);
	

}
