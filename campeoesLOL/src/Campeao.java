
public abstract class Campeao {

	private String nome;
	protected double vida;
	protected double mana;
	private double danoDeAtaqueBasico;
	protected double valorSkill; // atirador 150 mana, tank 170 mana
	private double danoUltimate; // atirador 300 mana, tank 280 mana

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getDanoDeAtaqueBasico() {
		return danoDeAtaqueBasico;
	}

	public void setDanoDeAtaqueBasico(double danoDeAtaqueBasico) {
		this.danoDeAtaqueBasico = danoDeAtaqueBasico;
	}

	public double getDanoDeAtaqueBasico(Campeao campeaoAlvo) {
		return campeaoAlvo.vida -= this.danoDeAtaqueBasico;

	}

	public double getMana() {
		return mana;
	}

	public void setMana(double mana) {
		this.mana = mana;
	}

	public double getValorSkill() {
		return valorSkill;
	}

	public void setValorSkill(double valorSkill) {
		this.valorSkill = valorSkill;
	}

	public double getDanoUltimate() {
		return danoUltimate;
	}

	public void setDanoUltimate(double danoUltimate) {
		this.danoUltimate = danoUltimate;
	}

	public abstract void execucaoDeSkill(Campeao campeaoAlvo, double manaNecessaria);

	public void execucaoDeUltimate(Campeao campeaoAlvo, double manaNecessaria) {
		if (this.mana >= manaNecessaria) {
			this.mana -= manaNecessaria;
			campeaoAlvo.vida -= this.danoUltimate;
		} else {
			System.out.println("mana insuficiente");
		}
	}

}
