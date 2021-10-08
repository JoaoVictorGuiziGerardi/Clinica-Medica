import java.util.List;

public class Medico extends Funcionario {
	private String crm, especialidades_atendidas;
	private List <PlanoSaude> planos_atendidos;
	private List <Consulta> consultas_mes;
	private float somaConsulta;
	public Medico(String nome, String cpf, String rg, String sexo, String est_civil, Endereco endereco, String data_admissao,
			String nro_carteira_trabalho, double salario_base, String usuario, String senha, String crm, String especialidades_atendidas,
			List <PlanoSaude> planos_atendidos) {
		super(nome, cpf, rg, sexo, est_civil, endereco, data_admissao, nro_carteira_trabalho, salario_base, usuario, senha);
		setCrm(crm);
		setEspecialidades_atendidas(especialidades_atendidas);
		setPlanos_atendidos(planos_atendidos);
	}
	
	public Medico(String cpf, List <PlanoSaude> planos_atendidos) {
		super(cpf);
		setPlanos_atendidos(planos_atendidos);
	}
	
	public Medico() {}

	public double calcularSalario() {
		return super.getSalario_base() + somaConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidades_atendidas() {
		return especialidades_atendidas;
	}

	public void setEspecialidades_atendidas(String especialidades_atendidas) {
		this.especialidades_atendidas = especialidades_atendidas;
	}

	public List<PlanoSaude> getPlanos_atendidos() {
		return planos_atendidos;
	}

	public void setPlanos_atendidos(List<PlanoSaude> planos_atendidos) {
		this.planos_atendidos = planos_atendidos;
	}
	
	public void realizaConsulta(Consulta consulta) {
		this.consultas_mes.add(consulta);
		somaConsulta += consulta.getValor_consulta();
	}
	
	public void setConsultas_mes(List<Consulta> consultas_mes) {
		this.consultas_mes = consultas_mes;
	}

	public List<Consulta> getConsultas_mes() {
		return consultas_mes;
	}

	public int getNum_consultas_mes() {
		return getConsultas_mes().size();
	}
	
	public void zeraSomaConsulta() {
		somaConsulta = 0;
	}
	
	public void zeraConsultas() {
		this.consultas_mes.clear();
	}

}