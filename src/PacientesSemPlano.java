
public class PacientesSemPlano extends Pacientes {
	private boolean possui_desconto;
	private double valor_desconto, valor_pago_ultima_consulta;
	
	public PacientesSemPlano(String nome, String cpf, String rg, String sexo, String est_civil, String data_nasc,
			String data_cadastro, Endereco endereco, boolean possui_desconto) {
		super(nome, cpf, rg, sexo, est_civil, data_nasc, data_cadastro, endereco);
		setPossui_desconto(possui_desconto);
	}
	
	public double valor_consulta(Medico medico, double valor_total) {
		if (isPossui_desconto())
			valor_total -= getValor_desconto();
		
		return valor_total;
	}

	public boolean isPossui_desconto() {
		return possui_desconto;
	}

	public void setPossui_desconto(boolean possui_desconto) {
		
		this.possui_desconto = possui_desconto;
	}

	public double getValor_desconto() {
		return valor_desconto;
	}

	public void setValor_desconto(double valor_desconto) {
		if (possui_desconto == true)
			this.valor_desconto = valor_desconto;
		else
			this.valor_desconto = 0;
	}

	public double getValor_pago_ultima_consulta() {
		return valor_pago_ultima_consulta;
	}

	public void setValor_pago_ultima_consulta(double valor_pago_ultima_consulta) {
		this.valor_pago_ultima_consulta = valor_pago_ultima_consulta;
	}	

}
