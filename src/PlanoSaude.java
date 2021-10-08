
public class PlanoSaude {
	private String nome, cnpj;
	private Endereco endereco;
	
	public PlanoSaude(String nome, String cnpj, Endereco endereco) {
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

	
	public Endereco getEndereco() {
		return endereco;
	}
	

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}