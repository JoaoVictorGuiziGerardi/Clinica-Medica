
public class Endereco {
	private String rua, nro, complemento, bairro, cep, cidade;
	
	public Endereco(String rua, String nro, String complemento, String bairro, String cep, String cidade) {
		setRua(rua);
		setNro(nro);
		setComplemento(complemento);
		setBairro(bairro);
		setCep(cep);
		setCidade(cidade);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}