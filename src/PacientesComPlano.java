
public class PacientesComPlano extends Pacientes {
	private PlanoSaude plano;
	private String nro_carteirinha, data_ingresso_plano;
	private boolean periodo_carencia;
	
	public PacientesComPlano(String nome, String cpf, String rg, String sexo, String est_civil, String data_nasc,
			String data_cadastro, Endereco endereco, PlanoSaude plano, String nro_carteirinha, String data_ingresso_plano, boolean periodo_carencia) {
		super(nome, cpf, rg, sexo, est_civil, data_nasc, data_cadastro, endereco);
		setPlano(plano);
		setNro_carteirinha(nro_carteirinha);
		setData_ingresso_plano(data_ingresso_plano);
		setPeriodo_carencia(periodo_carencia);
	}
	
	public PlanoSaude getPlano() {
		return plano;
	}

	public void setPlano(PlanoSaude plano) {
		this.plano = plano;
	}

	public String getNro_carteirinha() {
		return nro_carteirinha;
	}

	public void setNro_carteirinha(String nro_carteirinha) {
		if (nro_carteirinha.length() > 0)
		this.nro_carteirinha = nro_carteirinha;
	}

	public String getData_ingresso_plano() {
		return data_ingresso_plano;
	}

	public void setData_ingresso_plano(String data_ingresso_plano) {
		if (data_ingresso_plano.length() > 0)
		this.data_ingresso_plano = data_ingresso_plano;
	}

	public boolean getPeriodo_carencia() {
		return periodo_carencia;
	}

	public void setPeriodo_carencia(boolean periodo_carencia) {
		this.periodo_carencia = periodo_carencia;
	}	
	

}
