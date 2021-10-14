import java.util.ArrayList;

public class DadosFuncionario implements Dados {
	private ArrayList<Funcionario> vetFun = new ArrayList<Funcionario>();
	public void cadastrar(Funcionario c) {
	this.vetFun.add(c);
	System.out.println("Total de funcionarios: ");
	System.out.println(this.vetFun.size());
	}
	public void listar(){
	for (Funcionario objeto: this.vetFun) {
		System.out.println(objeto.mostrarDados());
	//método mostrarDados();
	}
	}

	public Funcionario buscar(String cpf) {
	Funcionario c = null;
	for ( Funcionario objeto: this.vetFun) {
	if (objeto.getCpf().equals(cpf)) {
	c = objeto;
	break;
	}
	}
	return c;
	}
	
	public boolean excluir(String cpf){
	Funcionario c = this.buscar(cpf);
	if (c != null) {
	this.vetFun.remove(c);
	return true;
	}
	else {
	return false;
	}
	}
	
	public static void salvar(ArrayList<Funcionario> a) {
		boolean r= Persist.gravar(a,"D:\\funcionarios.dat");
		if(r == true)
			System.out.println("Funcionários salvos com sucesso");
	}
	
}
