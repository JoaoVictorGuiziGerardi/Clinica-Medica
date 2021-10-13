
public class Exame {
	private String nome, resultado;
	private double preco;
	
	public Exame(String nome, double preco) {
		setNome(nome);
		setPreco(preco);
	}
	
	
	 public String mostrarDados(){
		   return "\nNome: " + getNome()
		   + "\nResultado:" + getResultado()
		   + "\nPreço:" + getPreco();
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
		this.nome = nome;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		if (resultado.length() > 0)
		this.resultado = resultado;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco >= 0)
		this.preco = preco;
	}

}
