
public abstract class Campeao {

	private String nome;
	protected int vida;
	protected int mana;
	private double danoDeAtaqueBasico;
	protected double danoPrimeiraSkill;
	protected double danoSegundaSkill;
	protected double valorUltimate; 

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

	public double getDanoDeAtaqueBasico() {
		return danoDeAtaqueBasico;
	}

	public void setDanoDeAtaqueBasico(double danoDeAtaqueBasico) {
		this.danoDeAtaqueBasico = danoDeAtaqueBasico;
	}


}
