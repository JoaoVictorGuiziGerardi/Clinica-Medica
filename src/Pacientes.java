
public abstract class Pacientes extends Pessoa {
	private String data_nasc, data_cadastro, data_ult_consulta;
	
	public Pacientes(String nome, String cpf, String rg, String sexo, String est_civil, String data_nasc,
			String data_cadastro, Endereco endereco) {
		super(nome, cpf, rg, sexo, est_civil, endereco);
		setSexo(sexo);
		setData_nasc(data_nasc);
		setData_cadastro(data_cadastro);
	}
	
	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getData_ult_consulta() {
		return data_ult_consulta;
	}

	public void setData_ult_consulta(String data_ult_consulta) {
		this.data_ult_consulta = data_ult_consulta;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}
	
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}	

}
