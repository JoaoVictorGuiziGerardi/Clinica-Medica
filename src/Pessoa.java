
public class Pessoa {
	private String nome, cpf, rg, sexo;
	private Endereco endereco;
	private byte est_civil;
	public Pessoa(String nome, String cpf, String rg, String sexo, String est_civil, Endereco endereco) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setSexo(sexo);
		setEst_civil(est_civil);
		setEndereco(endereco);
	}
	
	public Pessoa(String cpf) {
		setCpf(cpf);
	}
	
	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (validaCPF(cpf) == true) this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		if (rg.length() > 0)
		this.rg = rg;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if (sexo.length() > 0)
		this.sexo = sexo;
	}
	
	public String getEst_civil() {
		switch(est_civil) {
		case 0: return "Solteiro(a)";
		case 1: return "Casado(a)";
		case 2: return "Divorciado(a)";
		default: return null;
		}
		
	}

	public void setEst_civil(String est_civil) {
		
		if(est_civil.equalsIgnoreCase("solteiro") || est_civil.equalsIgnoreCase("solteira"))
			this.est_civil = 0;
		if(est_civil.equalsIgnoreCase("casado") || est_civil.equalsIgnoreCase("casada"))
			this.est_civil = 1;
		if(est_civil.equalsIgnoreCase("divorciado") || est_civil.equalsIgnoreCase("divorciada"))
			this.est_civil = 2;
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public boolean validaCPF(String cpf) {
		int num[] = new int[11];
		
		if (cpf.length() == 11) { // Sem pontuação
			for (int i = 0; i < 11; i++) {
				if (cpf.charAt(i) >= 48 && cpf.charAt(i) <= 57)
					num[i] = cpf.charAt(i) - 48;
				else
					return false;
			}
		}
		else if (cpf.length() == 14) { // Com pontuação
			int j = 0; // Percorre a String
			for (int i = 0; i < 11; i++) {
				if (cpf.charAt(j) >= 48 && cpf.charAt(j) <= 57)
					num[i] = cpf.charAt(j) - 48;
				else
					return false;
				
				if (i == 2 || i == 5 || i == 8) j++;
				j++;
			}
		}
		else {
			return false;
		}
		
		if ( (num[0] == num[1]) && (num[1] == num[2]) && (num[2] == num[3]) && (num[3] == num[4]) && (num[4] == num[5]) && 
				(num[5] == num[6]) && (num[6] == num[7]) && (num[7] == num[8]) && (num[9] == num[10]) && (num[10] == num[0]) ) {
			return false;
	    }
		else {
			int soma1 = 0;
			int aux_soma = 10;
			
			for (int i = 0; i < 9; i++) {
				soma1 += num[i] * aux_soma;
				aux_soma--;
			}
			
			int resto1 = (soma1 * 10) % 11;
			
			if (resto1 == 10) resto1 = 0;
			
			int soma2 = 0;
			aux_soma = 11;
			
			for (int i = 0; i < 10; i++) {
				soma2 += num[i] * aux_soma;
				aux_soma--;
			}
			
			int resto2 = (soma2 * 10) % 11;
			
			if (resto2 == 10) resto2 = 0;
			
			if ( resto1 == num[9] && resto2 == num[10] )
				return true;
			else
				return false;
		}
	}

}
