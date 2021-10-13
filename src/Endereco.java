
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

	 public String mostrarDados(){
	    		   return "\nRua: " + getRua()
	    		   + "\nNumero:" + getNro()
	    		   + "\nComplemento:" + getComplemento()
	       		   + "\nBairro:" + getBairro()
	       		   + "\nCEP:" + getCep()
	       		   + "\nCidade:" + getCidade();
	   }
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua.length() > 0)
		this.rua = rua;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		if (nro.length() > 0)
		this.nro = nro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		if (complemento.length() > 0)
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if (bairro.length() > 0)
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() > 0)
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.length() > 0)
		this.cidade = cidade;
	}

}