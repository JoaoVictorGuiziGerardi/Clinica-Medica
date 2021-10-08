
public class OutrosFuncionarios extends Funcionario {
	private String cargo;
	private static double gratificacao = 500.00;
	private static int limite_consultas_mes = 100, consultas_realizadas_mes = 0;
	
	public OutrosFuncionarios(String nome, String cpf, String rg, String sexo, String est_civil, Endereco endereco,
			String data_admissao, String nro_carteira_trabalho, double salario_base, String usuario, String senha,
			String cargo) {
		super(nome, cpf, rg, sexo, est_civil, endereco, data_admissao, nro_carteira_trabalho, salario_base, usuario, senha);
		setCargo(cargo);
	}
	
	public double calcularSalario(){
		if (getConsultas_realizadas_mes() > getLimite_consultas_mes())
			return super.getSalario_base() + gratificacao;
		else
			return super.getSalario_base();
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void adicionaConsulta(Medico medico, Consulta consulta, String data, String horario) {
		consulta.setFuncionario_registrou(this);
		consulta.setData(data);
		consulta.setHorario(horario);
		consulta.setMedico(medico);
	}
	
	public void retiraConsulta(Consulta consulta) {
		setConsultas_realizadas_mes( (consultas_realizadas_mes - 1) );
	}
	
	public void realizaConsulta() {
		setConsultas_realizadas_mes( (consultas_realizadas_mes + 1) );
	}
	
	public void zerarConsulta() {
		setConsultas_realizadas_mes(0);
	}

	public static double getGratificacao() {
		return gratificacao;
	}
	
	public static void setGratificacao(double grat) {
		if (grat > 0)
			gratificacao = grat;
	}

	public static int getLimite_consultas_mes() {
		return limite_consultas_mes;
	}
	
	public static void setLimite_consultas_mes(int limite_mes) {
		if (limite_mes > 0)
			limite_consultas_mes = limite_mes;
	}

	public static int getConsultas_realizadas_mes() {
		return consultas_realizadas_mes;
	}

	public static void setConsultas_realizadas_mes(int num_consultas_mes) {
		if (num_consultas_mes > 0)
			consultas_realizadas_mes = num_consultas_mes;
	}

}
