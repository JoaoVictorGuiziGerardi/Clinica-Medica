
public abstract class Funcionario extends Pessoa {
	private String data_admissao, nro_carteira_trabalho;
	private double salario_base;
	private String usuario, senha;
	
	public Funcionario(String nome, String cpf, String rg, String sexo, String est_civil, Endereco endereco, String data_admissao,
			String nro_carteira_trabalho, double salario_base, String usuario, String senha) {
		super(nome, cpf, rg, sexo, est_civil, endereco);
		setData_admissao(data_admissao);
		setNro_carteira_trabalho(nro_carteira_trabalho);
		setSalario_base(salario_base);
		setUsuario(usuario);
		setSenha(senha);
	}

	public Funcionario(String cpf) {
		super(cpf);
	}
	
	public Funcionario() {}
	
	public abstract double calcularSalario();

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}

	public String getNro_carteira_trabalho() {
		return nro_carteira_trabalho;
	}

	public void setNro_carteira_trabalho(String nro_carteira_trabalho) {
		if (nro_carteira_trabalho.length() > 0)
		this.nro_carteira_trabalho = nro_carteira_trabalho;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		if (salario_base >= 0)
			this.salario_base = salario_base;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		if (usuario.length() > 0)
		this.usuario = usuario;
	}
	
	public void setUsuario(String usuario, String senha) {
		if (this.senha.contentEquals(senha))
			this.usuario = usuario;
		else
			return;
	}

	private void setSenha(String senha) {
		if (senha.length() > 0 && senha.length()<= 128)
			this.senha = senha;
	}
	
	public void setSenha(String senha_nova, String senha_antiga) {
		if (this.senha.equals(senha_antiga) && senha_nova.length() > 0 && senha_nova.length() <= 128)
			this.senha = senha_nova;
		else
			return;
	}

}