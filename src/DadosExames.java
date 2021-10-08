import java.util.ArrayList;

public class DadosExames {
	private ArrayList<Exame> vetExam = new ArrayList<Exame>();
	public void cadastrar(Exame c) {
	this.vetExam.add(c);
	System.out.println("Total de exames: ");
	System.out.println(this.vetExam.size());
	}
	public void listar(){
	for (Exame objeto: this.vetExam) {
	//objeto.mostrarDados();
	//método mostrarDados();
	}
	}

	public Exame buscar(String nome) {
	Exame c = null;
	for ( Exame objeto: this.vetExam) {
	if (objeto.getNome().equals(nome)) {
	c = objeto;
	break;
	}
	}
	return c;
	}
	
	public boolean excluir(String nome){
	Exame c = this.buscar(nome);
	if (c != null) {
	this.vetExam.remove(c);
	return true;
	}
	else {
	return false;
	}
	}
	
	public static void salvar(ArrayList<Exame> a) {
		boolean r= Persist.gravar(a,"D:\\exames.dat");
		if(r == true)
			System.out.println("Exames salvos com sucesso");
	}
}
