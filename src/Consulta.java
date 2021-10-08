import java.util.List;

public class Consulta {
	private String data, horario, medicamentos_paciente, receita;
	private double valor_consulta, valor_exames;
	private Pacientes paciente;
	private Medico medico;
	private OutrosFuncionarios funcionario_registrou;
	private List <Exame> exames;
	
	public Consulta(String data, String horario, String medicamentos_paciente, double valor_consulta,
			PacientesSemPlano paciente, Medico medico, OutrosFuncionarios funcionario_registrou) {
		setData(data);
		setHorario(horario);
		setMedicamentos_paciente(medicamentos_paciente);
		setPaciente(paciente);
		setValor_consulta(valor_consulta);
		setMedico(medico);
		setFuncionario_registrou(funcionario_registrou);
	}
	
	public Consulta(String data, String horario, String medicamentos_paciente, double valor_consulta,
			PacientesComPlano paciente, Medico medico, OutrosFuncionarios funcionario_registrou) {
		setData(data);
		setHorario(horario);
		setMedicamentos_paciente(medicamentos_paciente);
		setPaciente(paciente);
		setValor_consulta_inicial(valor_consulta);
		setMedico(medico);
		setFuncionario_registrou(funcionario_registrou);
	}
	
	public Consulta(Pacientes paciente, Medico medico) {
		setPaciente(paciente);
		setMedico(medico);
	}
	
	public void realizarConsulta(String data, String receita, List <Exame> exames) {
		// Dados de Consulta
		setReceita(receita);
		receitarExames(exames);
		
		// Dados de Paciente
		getPaciente().setData_ult_consulta(data);
		if (paciente instanceof PacientesSemPlano) {
			((PacientesSemPlano) paciente).setValor_pago_ultima_consulta(getValor_consulta());
		}
		
		// Dados de Medico
		getMedico().realizaConsulta(this);
		
		// Dados de Outros Funcion�rios
		getFuncionario_registrou().realizaConsulta();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getMedicamentos_paciente() {
		return medicamentos_paciente;
	}

	public void setMedicamentos_paciente(String medicamentos_paciente) {
		this.medicamentos_paciente = medicamentos_paciente;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public double getValor_consulta() {
		double valor_consulta;
		
		if (paciente instanceof PacientesComPlano) {
			// Pacientes com Plano tem 75% de desconto
			valor_consulta = (this.valor_consulta / 4);
			setValor_consulta( valor_consulta ); 
		}
		else if (paciente instanceof PacientesSemPlano){
			
			if (((PacientesSemPlano) paciente).isPossui_desconto() == true) {
				
				double desconto = ((PacientesSemPlano) paciente).getValor_desconto();
				
				valor_consulta = (this.valor_consulta - desconto);
				setValor_consulta( valor_consulta );
			}			
		}
		
		valor_consulta = this.valor_consulta; // Se n�o passar em nenhum if
		return valor_consulta;
	}

	private void setValor_consulta_inicial(double valor_consulta) {
		if (valor_consulta > 0)
			this.valor_consulta = valor_consulta;
	}
	
	public void setValor_consulta(double valor_consulta) {
		if (valor_consulta > 0)
			this.valor_consulta = valor_consulta;
	}
	
	public double getValor_exames() {
		double valor_exames = 0;
		
		for (int i = 0; i < getExame().size(); i++) {
			valor_exames += getExame().get(i).getPreco();
		}
		
		this.valor_exames = valor_exames;		
		return this.valor_exames;
	}

	public void setValor_exames(double valor_exames) {
		this.valor_exames = valor_exames;
	}

	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}

	public Pacientes getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public OutrosFuncionarios getFuncionario_registrou() {
		return funcionario_registrou;
	}

	public void setFuncionario_registrou(OutrosFuncionarios funcionario_registrou) {
		this.funcionario_registrou = funcionario_registrou;
	}

	public List<Exame> getExame() {
		return exames;
	}

	public void receitarExames(List<Exame> exames) {
		this.exames = exames;
	}
	
	public void adicionarExame(Exame exame) {
		this.exames.add(exame);
	}
	
	public void retirarExame(Exame exame) {
		for (int i = 0; i < this.exames.size(); i++)
			if (exame == this.exames.get(i))
				this.exames.remove(i);
	}
	

}