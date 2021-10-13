
public abstract class Pacientes extends Pessoa {
	private String data_nasc, data_cadastro, data_ult_consulta;
	
	public Pacientes(String nome, String cpf, String rg, String sexo, String est_civil, String data_nasc,
			String data_cadastro, Endereco endereco) {
		super(nome, cpf, rg, sexo, est_civil, endereco);
		setSexo(sexo);
		setData_nasc(data_nasc);
		setData_cadastro(data_cadastro);
	}
	
	public abstract double valor_consulta(Medico medico, double valor_total);
	
	 public String mostrarDados(){
		   return super.mostrarDados()
		   + "\nData de nascimento: " + getData_nasc()
		   + "\nData de cadastro:" + getData_cadastro()
		   + "\nData da ultima consulta:" + getData_ult_consulta();
 		  
}
	
	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		if (data_nasc.length() > 0)
		this.data_nasc = data_nasc;
	}

	public String getData_ult_consulta() {
		return data_ult_consulta;
	}

	public void setData_ult_consulta(String data_ult_consulta) {
		if (data_ult_consulta.length() > 0)
		this.data_ult_consulta = data_ult_consulta;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}
	
	public void setData_cadastro(String data_cadastro) {
		if (data_cadastro.length() > 0)
		this.data_cadastro = data_cadastro;
	}	

}
