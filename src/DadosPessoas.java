import java.util.ArrayList;

public class DadosPessoas implements Dados{
	private ArrayList<Pessoa> vetPes = new ArrayList<Pessoa>();
	public void cadastrar(Pessoa c) {
	this.vetPes.add(c);
	System.out.println("Total de pessoas: ");
	System.out.println(this.vetPes.size());
	}
	public void listar(){
	for (Pessoa objeto: this.vetPes) {
		System.out.println(objeto.mostrarDados());
	//método mostrarDados();
	}
	}

	public Pessoa buscar(String cpf) {
	Pessoa c = null;
	for ( Pessoa objeto: this.vetPes) {
	if (objeto.getCpf().equals(cpf)) {
	c = objeto;
	break;
	}
	}
	return c;
	}
	
	public boolean excluir(String cpf){
	Pessoa c = this.buscar(cpf);
	if (c != null) {
	this.vetPes.remove(c);
	return true;
	}
	else {
	return false;
	}
	}
	
	public static void salvar(ArrayList<Pessoa> a) {
		boolean r= Persist.gravar(a,"D:\\pessoas.dat");
		if(r == true)
			System.out.println("Pessoas salvas com sucesso");
	}
}
